package c17_bean;
/*
    정보를 담는 객체를 Entity Class라고 함. ->데이터베이스와 연결되는 클래스만 특히 엔티티 클래스라고 함
    필드 -> 명사
    메서드 -> 동사로 짓는 편
    +-----------------------------------+
Lombok plugin install > 이후
build.gradle.kts로 들어가서
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter") //이거 있는 곳 아래에다가!!
    compileOnly("org.projectlombok:lombok:1.18.36")    //롬복 의존성
    annotationProcessor("org.projectlombok:lombok");
}


 */

public class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}