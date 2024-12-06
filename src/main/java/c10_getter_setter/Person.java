package c10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    //private를 걸면 같은 클래스 안에서만 사용할 수 있다.

    // 기본 생성자, 매개변수 생성자들 전부 만들어보세요.
    // PersonMain.java에서 해당 객체들을 만드세요
    // Person person1 = new person();
    // Person person2 = new person("여러분이름");
    // Person person3 = new person(-100);
    // Person person4 = new person("사실 나는 사람이 아니다",1000);

    //생성자 정리
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 및 Getter 정의
    // set변수명() / get변수명() 으로 사용하는 편

    // 1. 외부에서 필드에 직접 접근하지 못하도록 접근지정자를 설정함

    // 2.  Setter의 구조
    //      메서드에 매개변수가 필수적으로 요구됨 -> 값을 변경하거나 대입할 argument가 필요하기 때문

    public void setName(String newName){
        this.name = newName;
    }

    // 3. Getter 의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨.
    //      대신 필드와 동일한 자료형의 return 값이 요구됨 -> void가 아니다.
    public String getName(){
        return name;    //name을 반환
    }
    // setAge와 getAge를 정의하고
    // person3의 age를 20으로 변경하고,
    // person4의 name을 김삼, age를 30으로 변경한 후, 바뀐 필드들만 콘솔에 출력하시오.
    public void setAge(int age){
        //메서드 내에서 사용할 클래스를 import

        // method이기 때문에 {} 내부에 코드를 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음
        // 조건문을 적용을 해서 0 이상의 값만 입력이 가능하게끔 코드를 작성하면 됩니다
        // 시작하세요
        // 다 하신 분들은 150 미만의 값만 입력되게끔 코드를 추가해주세요.

//        if (age >= 0) {
//            // 중첩 if문 사용
//            if(age<150){
//                this.age =age;
//            }else{
//                System.out.println("다시 입력하세요.");
//            }
//        }

        // 중첩 if 문을 줄이기 위한 && 연산자 사용
        // -> 여기에 while문을 붙여서 올바른 값만 입력하세끔 코드를 작성하시오.
//        if (age >= 0 && age <150) {
//            this.age = age;
//        }else{
//            System.out.println("다시 입력하세요.");
//        }

//        while( flag1 ){
//            if (age >= 0 && age <150){
//                this.age=age;
//                flag1 = false;
//            }
//        }

//        if(age<0){
//            System.out.println("다시 입력하세요.");
//        }else {
//            this.age =age;
//        }

        Scanner scanner = new Scanner(System.in);

//        age >=0 && age < 150 범위의 반대는 어떻게 될까? -> 값이 잘못됐을 때
        //반복문이 실행되야 하므로 반대 범위를 산출해냈음

                while( age < 0 || age >= 150 ) {
                    System.out.print("나이는 0 이상 150 미만이어야만 합니다. 다시 입력하세요 >>> ");
                    age = scanner.nextInt();     // argument로 age를 받았지만,
                }                              // 값이 적절하지 않기 때문에 재 입력을 받아서
                this.age=age;                   // age에 '재'대입하는 과정이 필요
        System.out.println("나이가 정상적으로 업데이트 되었습니다.");





    }

    public int getAge() {
        return age;
    }



}
