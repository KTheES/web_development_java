package c18_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone(); //또 새로운 방식으로 객체 생성하였습니댜..
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        //smartPhone1의 경우 SmartPhone 클래스의 객체인데(참조자료형인데), 왜 sout(smartPhone1)했는데
        //주소값이 아니라 필드가 다 튀어나올까요? -> SmartPhone 클래스의 @ToString 애너테이션 떄문에
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);

    }
}