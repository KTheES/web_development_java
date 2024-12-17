package c18_static.singleton;

import lombok.AllArgsConstructor;

/*
    싱글톤 패턴(Singleton Pattern)
        : 소프트웨어 '디자인 패턴' 중 하나로, 어떤 클래스가 하나의 인스턴스만 갖도록 보장하고,
        그 인스턴스에 접근할 수 있는 전역적인 접근법을 제공하는 패턴. 예를 들아, 데이터베이스 연결과 같은
        리소스는 프로그램 전체에서 하나의 인스턴스만 사용해야 할 때가 많기 때문에 싱글톤 패턴이 유용함.
    싱글톤 패턴의 특징
        1. 하나의 인스턴스만 존재: 하나의 인스턴스만 생성되고, 이 인스턴스는 프로그램이 실행되는 동안 유지
        2. 전역 접근법 : 싱글톤 인스턴스는 '정적(static) 메서드'를 통하여 어디서든 접근할 수 있음.
            -> 객체명.메서드명()x /클래스명.메서드명() o
        3.인스턴스의 생명 주기 관리 : 클래스 자체가 인스턴스 생성을 관리하므로, 다른 객체들이 직접
            인스턴스를 생성하거나 폐기할 수 없음.

    싱글톤 패턴의 장점 :
        1. 메모리 절양: 불필요한 인스턴스 생성을 방지하여 메모리를 절약할 수 있음.
        2.글로벌(전역적)접근 : 전역적으로 접근할 수 있어 관리가 용이 -> 하지만 잦은 접근 자체는 단점
        3. 일관성 유지 : 애플리케이션 전반에서 하나의 인스턴스만 사용하기 때문에 상태 일관성을 유지

    싱글톤 패턴의 단점 :
        1. 테스트 어려움 : 싱글톤 패턴은 전역적으로 사용되므로 단위 테스트가 어려울 수 있음.
        2. 의존성 숨김 : 싱글톤을 남용하면 클래스 간의 의존성을 추적하기 어려울 수 있음 -> 신중히 사용하세요

    다 되신 분들은 Samsung.java,  /SmartPhone.java 클래스 생성
 */
@AllArgsConstructor
public class Factory {
    //필드 선언
    private String factoryName;

    //생성자 정의 부분 필요 없음 -> 애너테이션 때문에

    //메서드 정의 -> 이제 중요한 점은 return 타입이 String, int 이런게 아니라
    //저희가 수업 중에 정의한 클래스라는 점입니다. -> 싱글톤에서도 했습니다 Samsung.java 확인
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시S";
        String serial = null;

        // 싱글톤 패턴이 적용된 Samsung 인스턴스를 가지고 오기
        Samsung samsung = Samsung.getInstance();    //-> produceSmartphone()을 처음 실행할 떄서야
        // 처음 Samsung 클래스의 인스턴스가 하나 만들어짐
        // 이후 두 번째 produceSmartPhone()을 실행할 때는
        //이미 만들어진 instance가 반환됨.
        serial = samsung.createSerialNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        // samsung.을 치게 될 경우 자동완성으로 getCompany()가 있습니다.
        //그 이유는 samsung.java를 확인했을 때 company 필드에만 @Getter 가 적용돼있고
        //serialNumber에는 @Getter가 없었기 때문입니다. 즉 매번 클래스 단위에 있던 @Data 애너테이션을
        //적용하는 방식은 비효율적이고 코드 가독성을 떨어트릴 수 있어 명확한 설계 하에 코딩을 할 필요가 있습니다.
        return smartPhone;
    }
}