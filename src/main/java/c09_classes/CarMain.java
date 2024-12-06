package c09_classes;

public class CarMain {
    public static void main(String[] args) {
        //클래스명 객체명 = new 클래스명();
        Car myCar = new Car();
        Car yourCar = new Car();    //객체를 미리 두 개 생성함.

        myCar.color ="빨강";          //myCar.찍으면 자동완성으로 f color로 나오는데 field의 축약어입니다.
        yourCar.color ="노랑";

        myCar.drive();              //myCar.  찍으면 자동완성으로 m drive로 나오는데, method의 축약어입니다.
        yourCar.stop();





    }
}
