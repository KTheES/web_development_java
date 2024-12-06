package c05_scanner;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//
//        System.out.print("x 입력 : ");
//        int x = scanner.nextInt();
//        System.out.print("y 입력 : ");
//        int y = scanner.nextInt();
//        System.out.println("x + y = "+(x+y));  //  올바른 연산
//
//        System.out.println("x + y = "+x+y);    // x, y가 String 취급받아 틀린 연산 출력

        /*
            평균 계산기를 작성하시오

            지시 사항
            1. 사용자로부터 세 개의 실수를 입력 받아, 이 숫자들의 평균 및 합을 계산하고 출력하시오.
            2. 사용자에게 첫 번째 실수를 입력받으세요.
            3. 사용자에게 두 번째 실수를 입력받으세요.
            4. 사용자에게 세 번째 실수를 입력받으세요.
            5. 총합과 평균을 계산하고 출력하세요.

            실행 예
            첫 번째 실수를 입력하세요 >>> 100
            두 번째 실수를 입력하세요 >>> 80
            세 번째 실수를 입력하세요 >>> 60

            총합 : 240.0
            평균 : 80.0
         */

        double num1;
        double num2;
        double num3;

        double sum;

        System.out.print("첫 번째 실수를 입력하세요 >>> ");
        num1 = scanner.nextDouble();
        System.out.print("두 번째 실수를 입력하세요 >>> ");
        num2 = scanner.nextDouble();
        System.out.print("세 번째 실수를 입력하세요 >>> ");
        num3 = scanner.nextDouble();
        sum = num1 + num2 + num3;
        System.out.println();
        System.out.println("총합: " +sum+ " \n평균: " +(sum/3));








    }
}
