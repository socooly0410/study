package Study1103;

public class Pig_Main {
    public static void main(String[] args) {

        // pig 클래스를 사용해서 moneyPig를 생성
        Pig moneyPig = new Pig("꿀꿀 저금통");

        moneyPig.deposit(50000);
        moneyPig.deposit(10000);
        moneyPig.widthdraw(15000);

        System.out.println("잔액은" + moneyPig.showMoney() + "원 입니다.");

        //저급통2
        Pig moneyPig2 = new Pig(100000);
        moneyPig2.widthdraw(1000);
        System.out.println("잔액은" + moneyPig2.showMoney() + "원 입니다.");


    }
}
