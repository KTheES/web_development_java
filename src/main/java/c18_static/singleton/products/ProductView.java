package c18_static.singleton.products;
/*
    products 패키지 생성
    ProductView.java /ProductViewMain.java 생성
 */
public class ProductView {
    // 싱글톤 패턴으로 작성하시오.
    private ProductView(){
        System.out.println("ProductView 객체가 생성되었습니다.");
    }

    public static ProductView instance = new ProductView();

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }






    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }


}