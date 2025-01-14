package org.example.lots;

import java.util.ArrayList;
import java.util.Collections;

public enum LotsBox {

    INSTANCE;

    //2.인스턴스 변수 - 유지되는 상태
    //뽑기 상자 안에 있는 제비들
    private ArrayList<String> notes;

    //3.생성자 - 재료준비
    //enum 변환 후 생성자는 private 변환 - 외부에서 호출 X
    private LotsBox(){
        notes = new ArrayList<>(); //초기화
        notes.add("꽝");
        notes.add("꽝");
        notes.add("꽝");
        notes.add("꽝");
        notes.add("당첨");

        Collections.shuffle(notes);
    }

    //1.메소드 설계
    //앞글자 대문자 - null값 주기 가능
    //티슈 뽑듯이 제비를 하나씩 뽑음
    public String getNext(){
        //String result = null; //처음에는 null값 주기

        String result = notes.remove(0); //위에서부터 뽑음

        return result;
    }
}
