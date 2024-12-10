package c13_inheritance;

public class Animal {
    //필드 선언
    String animalName;
    int animalAge;

    //생성자 하나하나 정의하세요




    public Animal() {}

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    //setter /getter 하나하나 정의하세요

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }
    //메서드 선언
    public void move(){
        System.out.println("움직입니다.");
    }


}