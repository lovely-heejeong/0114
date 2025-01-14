package org.example.kiosk.order;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
//주문 데이터
public class Order {

    private int ono; //주문 번호
    private ArrayList<OrderItem> orderItemList;

    //생성자
    public Order(){
        orderItemList = new ArrayList<>();
    }

    //새로운 OrderItem 추가 - 그러려면 orderItemList 초기화 필요
    public void addOrderItem(OrderItem newItem){
        orderItemList.add(newItem);
    }


}
