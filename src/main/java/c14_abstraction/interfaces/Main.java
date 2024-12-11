package c14_abstraction.interfaces;
/*
    인터페이스(interface)
            인터페이스는 자바에서 클래스가 구현해야 하는 '메서드'들의 집합을 정의하는 일종의 규약(protocol)
            인터페이스는 메서드의 시그니처(메서드 이름, 리턴 타입, 매개변수 목록) 만을 포함하며, 메서드의 실제
                구현은 포함하지 않음 -> 마치 추상메서드와 비슷해 보입니다
            다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음 :
                일반 클래스의 경우 하나의 클래스만 상속 가능


    특징
          1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드 -> 즉, 메서드의 정의만 있고
            구현은 없다.

          2. 상수 : 인터페이스 내에서 선언된 변수는 '자동으로' public static final 상수로 취급됨.

          3. 다중상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

       추상 클래스와의 공통점
            -모두 추상 메서드를 포함할 수 있고, 서브 클래스 / 구현 클래스에서 이를 구현해야 한다.

            추상 클래스와의 차이점
            - 추상 클래스
            1. 부분 구현 허용 : 추상 클래스는 추상 메서드 뿐만이 아니라 일반 메서드(구현이 포함된 메서드) 도
                포함할 수 있다.
            2. 상태 저장 가능 : 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
            3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
            4. 생상저 : 추상 클래스는 생성자를 가질 수 있다.
            5. 다양한 접근 제어자 (Access Modifier) : 추상 클래스의 메서드와 변수는 다양한 접근 제어자
                (public, protected, private)를 가질 수 있다.

            - 인터페이스
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드이다,.
                    Java 8이후에 . default, static 메서드를 사용할 수 있긴 합니다.
                2.인터페이스는 인스턴스 변수(필드 중 객체마다 값이 달라지는 변수)를 가질 수 없고, 상수만 선언 가능
                3. 다중 상속: 클래스는 여러 인터페이스를 구현할 수 있다,.
                4. 생성자 없음 : 인터페이스는 생성자를 가질 수 없다. -> 일단 멤버 변수(인스턴스 변수)에서 없기
                    때문에 생성자 생성 불가능 -> 객체마다 다른 값을 가질 수 없다는 의미가 됩니다.
                5. 자동 public : 인터페이스의 메서드들은 자동으로 public이며, 메서드 선언에 접근 제어자를 명시 할 수 있습니다.
                    Java 8이후에 . default, static 메서드를 사용할 수 있긴 합니다.
 */
public class Main {
    public static void main(String[] args) {

        //RemoteController의 객체 생성
        /*
            RemoteController remoteController = new RemoteController();까지
            입력했을 경우 RemoteController.java 내부에 생성자는
            AllArgsConstructor이므로 오류가 생깁니다.
            그렇다면 내부에 들어가야 할 매개변수를 채워야 할 필요가 있습니다.

            여기서 여태까지와 다른 방식으로 argument를 채워넣기 때문에 유의해야 합니다

            구조를 이해하셔야 합니다!!!
            RemoteController의 객체를 생성했는데, 그 객체 이름이 remoteController입니다.
            클래스1명 객체명 = new 생성자(argument1,argument2, ...)
            클래스1명 객체명 = new 클래스1명(new 클래스2명, new 클래스3명)

            이상의 경우 new 클래스2명(), new 클래스3명()을 통해 객체 생성은 이미 완료가 되었습니다,
            다만, 여태까지와의 차이점은 new 클래스2명(), new 클래스3명()에 해당하는 객체명이 없을 뿐입니다.
         */
//        RemoteController remoteController = new RemoteController(new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),new VolumeUpButton(),new VolumeDownButton());
//
//        remoteController.onPressedPowerButton();
//        remoteController.onPressedPowerButton();
//
//        remoteController.onDownChannelDownButton();
//        remoteController.onPressChannelDownButton();
//        remoteController.onUpChannelUpButton();
//        remoteController.onPressChannelUpButton();
//
//        remoteController.onUpVolumeUpButton();
//        remoteController.onPressVolumeUpButton();
//        System.out.println();
//        remoteController.onDownVolumeDownButton();
//        remoteController.onPressVolumeDownButton();


        //AirconditionerController 객체 생성

        System.out.println();

        AirConditionerController airConditionerController= new AirConditionerController(new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton());

        airConditionerController.PowerButton();
        airConditionerController.PowerButton();
        System.out.println();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressTemperatureDownButton();
        System.out.println();
        airConditionerController.onUpTemperatureUpButton();
        airConditionerController.onPressTemperatureUpButton();




    }
}
/*
    1.VolumeDownButton, VolumeUpButton 클래스를 만들고 method들 구현하세요.
    2. RemoteController.java의 필드에 위에서 만든 클래스들의 객체를 추가하시오.
    3. RemoteController.java의 AllArgsConstructor를 만족하기 위해 생성자를 수정하시오.
    4. VolumeDownButton, VolumeUpButton에 있는 메서드들을 RemoteController.java에 재구현하시오.
    5. Main으로 넘어와서 볼륨 한 칸 내리기, 계속 내리기, 한 칸 올리기, 계속 올리기를 실행하세요

    추가 과제

    온도 조절 버튼과 에어컨 리모콘 구현하기

    TemperatureDownButton, TemparatureUpButton, AirconditionerController.java 클래스들을 만들어서
    MaIN에 AirconditionerController의 객체를 생성한 후

    전원이 켜졌습니다.
    전원이 꺼졌습니다.

    온도를 한 칸 내립니다.
    온도를 계속 내립니다.

    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
 */








