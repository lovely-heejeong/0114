package org.example.kiosk;

import lombok.extern.log4j.Log4j2;
import org.example.kiosk.order.Order; // 이거에요!
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;
//import org.junit.jupiter.api.Order; // 우리 클래스 Order가 아니에요
import org.junit.jupiter.api.Test;

@Log4j2
public class OrderServiceTests {

    @Test
    public void testAddOrder() {

        Order order = new Order();

        OrderItem item1 = OrderItem.builder().menuNo(1).qty(1).build();
        OrderItem item2 = OrderItem.builder().menuNo(2).qty(3).build();

        order.addOrderItem(item1);
        order.addOrderItem(item2);

        int orderNum = OrderService.INSTANCE.addOrder(order);

        log.info("주문번호: " + orderNum);


        //       OrderItem item = new OrderItem(1,1);

    }
}
