package org.example.kiosk.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@Setter
//주문 데이터
public class Order {
    //주문 번호와 아이템들 => 하나의 주문 <OrderItem>, Setter 필요
    private int ono;
    private ArrayList<OrderItem> orderItemList;

    //생성자 - 초기화
    public Order(){
        orderItemList = new ArrayList<>();
    }

    //OIList에 새로운 주문 Item을 추가 - 초기화 필요
    //메뉴 번호와 수량을 묶어서 OI
    public void addOrderItem(OrderItem newItem){
        orderItemList.add(newItem);

    }


}
