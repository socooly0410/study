package Study1103;



public class Pig {

    int money;

    //생성자
    public Pig(String name) {
        System.out.println("저금통이 만들어 졌습니다.");
        System.out.println(name);
    }

    public Pig(int money) {
        this.money = money;
        System.out.println(this.money + "원 있습니다.");
    }


    public void deposit(int money) {

        this.money += money;

        System.out.println(money + "원 입금되었습니다.");


    }

    public void widthdraw(int money) {

        this.money -= money;

        System.out.println(money + "원 출금되었습니다.");


    }

    public int showMoney() {
        return this.money;
    }

}
