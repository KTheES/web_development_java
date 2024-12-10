package c12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {/*
    while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 하는 프로그램을 작성할 예정입니다.

    1-45까지의 숫자를 임의로 생성한 후 , lottoNumbers 라는 배열에 저장할 겁니다.
    로또 번호 6 -> index가 6개입 배열 : 게임 한 번
            5개 만들어져야 함. -> 촐 5000원치

        중복 제거와 관련된 부분이 걸릴 수 있습니다 -> getter / setter

        실행 예

        '여기부분에로또로고 출력해주세요

        로또 번호 추첨기에 오신 것을 환영합니다. 5게임을 시작합니다 -> '5'는 String이 아닐 것
        이번 로또 당첨 번호는 다음과 같습니다

        예)

 */
    public static void main(String[] args) {

        //필요한 객체 생성
        //random.nextInt(a)의 의미 : 0부터 a-1까지의 int를 임의적으로 생성함.
        Random random = new Random();

        //필요한 변수 선언
        int[] lottoNumbers = new int[6];
        int count = 5;       //횟수에 해당하는 count 변수
        boolean duplicate = false;  //duplicate : 중복이라는 의미 //false일 경우에만
        //lottoNumbers 배열에 element를 추가하면 되겠죠
        int number = 0;

        String logo = """
                 _     ____  _____  _____  ____\s
                / \\   /  _ \\/__ __\\/__ __\\/  _ \\
                | |   | / \\|  / \\    / \\  | / \\|
                | |_/\\| \\_/|  | |    | |  | \\_/|
                \\____/\\____/  \\_/    \\_/  \\____/
                """;
        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");

        while (count > 0) {
            //일단 1게임을 완성하는 코드
            for (int i = 0; i < lottoNumbers.length; i++) {
                //반복문이 돌 때마다 duplicate =false로 초기화를 시켜야 할 것 같음.
                duplicate =false;

                //배열에 값을 대입하기 전에 임시 변수인 number에 대입 후 중복 확인하고
                // 중복되지 않는다면 아후애 lottoNumbers 배열에
                //데이터 대입
                number = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {  //한계값 j<lottoNumbers.length 를 사용하지 않았습니다.
                    //중복을 확인하는 코드
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                    }
                }

                //여기까지 내려왔다면 중복이 되지 않는다는 의미
                //중복이 되지않으면 if 부분이 실행돼서 배열에 값을 대입
                //중복이 된다면 else부분이 실행됨 -> 이 경우 다시 한 번 random.nextInt()를 실행해야 하기 때문에
                //i를 하나 감해줬습니다.
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }

            //오름 차순을 위한 코드
            Arrays.sort(lottoNumbers);
            //배열 자체를 출력하는 코드
            System.out.println(Arrays.toString(lottoNumbers));
            count--;
        }













    }
}