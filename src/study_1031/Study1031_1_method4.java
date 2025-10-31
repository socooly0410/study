package study_1031;

public class Study1031_1_method4 {

    public static void main(String[] args) {


        //indexOF 몇번쨰 글자인지
        String data = "여러분 안녕?";
        System.out.println(data.indexOf("안"));


        //subString 어디부터 어디까지 출력
        System.out.println(data.substring(0, 3));

        //replace 글자 바꾸기
        data = "ㅋㅋㅋㅋㅋㅋㅋㅋ 머함";
        System.out.println(data.replace("ㅋ", "ㅎ"));

        //charAT 몇번쨰 인덱스가 무엇인지
        data = "여러분 안녕";
        System.out.println(data.charAt(2));

        //split 특정 문자를 잘라서 배열로 반환
        data = "010-21234-5678";
        String[] cut = data.split("-");
        // ["010", "1234", "5678"]
        for (int i = 0; i <cut.length ; i++) {
            System.out.println(cut[i]);
        }

        //형변환
        String a = "1";
        String b = "2";

        System.out.println(a + b);

        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        // String -> int = Integer.parseInt()
        // String -> float = Float.parseFloat()
        //

    }

}
