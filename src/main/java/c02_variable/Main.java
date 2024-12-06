package c02_variable;
/*
    c02_variable 패키지 생성 -> 패키지 우클릭 new -> java class 클릭 -> Main.java
 */
public class Main {
    public static void main(String[] args) {
        /*
            변수(variable) : 데이터를 담을 수 있는 바구니
         */
        //1. 논리 자료형(boolean) 변수      : 참 / 거짓
//        boolean checkFlag = false; // or true
//       자료형    변수명  = 데이터;          변수 선언 및 초기화
//        System.out.println(checkFlag);
        // Java에서의 변수 표기법 -> 카멜 표기법 (Camel Case) : 첫문자는 소문자로 -> 복수의 단어가 결합되는 경우,
        // 두번째 단어의 첫번째 문자는 대문자로 표기함
        // ex ) 하나 짜리 단어인 경우
        // String example;
        // ex) 복수의 단어로 조합된 경우
        // String exampleOfKorean
//        checkFlag = true;       //변수에 데이터 재대입
//        System.out.println(checkFlag);
//        checkFlag2 =true;       // 오류가 발생함을 확인
//        boolean checkFlag3;       // 변수 선언 -> 자료형 변수명;
//        checkFlag3 = true;        // 변수에 값을 최초로 대입하는 것을 -> 초기화
        // 최초로 변수를 선언할 때 자료형(data type) 을 명시하고 값을 대입하여 초기화함
        // 추후 해당 변수에 값을 재대입하는 경우에는 변수명 = (바뀐)값; 형태로 작성함.

        //2. 문자 자료형 변수
//        char name1 ='안';        // 문자를 입력할 때는 작은 따옴표(') 로 감싼다.
//        char name2 ='근';        // 문자(character) : 알파벳 / 한글 / 숫자 하나
//        char name3 ='수';

//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name1 + name2 + name3);  // 복수의 문자들이 표기된 주소가 출력됨
//        System.out.println("" + name1 + name2 + name3);  //java의 sout의 경우 맨 앞의 자료형을 따라감
        // 즉, 큰 따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "안근수" 전체가 출력됨.

        /*
            name 1, 2, 3에 여러분의 이름을 한 글자씩 대입하고,
            sout을 통해서 콘솔창에 여러분들 이름이 출력될 수 있도록 작성하세요.
         */
        // 재대입  :  자료형 명시 X
        // 변수명 =(바뀌는)값
//        name1 = '김';
//        name2 = '은';
//        name3 = '수';
        // 출력
//        System.out.println("" + name1 + name2 + name3);

//        // 3. 정수 자료형 변수
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1);
//        System.out.println(width2);
//        System.out.println(width1 + width2);    // 숫자끼리는 연산이 가능 -> c01에서 수업했습니다.
//
//        String width3 = "300";
//        String width4 = "400";
//        System.out.println(width3 + width4);       // 문자끼리는 연산 X, 나열만 가능 -> c01
//        System.out.println(width1 + width3);       // 정수 + 문자열 = 문자열로 나열 100300
//        System.out.println(width4 + width2);       // 문자열 + 정수 = 문자열로 나열 400200
//
//        //java17버전 이후 : 여러줄에 걸친 데이터(다중 데이터)를 하나의 변수에 대입 가능, 큰따옴표 세개를 사용합니다.
//        String introduction  = """
//                안근수
//                영어교육과
//                코리아it아카데미 웹 강사
//                ESTJ
//                """;
//
//        System.out.println(introduction);
//        /*
//        String introduction2를 선언하고, 거기에 수강생분들의
//        이름
//        전공
//        직업
//        mbti를 입력하고,
//
//        sout을 통해 콘솔창에 출력하시오.
//         */
//        String introduction2 = """
//                김은수
//                컴퓨터공학
//                학생
//                ENTJ
//                """;
//        System.out.println(introduction2);
        // 3-2.
//        int longNumber = 123456789123456789;      -> 오류 발생 :int가 포함할 수 있는 자릿수를 벗어나서
//        System.out.println(longNumber);
//        long time = System.currentTimeMillis();
//        System.out.println(time);

        //4. 실수 자료형 변수
//        double pi = 3.14159;
//        System.out.println(pi);

//        int pi2 =3.14;
//        double dotZero = 3;
//        System.out.println(dotZero);

        // 5. 상수
        // final 자료형 변수명 = 데이터
        // 대문자로 표기, 띄어쓰기는 _ 표시로
        final String FILE_PATH = "c:/kimeunsoo_java";
        // 상수의 경우에는 변수명을 대문자로 작성함.
        final String lowerCaseVariable = "소문자의 변수명";         // 오류가 나지 않음 -> 1) 참조
        System.out.println(lowerCaseVariable);
        final String EXAMPLE_OF_FINAL;                            // 상수의 선언
        EXAMPLE_OF_FINAL = "이것이 예시입니다";                     // 상수의 초기화 -> 2) 참조
        System.out.println(EXAMPLE_OF_FINAL);
//        EXAMPLE_OF_FINAL = "이렇게 바꾸겠습니다";  -> 오류 발생    //상수의 재대입은 불가능 -> 3) 참조
        /*
        상수의 특징:
        1) 개발자들끼리의 약속으로 상수는 전체 다 대문자로 작성하고, 단어사이의 경계를 '_' 로 표시함
        2) 한 번의 선언 및 초기화가 가능
        3) 2) 를 이유로, 재대입 불가능
         */

    }
}
