package c21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;

}

public class JSON02 {
    public static void main(String[] args) {

        // prettyPrinting이 가능한 gson 객체 생성
        Gson gsonBuilder =new GsonBuilder().setPrettyPrinting().create();
        //비교할 수 있는 일반 gson 객체 생성
        Gson gson =new Gson();

        //사용할 변수 선언
        String userJson;    // Json은 기본적으로 String 자료형이기 때문에 선언할 때 String 뺴먹으시면 안됩니다.
        String productJson;

        //User 객체 선언
        User user = new User("geunsu","1234","maybeags@gmail.com","안근수","37");
        System.out.println(gson.toJson(user));
        System.out.println("----프리티 프린팅 적용----");
        System.out.println(gsonBuilder.toJson(user));

        //이상에서의 코드는 User 클래스를 정의하고 생성자를 통해서 필드에 값을 집어넣은 상태로
        //JSON 형태로 바꿨습니다. 하지만 이런 방법만 있는 것이 아니라
        //JsonObject를 이용하는 방법이 있었습니다 -> JSON01.java에서 수업했습니다.

        //JsonObject 형태로
        //studentCode 20240001
        //studentName 여러분 이름
        //studentAge 여러분 나이 로 생성한 후
        //gson과 gsonBuilder를 통해 해당 JSON 파일을 콘솔창에 띄워보세요.

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode","20240001");
        jsonObject.addProperty("studentName","김은수");
        jsonObject.addProperty("studentAge","21");

        System.out.println(gson.toJson(jsonObject));
        System.out.println(gsonBuilder.toJson(jsonObject));

        /*
            이상의 코드 라인은 JsonObject를 이용한 방법

            이제 이거 밑으로는 Map <-> JSON 형태로 변환
            Map으로 만들거니까 Map 선언하셔야 합니다.

         */
        Map<String,String> map = new HashMap<>();
        // 맵에서 엔트리 추가하는 법 -> .put
        map.put("productCode","NT960XGK-KH51G");
        map.put("productNAME","갤럭시북4 프로");
        System.out.println("일반 gson : "+gson.toJson(map));
        productJson =gsonBuilder.toJson(map);
        System.out.println("preetyPrinting : "+ productJson);

        //Json -> Map
        Map<String, String> jsonData1 = gson.fromJson(productJson,Map.class);
        System.out.println("jsondata에서 map으로 바꾼 사례 : "+jsonData1);


    }
}
