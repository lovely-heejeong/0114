package org.example.kiosk;

import lombok.extern.log4j.Log4j2;
import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@Log4j2
public class SampleTests {

    @Test
    public void test1() {
        java.util.ArrayList<Menu> menuArrayList = MenuService.INSTANCE.getList();

//        //각각의 메뉴에 대해서 이런 함수를 실행하라
//        //F(x)=>y (람다 lamda)
//        menuArrayList.forEach(menu -> System.out.println(menu));
        menuArrayList.forEach(m -> log.info(m));


//        //메소드 실행의 결과물 확인
//        Assertions.assertEquals(4, menuArrayList.size());
    }


    @Test
    public void test2() {

    }


}