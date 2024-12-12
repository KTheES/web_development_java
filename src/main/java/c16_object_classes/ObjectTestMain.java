package c16_object_classes;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("안근수","부산광역시 연제구");
//        objectTest1.displayInfo();
//
//        //여기서 어떻게 해가지고 실행해보세요
//        System.out.println(objectTest1.showInfo());

        //객체 그 자체를 sout 시켰을 때
        System.out.println(objectTest1);
        // 이상과 같이 작성했을 때 현재 (1212_2118기준) 으로는 참조자료형이기 때문에 주소값만 나옵니다.

        System.out.println(objectTest1.toString());






    }
}
