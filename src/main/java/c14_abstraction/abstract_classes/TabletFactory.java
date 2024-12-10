package c14_abstraction.abstract_classes;

public class TabletFactory extends Factory{
    //생성자
    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {     //추상메서드 재정의
        System.out.println("[ "+model +" ] 모델 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }
}
