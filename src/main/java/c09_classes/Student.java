package c09_classes;
/*
    학번,이름,점수(A,B,C,D,E) field를 선언합니다.
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수로 하는 생성자
    점수를 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A등급
 */
public class Student {
    //필드 선언
    int classNumber;
    String name;
    String score;
    //생성자 선언
    Student(){}

    Student(int classNumber){
        this.classNumber = classNumber;
    }

    Student(String name){
        this.name = name;
    }// String은 중복되면 생성자가 구분을 못 해 오류가 생긴다.

    Student(int classNumber, String name, String score){
        this.classNumber =classNumber;
        this.name = name;
        this.score = score;
    }
    //showInfo() 선언
    void showInfo(){
        System.out.println("학번 : "+classNumber+"\n이름 : "+ name +"\n점수 : "+score+"등급");

    }

}
