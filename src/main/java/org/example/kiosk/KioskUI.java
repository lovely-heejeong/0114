package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskUI {

    public void startOrder() {
        while(true){
            this.greeting();
            this.makeOrder();
            this.thanks();
        }
    }

    private void greeting (){
        System.out.println("안녕하세요!");
    }

    private void makeOrder(){
        //키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        //Order 객체 생성 (주문한 아이템 리스트(order)는 빈 ArrayList)
        Order order = new Order();

        //반복 실행(oper가 n일 때 종료)
        while(true) {

            //1. 메뉴 세팅 [메뉴(네 가지 메뉴) 생성, 메뉴 내용 4가지 출력]
            ArrayList<Menu> menus = MenuService.INSTANCE.getList();
            menus.forEach(m -> System.out.println(m));

            //2. 메뉴 선택 [메뉴 번호 입력하여 선택]
            System.out.println("메뉴번호를 입력하세요");
            int num = Integer.parseInt(scanner.nextLine());

            //3. 수량 선택 [수량 입력하여 선택]
            System.out.println("수량을 입력하세요");
            int qty = Integer.parseInt(scanner.nextLine());

            //4. 주문한 메뉴아이템 객체 생성
            OrderItem orderItem = OrderItem.builder()
                    .menuNo(num)
                    .qty(qty)
                    .build();
            // OrderItem orderItem = new OrderItem(menuNo, qty);
            // OrderItem orderItem = new OrderItem();
            // orderItem.setMenuNo(num);
            // orderItem.setQty(qty);

            //5. 주문한 아이템 리스트(order)에 주문한 메뉴아이템 객체(orderItem)을 추가
            //장바구니(Order)에 담기
            order.addOrderItem(orderItem);

            System.out.println("주문을 계속 하실래요? y/n");

            String oper = scanner.nextLine();

            if(oper.equals("n")){
                System.out.println("주문 정보입니다."); //생략가능
                System.out.println(order); //생략가능
                break;
            }
        }
        //주문 끝
        int num = OrderService.INSTANCE.addOrder(order);

        System.out.println("주문 번호 " + num);


    }

    private void thanks(){
        System.out.println("안녕히가세요 행복하세요\n\n\n");
    }
}
