
package c13_inheritance.product;
/*
    1)필드로 private String name, private String category를 선언하세요.

    2)생성자를 AllArgsConstructor

    3) setter / getter를 각각 생성하세요.

    4) Product.java로 가셔서 Item이 부모 클래스 /product가 자식 클래스가 되도록 명령어를 입력하세요
 */
public class Item {
    //1)필드 생성
    private String name;
    private String category;

    //RequiredArgsConstructor로 선언하지 않은 이유 : 필드 두 개가 전부
    //String이기 때문에 컴파일 시에 오류가 날 확률이 있습니다.

    //2)생성자

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //3)메서드들 생성
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }


}