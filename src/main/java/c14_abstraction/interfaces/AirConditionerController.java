package c14_abstraction.interfaces;

public class AirConditionerController {

    //필드 선언
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private PowerButton powerButton;

    //AllArgsConstructor

    public AirConditionerController(PowerButton powerButton,TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.powerButton =powerButton;
    }

    // 메서드 정의
    public void PowerButton() {
         powerButton.onPressed();
    }
//TemperatureDown
    public void onDownTemperatureDownButton(){
        temperatureDownButton.onDown();
    }

    public void onPressTemperatureDownButton(){
        temperatureDownButton.onPressed();
    }
//TemperatureUp
    public void onUpTemperatureUpButton(){
        temperatureUpButton.onUp();
    }

    public void onPressTemperatureUpButton(){
        temperatureUpButton.onPressed();
    }

}
