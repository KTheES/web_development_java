package c18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

/*
    travelplan 패키지 생성
    TravelPlanMain.java
    TravelPlan.java 파일 생성

    응용 과제 ;
        여행 계획 객체 생성

    다음과 같은 속성을 가진 여행 계획(TravelPlan)객체를 생성해야 함.
        1. 여행지(destination) : 파리
        2. 출발일(depatureDate) : 2024-12-17
        3. 귀국일(returnDate) : 2024-12-26
        4. 여행자 수(numberOfTravelers) : 2
        5. 호텔 이름(hotelName) : 아난티코브
        6. 비행편번호(flightNumber) : AF123

    지시 사항
    1. @Builder 및 @ToString을 이용할 것
    2. 위의 속성의 예시에 적어둔 데이터를 기준으로 객체를 생성할 것
    3. 생성된 갹채인 travelPlan1을 sout을 통해 콘솔에 출력할 것
 */

public class TravelPlanMain {
    public static void main(String[] args) {
        // Builder Pattern을 통한 객체 생성
        TravelPlan travelPlan1 = TravelPlan.builder()       // 여기서는 new가 안들어갔었습니다
                .destination("파리")                         // 이유는 Builder에서 필수 생성자가 없었기 때문에
                    .departureDate("2024-12-17")
                        .returnDate("2024-12-26")
                            .numberOfTravelers(2)
                                .hotelName("아난티코브")
                                    .flightNumber("AF123")
                                        .build();

        System.out.println(travelPlan1);


        TravelPlanNoLombok travelPlanNoLombok1 = new TravelPlanNoLombok.Builder("런던","2025-01-01")
                .build();        // 하지만 TravelPlanNoLombok과 Builder에서 final로 지정한 속성 때문에
                                 // Builder의 생성자를 이용하는 경우 new와 .Builder(인수들)로 대문자 Builder를 사용해야 합니다.

        System.out.println(travelPlanNoLombok1);




    }
}
