package org.example;


import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.lots.LotsUI;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Card userCard = CardDeck.INSTANCE.getOne();
        Card comCard = CardDeck.INSTANCE.getOne();

        System.out.println(userCard);
        System.out.println(comCard);



//        LotsUI ui = new LotsUI();
//
//        ui.startGame();


//        ArrayList<String> list = new ArrayList<>();
//        list.add("꽝");
//        list.add("꽝");
//        list.add("당첨");
//
//        Collections.shuffle(list);
//
//        System.out.println(list); //출력: [꽝, 꽝, 당첨]
//
//        //remove(0): 뽑으면 앞으로 당겨짐
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);



//        VendingUI ui = new VendingUI();

        //내가 새로 자판기를 만들어서 쓰고 싶을 때 - 뒤의 값 변경 가능
        //새로 만든걸 ui가 쓰도록 VendingUI(vm)
//        VendingMachine vm = new VendingMachine(20,5,5);
//        VendingUI ui = new VendingUI(vm);
//
//        ui.use();

    }
}