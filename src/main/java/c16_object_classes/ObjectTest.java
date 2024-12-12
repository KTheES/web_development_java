package c16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고 기존에 있는 class들을 의미합니다.
 */
public class ObjectTest {
    private String name;
    private String address;

    // NoArgConstructor 정의하세요
    public ObjectTest() {}

    // AllArgsConstructor 정의하세요
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Setter / Getter 정의하세요.
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }


    //displayInfo() 정의하세요.
    //실행 예
    // 이름 : 안근수
    // 주소 :부산광역시 연제구

    public void displayInfo(){
        System.out.println("이름 : "+getName()+"\n주소 : "+getAddress());
    }

    //showInfo()를 정의하는데 sout말고 return형으로 작성한 후, Main에서 콘솔에 출력하시오.
    public String showInfo(){
        //여기에 어떻게 쓰시고 -> ObjectTestMain으로 가세요
        return "이름: " +name + "\n 주소" + address ;
    }

    // 즉 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다 String 향태로 바꿔주는 것을 의미하며, 이는
    // Object 클래스의 메서드를 Override 했음을 확인할 수 있음.
    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }



}
