package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    // AllArgsConstructor 를 정의하세요.

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
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

    //VolumeDownButton 메서드

    public void onUpVolumeUpButton(){
        volumeUpButton.onUp();
    }
    public void onPressVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onPressVolumeDownButton(){
        volumeDownButton.onPressed();
    }
    //VolumeUpButton 메서드
    //AllArgsConstructor
    public RemoteController(VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton){
        this.volumeDownButton= volumeDownButton;
        this.volumeUpButton= volumeUpButton;
    }









}
