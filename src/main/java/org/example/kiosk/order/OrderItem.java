package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;


@AllArgsConstructor
@Getter
@ToString
@Builder
public class OrderItem {

    //주문 항목 - 메뉴의 번호와 수량으로 구성
    private int menuNo;
    private int qty;

    //private int menuNo, qty

}
