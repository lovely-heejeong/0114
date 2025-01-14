package org.example.kiosk.menu;

import java.util.ArrayList;

//3.enum으로 변환
public enum MenuService {

    INSTANCE;

    //2.변수: 주어진 메뉴 데이터들을 제공하는 기능 - 메뉴 보관
    //CRUD: Create - Read - Update - Delete
    private ArrayList<Menu> menus;

    //4.생성자 - 초기화
    //public은 외부에서 생성자 호출할 수 있으니까 private
    private MenuService(){
        this.menus = new ArrayList<>();
        menus.add(new Menu(1, "Americano", 3000));
        menus.add(new Menu(2, "Latte", 3500));
        menus.add(new Menu(3, "Cappuccino", 4000));
        menus.add(new Menu(4, "Espresso", 2500));
    }
    //1.로직 먼저 구성
    public ArrayList<Menu> getList(){
        return menus;
    }

}
