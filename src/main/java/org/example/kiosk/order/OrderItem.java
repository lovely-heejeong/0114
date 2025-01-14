package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;


@AllArgsConstructor
@Getter
@ToString
public class OrderItem {

    //메뉴의 번호와 수량으로 구성
    private int menuNo;
    private int qty;


}
