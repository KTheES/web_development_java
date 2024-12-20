package c19_generic.wildcards.wildcard_practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car{
    private String model;

    // 만약 논리적인 상속 관계를 무시하고 AnimalData에서 Car의 객체를
    // 생성하고 싶다면
    // public class Car extends Animal로 작성하시고
    // move() 메서드를 오버라이드 하면 가능하긴 합니다.
//    @Override
//    public void move() {
//        System.out.println("차가 굴러갑니다.")
//    }
}
//다하셨으면 Main.java로 넘어가세요