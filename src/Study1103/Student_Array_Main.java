package Study1103;
import java.util.Scanner;
import java.util.ArrayList;

public class Student_Array_Main {
    public static void main(String[] args) {

        Student jjy = new Student();

        jjy.setName("장재용");
        jjy.setAge(26);
        jjy.setAddress("광주");
        jjy.setPhone("010-1111-2222");

        /*
        System.out.println(jjy.getName());
        System.out.println(jjy.getAddress());
        System.out.println(jjy.getAge());
        System.out.println(jjy.getPhone());
         */

        Student gildong = new Student("홍길동", 12, "조선", "010-1111-2222");
        //System.out.println(gildong.getPhone());


        Student deockbae = new Student("김덕배", 38, "마닐라", "010-1112-2222");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(jjy);
        students.add(gildong);
        students.add(deockbae);

        for(Student s : students) {
            System.out.println("이름 : " + s.getName() + "\t나이 :" + " " + s.getAge() + " " + s.getAddress() + " " + s.getPhone());

        }




    }
}
