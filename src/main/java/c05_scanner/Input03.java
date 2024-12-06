package c05_scanner;

import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String address;
        String phone;
        /*
            이름을 입력하세요 >>> 안근수
            나이를 입력하세요 >>> 37
            주소를 입력하세요 >>> 부산광역시 연제구
            연락처를 입력하세요 >>> 010-7445-7113

            사용자의 이름은 안근수이고, 나이는 37살입니다.
            주소는 부산광역시 연제구이며 연락처는 010-7445-7113입니다.
         */

        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        age = scanner.nextInt();        // -> .nextLine()을 제외한 모든 next계열이 Input02에서 배운 부분에 해당됨
        scanner.nextLine();  // 그래서 얘가 배리어 역할
        System.out.print("주소를 입력하세요 >>> ");
        address = scanner.nextLine();
        System.out.print("연락처를 입력하세요 >>> ");
        phone = scanner.nextLine();
        System.out.println();
        System.out.println("사용자의 이름은 "+name+"이고, 나이는 "+age+"살입니다.\n주소는 "+address+"이며 연락처는 "+phone+"입니다.");



    }
}
