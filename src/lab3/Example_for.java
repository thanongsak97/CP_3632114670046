package lab3;

public class Example_for {

    public static void main(String[] args) {

        //พิมพ์ข้อความ "Hello" 10 ครั้ง

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hello");
        }
        //พิมพ์เลข 1-10 โดยใช้คำสั่ง for
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }

        //พิมพ์เลขคู่ ที่อยู่ระหว่าง 1-20 โดยใช้คำสั่ง for
        for (int i = 1; i <=20 ; i++) {
            if (i % 2 ==0)
            System.out.print(i+" ");
        }

        //พิมพ์ตัวเลขที่หารด้วย 3 5 และ 7 ลงตัว ที่อยู่ระหว่าง 1-100
        for (int i = 1; i <=100 ; i++) {
            if (i % 3==0 && i % 5==0 )
            System.out.print(i+" ");

        }










    }//main


}//class
