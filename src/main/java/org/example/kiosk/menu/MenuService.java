package org.example.kiosk.menu;

import lombok.extern.log4j.Log4j2;

import java.sql.SQLOutput;
import java.util.ArrayList;

@Log4j2
//서비스는 데이터 핸들링과 로직만!
//4.enum으로 변환
public enum MenuService {

    INSTANCE;

    //2.변수: 주어진 메뉴 목록 데이터들을 제공하는 기능 - 메뉴 보관
    //CRUD: Create - Read - Update - Delete
    private ArrayList<Menu> menus;

    //3.생성자 - 초기화, 가게 메뉴 준비
    //public은 외부에서 생성자 호출할 수 있으니까 private
    private MenuService(){
        this.menus = new ArrayList<>();
        menus.add(new Menu(1, "Americano", 3000));
        menus.add(new Menu(2, "Latte", 3500));
        menus.add(new Menu(3, "Cappuccino", 4000));
        menus.add(new Menu(4, "Espresso", 2500));
    }
    //1.로직 먼저 설계
    public ArrayList<Menu> getList(){

        log.info("getList...called");
        log.info(menus);

        //System.out.println(); 대신 쓰는 것, 메소드에서 => log
//        log.trace("trace.....");
//        log.debug("debug.......");
//        log.info("info........");
//        log.warn("warn........");
//        log.error("error.......");
//        log.fatal("fatal......");

        return menus;
    }

}
