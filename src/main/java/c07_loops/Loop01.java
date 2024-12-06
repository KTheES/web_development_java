package c07_loops;

public class Loop01 {
    public static void main(String[] args) {
        /*
            for 문 vs while문

            1.for 문

            형식 :
            for(시작값; 한계값; 증감값){
                실행문
            }
         */
        // for(웬만하면 처음 선언 및 초기화하는 변수 ; 한계값 ; 증감값){}
        // 시작값 적용 -> 한계값이 있는 부분에서의 true/false 판단 -> 실행문 실행 -> i++ 적용
//        int i=100;
//        for(i =0 ; i <10 ; i++) {
//            System.out.println(i);
//        }
//        System.out.println("--------------");
//        System.out.println(i);
        int result = 0;
        // 반복문을 사용하여 1부터 100까지의 합을 구하세요
        for(int i =0; i<101; i++){
            result+=i;
        }

        for(int i =0 ; i <100; i++){
            result += i+1;
        }
        System.out.println("1부터 100까지의 합 : "+ result);








    }
}
