package org.example.vending;

//지정된 숫자만큼의 객체만 미리 생성
public enum VM2 {

    INSTANCE; //동작시킬 때 이미 하나의 객체를 생성

    private int count;


    public String Hello(){
        return "Hello" + count++;
    }
}
