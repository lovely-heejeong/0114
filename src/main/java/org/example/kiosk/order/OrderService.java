package org.example.kiosk.order;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

//Log4j2 사용 => s.o.p 사용 X

@Log4j2
//주문 받는 사람
//주문(Order)에 대한 CRUD 처리하는 존재
public enum OrderService {
    //몇 개를 미리 만들 것인가?
    INSTANCE;

    //주문에 대한 ArrayList
    private ArrayList<Order> orders;

    private int idx;

    //주문 받을 준비 - 초기화 필요
    private OrderService(){
        orders = new ArrayList<>();
    }

    //1.주문을 받는다(추가한다)
    public int addOrder(Order order){

        log.info(order); //order값 확인해보기
        log.info("current idx: " + idx);

        idx++;

        order.setOno(idx); //주문이 추가될 때마다 주문번호(idx)가 올라감

        orders.add(order);

        return idx;
    }
}
