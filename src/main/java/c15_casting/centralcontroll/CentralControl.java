package c15_casting.centralcontroll;

import java.util.Arrays;

public class CentralControl {

    // 필드 선언
    private Power[] deviceArray ;      //필드를 배열로 선언한 경우가 처음이기 때문에
                                        // 좀 주목해서 보도록 하겠습니다.

    // 매개변수 생성자 만드세요
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    //Main에 각 클래스의 객체들을 하나씩 생성하세요 -> CentralControl 제외
    // Computer computer1 = new Computer()

    // 전자 제품들을 CentralControl의 객체의 필드인 배열에 추가해주는 메서드
    public void addDevice(Power device){
        //checkEmpty(); 는 좀 있다가 정의할 예정입니다, ->
        // 개발 환경에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있어
        // 일부러 checkEmpty() 를 먼저 작성한 후 addDevice()를 작성하는 게 아니라
        // 순서를 지금과 같이 하게 되었습니다.

        int emptyIndex = checkEmpty();  //checkEmpty()의 리턴값이 addDevice에서 이욛되는 '함수형 프로그래밍'

        if(emptyIndex == -1){       // java에서는 마이너스인덱스 개념이 없기 때문에 checkEmpty()
                                    //메서드에서 -1 을 반환시킨 이유는
                                    //비어있는 배열이 없다는 의미이기 때문에 다음과 같이 작성했습니다.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;                 //해당 메서드를 종료한다는 의미로 return;을 사용함. ';'에 주목
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName());
        // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력됨
        //객체명.getClass().getSimpleName() -> 클래스명만 출력
    }
    public int checkEmpty(){    // 비어있는 배열의 index를 반환할 거기 때문에
                                // 그리고 그 비어있는 배열의 index에 addDevice()를 통해
                                // 새로운 전자 제품을 등록하는 방식으로 코딩할 예정
        //배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        for(int i =0 ; i<deviceArray.length;i++){
            if(deviceArray[i] == null){     //deviceArray[i]에 값이 없다면
                return i;
            }
        }
        return -1;
    }

    //배열 내부에 있는 elements들의 전원을 전부 켜고, 끄는 메서드를 구현
    public void powerOn(){
        //배열 내부에 있는 요소들(객체들 - Power의 자식 클래스들의 객체)의 공통된 메서드인 .on()을
        //실행시킬 예정입니다.
        //해당 경우에 생겨날 수 있는 문제점 :
        //  특정 배열 인덱스 내에 아무 객체가 없다면 .on()을 적용시켰을 경우 컴파일 에러가 나기
        //  때문에 해당 부분을 감안한 코드를 작성합니다.
        for(int i =0 ; i<deviceArray.length;i++){
            if(deviceArray[i]==null){
                //특정 인덱스 넘버의 element가 null값이라면
                continue;       // 해당 반복문 파트는 종료하고 다음 반복문 인덱스로 넘기겠다는 의미
            }
            deviceArray[i].on();        //continue가 실행되지 않았다면 해당 라인의 코드가
                                        //실행되도록 작성
        }
    }

    //전원 버튼을 끄는 메서드 powerOff()를 구현하세요
    public void powerOff(){
        //반복문 돌면서 비어있으면 지나가고, 아니면 꺼야 함.
        for(int i =0; i< deviceArray.length;i++){
            if (deviceArray[i] == null) {
                continue;
            }
            deviceArray[i].off();       //공통된 메서드
        }
    }

    // 향상된 for문을 이용하여 powerOff2() 메서드를 구현하시오. -> 이후 Main에서 powerOff()메서드 실행하세요.
    public void powerOff2() {
        //자료형 변수명(객체명) : 반복가능객체(배열)
        for (Power device : deviceArray) {       //deviceArray라는 배열의 각 요소에 device 라는 객체명을 임시로 붙임
            if (device == null) {
                continue;
            }
            device.off();
        }
    }


    //displayInfo()에 해당하는 메서드를 작성해야 함. -> 배열의 요소를 하나씩 뽑아내는 것도 가능하고, 배열 전체를 출력하셔도 됩니다.

    //코드 내부에 sout을 구현하겠다는 의미가 되겠죠 -> 뭘 보면? void
//    public void displayInfo(){
        //내부에 sout 구현
        //배열이 가득차지 않았을 경우를 대비해야 함.
        //각 요소들을 하나씩 뽑게 될 예정인데 그 경우 null 값을 만나게 되면 컴파일 오류가 생기기 때문
        // 배열 내부의 요소를 하나씪 뽑게 되는 방식이 뭐였는지 떠올리셔야 됩니다.
//        for(int i =0 ; i< deviceArray.length ;i++){
//            if(deviceArray[i]==null) {  //index가 비어있을 시 컴파일 오류가 생김
//                continue;               // continue로 비어있는 인덱스 뺴고 실행
//            }
//            System.out.println(deviceArray[i].getClass().getSimpleName() + " ");
//            // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력됨
//            //객체명.getClass().getSimpleName() -> 클래스명만 출력
//        }
//    }

    // 강사님 public void displayInfo2()
    public void displayInfo2(){
        System.out.println("현재 연결된 장치 목록 : ");
        //각 요소를 하나씩 뽑기 위한 반복문 작성
        for(int i =0 ; i< deviceArray.length;i++){
            //혹시 null이 있는지 확인하기 위한 조건문 작성
            if(deviceArray[i]==null){
                System.out.println("슬롯["+i+"]번 : 비어있음" );
                continue;       //현재 반복을 종료하고 i++시킨 다음 반복문으로 넘어가라는 의미
            }

            System.out.println("슬롯["+i+"]번 : "+deviceArray[i].getClass().getSimpleName());
        }
    }

    public void displayInfo3(){
        //배열 전체를 출력하는 메서드
        System.out.println("현재 연결된 장치 목록 : ");
            System.out.println(Arrays.toString(deviceArray));
    }

    //배열 내부를 돌면서 요소의 고유 메서드들을 호출하는 예제 메서드

    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Computer){
                // devideArray 내부에 있는 요소라면 기본적으로 Power 인터페이스의 객체
                // (그런데 인터페이스는 객체 생성 불가능)이거나 혹은
                // Power 인터페이스를 상속 받은 클래스의 객체에 해당합니다.
                // 이상의 코드는 배열 내부의 요소가 Computer 클래스의 인스턴스라면 다운 캐스팅을 실행
                Computer computer =(Computer) device; // 실행이 된다면 Computer 클래스로 다운캐스팅
                // 이제 객체명 computer는 Computer 클래스의 인스턴스이므로 Computer 클래스에 정의된
                // 고유 메서드를 실행 가능
                computer.compute();
            } else if (device instanceof Mouse) {
                Mouse mouse =(Mouse) device;
                mouse.leftClick(); // LED 클래스에 changeColor() 메서드를 정의하고
                                    // sout("색깔을 바꿉니다")라고 한 후에 다운 캐스팅을 하세요.
            } else if (device instanceof LED) {
                LED led =(LED) device;
                led.changeColor();
            }   //이상의 코드가 지시사항 2번 -> Main으로 가셔야합니다.

        }

    }











}
