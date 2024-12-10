package c13_inheritance;
/*
    Tiger.java에서처럼
    생성자 및 setter /getter 를 작성하시고 -> 상속 받은 상태에서 작성하셔야 합니다,
    Animal 클래스의 move 메서드를 override 받아서 " 두 발로 걷습니다"를 출력할 수 있도록 '재정의'gktlrh
    Main.java에서

    human1 객체를 생성하고 setter를 이용, 여러분의 이름과 나이를 입력하시오,
    human1.move()메서드를 실행시키세요.

    실행 예
    움직입니다.
    두 발로 걷습니다.
 */
public class Human extends Animal {
    public Human() {
        System.out.println("사람이 생성되었습니다.");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    // setter /getter /move 메서드 오버라이드
    @Override
    public void move(){
        System.out.println("두 발로 걷습니다.");
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }
}