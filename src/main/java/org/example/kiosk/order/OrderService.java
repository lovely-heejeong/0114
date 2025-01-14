package org.example.kiosk.order;

import java.util.ArrayList;

//주문 받는 사람
//주문(Order)에 대한 CRUD 처리하는 존재
public enum OrderService {
    //몇 개를 미리 만들 것인가?
    INSTANCE;

    //주문에 대한 ArrayList
    private ArrayList<Order> orders;

    //주문 받으려면 초기화 필요
    private OrderService(){
        orders = new ArrayList<>();
    }

    //주문을 받는다(추가한다)
    public void addOrder(Order order){
        orders.add(order);
    }
}
