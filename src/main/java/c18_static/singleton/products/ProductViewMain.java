package c18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
//        ProductView productView1 =ProductView.getInstance();
        //여태까지는 이상의 방법으로 객체명을 지정해놓고 해당 객체의 메서드들을 실행시키는 방법을 썼습니다.

        //ProductView.getInstance() 메서드는 대문바 P이고, 싱글톤에서 분석했듯, static 메서드입니다.
        //그리고 getInstance()의 리턴값은 instance라는 static 필드이기 때문에
        // ProductView product1 = ProductView.getInstance() 대입을 생략하고
        //곧장 실행을 시켜봤습니다.
        //하지만 return값이 instance라는데에 주목을 해야만 합니다.
        //그리고 instance 필드를 확인해본 결과 자료형이 ProductView 클래스의 객체임을 확인할 수 있기
        //떄문에, 인스턴스 메서드를(static이 없는)실행한 결과와 동일한 값이 나오게 함.
        ProductView.getInstance().showMainView();
        //이상의 라인에서 생성한 instance와 아래의 라인에서 생성한 instance는 동일합니다.
        ProductView.getInstance().showOrderView();



    }
}