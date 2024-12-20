package c19_generic.wildcards;

import java.util.List;

//외부에 클래스를 정의했습니다 -> 처음 수업하는 형태이기 때문에 필기해두시기 바랍니다.
// 주로 사용하게 되는 클래스에는 public이 붙어있고, 부차적으로 사용되는 클래스이 경우에는
//접근 지정자가 명시되어있지 않습니다. -> 그리고 이런 방식으로 시험 문제가 나오는 편입니다.
class Shape{
    public void draw(){
        System.out.println("모양을 그립니다.");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("원을 그립니다.");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("직사각형을 그립니다.");
    }
}


public class WildcardExample02 {
    //여기 부분에 wildcard가 들어갑니다.
    public static void drawShapes(List<?extends Shape> shapes){
        // List 내부의 요소를 뽑는 반복문
        for(Shape shape :shapes){
            shape.draw();
        }
    }

    public static void main(String[] args) {
        // 이하의 형태도 argument로 Circle의 객체를 생성해서 넣은 케이스입니다.
        //이하의 경우에는 생성된 객체들의 객체명이 없을 뿐입니다.
        List<Circle> circles = List.of(new Circle(), new Circle());
        List<Rectangle> rectangles = List.of(new Rectangle(), new Rectangle());

        drawShapes(circles);
        drawShapes(rectangles);

        //List<? extends Shape>는 Shape 클래스의 객체와, 그 하위 클래스(Circle, Rectangle)의
        //객체만 받을 수 있음.
        // shape 리스트에서 요소를 읽는 것은 안전하지만, 새로운 요소를 추가하려고 하면
        // 컴파일 오류가 발생할 수 있습니다.

        // 다 하셨으면 WildcardExample03.java를 만들어주세요
    }
}