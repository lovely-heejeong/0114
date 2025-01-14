package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

public enum CardDeck {

    INSTANCE;

    //카드를 여러개 가짐 - 카드의 ArrayList
    private ArrayList<Card> cards;

    //카드 준비 - 생성자
    //내가 가진 카드 초기화 필요
    private CardDeck(){
        this.cards = new ArrayList<>();

        for (int i = 1; i <= 48 ; i++) {

            cards.add(new Card(CardPattern.CLO, i)); //1-48번까지 클로버카드
        }

        Collections.shuffle(cards); //카드 뽑기 전에 섞기

//        for(CardPattern pattern: CardPattern.values()) {
//            for (int i = 1; i < 12; i++) {
//                cards.add(new Card(pattern, i));
//            }
//        } //다른 카드도 넣을 때
    }

    //카드를 뽑으면 카드가 줄어듬 -> 다음 카드 뽑기
    //임의의 카드 뽑기 - 리턴값, 리턴타입 = 카드
    public Card getOne(){

        Card card = cards.remove(0); //위에서부터 한장 빼기
        return card;

    }


}
