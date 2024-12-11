package c14_abstraction.interfaces;
/*
    아까전에 Button 클래스의 경우에는 인터페이스를 다중 상속 받았습니다.
    즉 Press, Up, Down이 가지고 있는 각각의 특징을 Button 클래스에 모아놨다고 볼 수 있습니다.
    이를 PowerButton, ChannelUpButton, ChannelDownButton 등으로 나누어 각각 Button 클래스를
    상속하도록 작성할 예정입니다.
 */
public class PowerButton extends Button{

    private boolean status;

    @Override
    public void onDown(){

    }
    @Override
    public void onUp(){

    }
    @Override
    public void onPressed(){
        if(status){                 // 25라인이 실행되기 위해서는 status =true여야만 하므로
            status =false;          // if 문 내에는 전원을 끄는 명령어가 삽입되어야 함.
            System.out.println("전원을 꺼졌습니다.");
        }else{
            status =true;
            System.out.println("전원이 켜졌습니다.");
        }
    }

}
