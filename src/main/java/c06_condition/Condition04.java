package c06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        /*
            switch문
            형식 :
            switch(변수){
                case 조건1:
                    실행문
                    break;
                case 조건2:
                    실행문
                    break;
                deault:
                    실행문
            }
         */
        Scanner scanner = new Scanner(System.in);

        String selected;
        System.out.println("[    선택 프로그램    ]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");

        System.out.println("메뉴를 선택하세요 >>> ");
        selected = scanner.nextLine();

        //switch(변수명) : -> 변수에 담긴 데이터(case)에 따라 선택적으로 메뉴를 실행함
        switch(selected){
            case "a":
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴 2를 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 4를 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 5를 선택하셨습니다.");
                break;
            default:    //case에 해당되지 않는 데이터가 들어왔을 때 실행되는 실행문
                System.out.println("잘못 선택하셨습니다.");
        }












    }
}
