package org.example.vending;

import java.util.Scanner;

public class VendingUI {
    //2.Scanner 계속 쓸거니까 => 메서드들간 공유
    private Scanner scanner;
    //협력자/조력자
    //생성자를 통한 의존성 주입: 누가 만들어 놓은 자판기로 내가 사용
    private VendingMachine vendingMachine;

    //3.생성자 - Scanner 초기화, 장사 준비
    public VendingUI(VendingMachine vm){
        this.scanner = new Scanner(System.in);
        this.vendingMachine = vm;
    }

    //1.메소드 설계
    public void use(){

        outer:
        while(true){
            System.out.println("1.아아 2.티 3.밀크커피 4.종료");
            String oper = this.scanner.nextLine();

            switch (oper){
                case "1":
                    System.out.println(VendingMachine.INSTANCE.makeIA());
                    break;
                case "2":
                    System.out.println(VendingMachine.INSTANCE.makeTea());
                    break;
                case "3":
                    System.out.println(VendingMachine.INSTANCE.makeMilkCoffee());
                    break;
                case "4":
                    System.out.println("프로그램 종료 합니다.");
                    break outer; //while문 나감

            }//end switch
        }
    }

}
