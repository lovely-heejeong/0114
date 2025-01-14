package org.example.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor //모든 카드는 무늬와 숫자가 필요 - 생성자 필요 - @AllArgsConstructor
@Getter
@ToString //내가 쉽게 알아보기 위해서 사용
public class Card {

    private CardPattern pattern; //카드 무늬
    private int num; //카드 숫자



}
