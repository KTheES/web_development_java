package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    //추가된 필드
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;      //이 필드들을 추가하는 순간에 AllArgsConstructor가 아님
    //그렇기 때문에 밑에 있는 생성자를 수정할 필요가 있음.


    // AllArgsConstructor 를 정의하세요.
    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton,VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        //소괄호 내에 매개변수를 수정했기 떄문에 이하의 코드가 필요함
        this.volumeDownButton= volumeDownButton;
        this.volumeUpButton= volumeUpButton;
        //마찬가지로 이걸 완성하는 순간 Main단계에서 오류가 발생함 -> 아까전에는Main이 AllArgs를 만족했으니
        //이젠 아니기 때문
    }
    //메서드 정의
    //PowerButton의 메서드 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
                                        // PowerButton 클래스에서 정의했던 메서드를 호출 가능
    }

    // ChannelDownButton의 메서드 구현    -> 메서드 두개씩입니다.
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }
    public void onPressChannelDownButton(){
        channelDownButton.onPressed();
    }

    // ChannelUpButton의 메서드 구현
    public void onUpChannelUpButton(){
        channelUpButton.onUp();

    }
    public void onPressChannelUpButton(){
        channelUpButton.onPressed();

    }

//VolumeUpButton 메서드
    public void onUpVolumeUpButton(){
        volumeUpButton.onUp();
    }
    public void onPressVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    //VolumeDownButton 메서드
    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onPressVolumeDownButton() {
        volumeDownButton.onPressed();
    }








}
