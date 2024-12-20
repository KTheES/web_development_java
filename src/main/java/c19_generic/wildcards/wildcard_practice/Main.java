package c19_generic.wildcards.wildcard_practice;

public class Main {

    //여기서 와일드카드 적용할겁니다
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag ==2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
//        else if (flag ==3) {
//            AnimalData<Car> animalData = new AnimalData<>(new Car("셀토스"));
//            return animalData;
//
//        }
        /*
            flag == 3 부분이 적용되지 않는 이유는 Car 클래스는 추상 클래스인 Animal의
            상속을 받지 않았기 때문에 <? extends Animal>이 성립되지 않기 때문에
            작성 자체가 불가능함. -> 6번 라인이 성립하지 않았습니다.
         */
        return null;    //flag가 1,2가 아닌 경우에 null 반환하겠다는 의미
    }

    public static void main(String[] args) {
        Main main = new Main(); //Main.java의 객체 생성 -> main method위에
        //정의한 getAnimal() 메서드를 실행하기 위해서
        // 객체를 생성할 필요가 있음
        AnimalData<?extends Animal> animalData1 =main.getAnimal(1);
        //이상의 코드의 의미 -> Human 객체를 생성해 animalData1에 대입하겠다.
        AnimalData<?extends Animal> animalData2 =main.getAnimal(2);


        if(animalData1 != null){
            animalData1.printData();
        }
        if(animalData2 != null){
            animalData2.printData();
        }




    }
}