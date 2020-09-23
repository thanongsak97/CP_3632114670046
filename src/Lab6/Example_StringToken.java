package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("ประชาสัมพันธ์-สำนักงานอธิการบดี: ประกาศรับสมัครผู้ประกอบการจำหน่ายสินค้าและบริการ\n" +
                "โครงการป่าสวยน้ำใส รวมใจ สายสัมพันธ์ ครั้งที่10\n" +
                "ประชาสัมพันธ์-กองบริหารงานบุคคล: ประกาศมหาวิทยาลัยเทคโนโลยีราชมงคลศรีวิชัย เรื่อง ผู้ได้รับเลือกตั้งซ่อมเป็นกรรมการสภาคณาจารย์และข้าราชการ\n" +
                "โครงการอนุรักษ์พัฒนาและสร้างคุณค่าสิ่งแวดล้อม");

        StringTokenizer strtoken = new StringTokenizer(str.toString());
        int countWord = strtoken.countTokens();
        System.out.println("Word count: "+countWord);

        while (strtoken.hasMoreTokens()){
            System.out.println(strtoken.nextToken());
        }






    }//main


}//class
