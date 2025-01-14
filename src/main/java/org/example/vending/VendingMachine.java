package org.example.vending;

//메소드 설계
public enum VendingMachine {

    INSTANCE;

    //2.인스턴스 변수 (거의 private) - 캔의 수량
    private int iaCount;
    private int teaCount;
    private int milkCount;

    //생성자 - 음료 준비
    private VendingMachine(){
        this.iaCount = 10;
        this.teaCount = 5;
        this.milkCount = 7;
        //this(10,5,7); 생성자 함수 호출
    }

    //생성자
    private VendingMachine(int iaCount, int teaCount, int milkCount) {
        this.iaCount = iaCount;
        this.teaCount = teaCount;
        this.milkCount = milkCount;
    }

    //1.메서드 설계
    //음료 + 자판기에서 뽑을 때 재고를 하나씩 줄어들게 => 인스턴스 변수가 메서드에 영향
    public String makeIA(){

        return "Ice Americano" + this.iaCount--;
    }

    public String makeTea(){

        return "Green Tea" + this.teaCount--;
    }

    public String makeMilkCoffee(){

        return "Milk Coffee" + this.milkCount--;
    }

}
