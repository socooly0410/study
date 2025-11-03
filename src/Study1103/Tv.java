package Study1103;

public class Tv {

    // 필드 정의(변수)
    boolean power;
    int channel;
    int volume;


    //메서드(함수)
    public void powerON() {
        this.power = true; //this 는 TV를 가리킴
        System.out.println("TV ON!");
    }

    public void powerOFF() {
        this.power = false;
        System.out.println("TV OFF!");
    }


}
