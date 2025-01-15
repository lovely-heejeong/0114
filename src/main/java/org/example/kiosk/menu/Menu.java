package org.example.kiosk.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

//메뉴 데이터 - 메뉴 번호, 이름, 가격
//3개의 데이터는 다 필요하니까 생성자 - AllargsConst
//데이터가 변할 일이 읽기 전용 - Getter
//편하게 화면 출력하고 싶으니까 - Tostring
//인스턴스 변수
public class Menu {

    private int num;
    private String name;
    private int price;


}
