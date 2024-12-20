package c20_collections.students;

import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        // students라는 Set을 만드세요.
        Set<Student> students = new HashSet<>();

        // Set 내부에 데이터를 입력하세요.
        /*
            20250001    강미경
            20250002    권상재
            20250003    김은수
            20250004    박수빈
            20250006    이승혁
         */

        students.add(new Student(20250001,"강미경"));
        students.add(new Student(20250002,"권상재"));
        students.add(new Student(20250003,"김은수"));
        students.add(new Student(20250004,"박수빈"));
        students.add(new Student(20250005,"이승혁"));
        // 전체 set을 출력하세요.
        System.out.println(students);

        // 정렬을 하기 위해 List를 선언하세요 -> studentList
        List<Student> studentList = new ArrayList<>();

        //비어있는 List에 Set의 값들을 전부 대입하세요.
        studentList.addAll(students);

        //20250001 학번을 지닌 학생 객체를 Set에서 삭제하세요.

        //20250002 학번을 지닌 학생의 이름을 이진혁 으로 바꾸세요.
        //20250003 학번을 지닌 학생의 이름을 출력하세요.
        // 박수빈님의 학번을 출력하세요.

        for(Student student : studentList){
            if(student.getId() == 20250001){
                students.remove(students);
            } else if ( student.getId() ==20250002) {
                student.setName("이진혁");
            } else if (student.getId() ==20250003) {
                System.out.println(student);
            } else if (student.getName().equals("박수빈")) {
                System.out.println(student.getName()+"학생의 학번 : "+student.getId());
            }
        }

        //이상의 코드에서 지시사항들을 마무리하고, 다시 Set으로 형변환을 시켜주면 됩니다.
        students.addAll(studentList);
        System.out.println("list 출력 : "+studentList);
        System.out.println("Set 출력 : "+students);
        // 이상의 코드에서 Student(id =20250002,name :이진혁)가 중복으로 나왔던 점을 알 수 있습니다.
        // 이것은 참조자료형이기 때문에 생겨날 수 있는 문제로 테스트 전까지 확인을 할 수 없는 부분이기도 합니다.

        //그렇다면 중복이 보기 싫으면 어떡하면 될까요?
        // 비어있는 Set 하나 다시 선언해서 거기다가 studentList의 데이터를 다 넣으면 됩니다, 예를 들어
        // students2.addAll(studentList) 형태로 하면 중복 없이 데이터가 저장될 겁니다.

        //혹은 students.clear()를 이용하여 비워내는 방법이 있습니다.
        students.clear();
        students.addAll(studentList);
        System.out.println("재대입 set : "+students);

        //List에서 오름차순으로 정렬하세요.
        // 정렬된 List를 출력하세요.


        //정렬이 적용된 list를 하나 선언하겠습니다.
        //순서를 정렬할 int 하나 선언하겠습니다
        int orderId =20250000;
        List<Student> sortedStudents = new ArrayList<>();
        for(int i=0 ;i< students.size(); i++) {      //size는 set의 사이즈대로 반복
            orderId++;
            for(Student student :students){
                if(student.getId() == orderId){     //객체의 필드인 id가 20250001부터 해서 오름차순 정렬
                    sortedStudents.add(student);    // 해당 실행문이 실행됐다면 위의 조건문이 true를 의미
                                                    // 하기 때문에 순서대로 list에 저장될 예정입니다.
                }
            }
        }
        System.out.println("정렬된 list : "+sortedStudents);

        //기존의 정렬되지 않은, 그리고 중복이 남아있는 list와 set에 정렬된 것들만 남기고 싶다면
        // .deleteAll() 을 사용해서 다 비워내고, 다시 재 대입하시면 됩니다.




    }
}
