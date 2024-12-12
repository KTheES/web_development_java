package c16_object_classes;
/*
    toString(), equals(), hashCode()

    1. toString() : 객체의 문자열 표현
        기본적으로 모든 클래스는 Object 클래스를 상속 받으며, Object의 toString() 메서드는
        클래스 이름과 해시코드를 반환함 -> 이를 Override를 통해서 재정의해서 사용하는 편

        왜 사용하는가 ? : 사람이 읽기 좋도록 표기하기 위해서.

    2. equals() : 객체의 동등성 표현
        두 객체가 '논리적으로 같은지'를 비교하는 메서드
        기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
        형식 :
        객체명1. equals(객체명2)      -> 객체명1과 객체명2의 참조 주소가 동일한지 확인 : 3형식 문장

    3. hashCode() : 객체의 고유 값
        객체를 정수 값(해시값)으로 반환
        해시값은 주로 해시 기반 컬렉션에서 사용됩니다.(Collections 파트에서 hashMap, hashSet 개념을 배울 때 언급 예정)
        equals() 를 override 하면 hashCOde()도 '반드시 override' 해야 합니다.
            -동일한 객체(equals() == true)는 동일한 해시 코드를 가져야만 하기 때문인데, 문제는
            -해시 코드가 같다고 해서 항상 equals() 가 true인 것은 아니라는 점입니다.
 */
public class Student {

}
