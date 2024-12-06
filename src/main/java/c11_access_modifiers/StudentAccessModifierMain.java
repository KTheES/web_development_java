package c11_access_modifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        //객체 생성을 기본 생성자를 통해서 할 것
        StudentAccessModifier student1 = new StudentAccessModifier();

        // setter를 통해서 데이터 입력
        student1.setStudentCode(20241205);
        student1.setStudentName("김은수");
        student1.setStudentAvg(100.0);

        // .showInfo() 메서드를 통해서 객체 정보 출력
        student1.showInfo();

        //새로운 객체를 student01로 생성하는데, 생성 시에 이름을 "여러분이름"으로 만들어주세요
        //클래스명 객체명 = new 매개변수생성자("여러분이름")
        StudentAccessModifier student01 = new StudentAccessModifier("김은수");

        // 점수는 4.5 , 학번은 10101로 입력하세요    -> 아직 없는 값에 데이터 대입
        student01.setStudentAvg(4.5);
        student01.setStudentCode(10101);
        //"여러분이름"을 "이일"로 고치세요.          -> 기존에 있는 값에 데이터 재 대입
        student01.setStudentName("이일");

        // 고친 이름을 콘솔창에서 확인하기 위해 getter를 사용하세요       -> return으로 정의돼있어 출력문을 명시해야 함.
        System.out.println(student01.getStudentName());

        //이름이 "이일"로 고쳐졌다면, .showInfo()를 통해 전체 정보를 콘솔에 출력하세요
        // showInfo()의 경우 메서드 내에 sout으로 처리했기 때문에 getter 정보를 출력할 때와
        // 코드가 다릅니다. 주의하시기 바랍니다.
        student01.showInfo();

        //다하신 분들은 새로운 패키지를 만들어주세요 c12_arrays -> class ArrayTest01로 만들어주세요

    }
}
