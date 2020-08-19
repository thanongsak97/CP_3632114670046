package lab3;

import java.util.Scanner;

//รับค่าจำนวนเต็ม 10 ครั้ง จากผู้ใช้ แสดง ผลรวม เเละค่าเฉลี่ย ทางจอภาพ (for)
public class Example_for2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer : ");
            int num =sc.nextInt();

             total += num;


        }
        //display
        System.out.println("Total : " + total);
        System.out.println("Average :" + total/10);










    }//main


}//class
