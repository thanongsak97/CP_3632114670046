package Lab8;

public class ArryException {

    public static void main(String[] args) {

        int num[] = { 10, 20, 30, 40, 50};    //index 0-4

        System.out.println(num[0]);
        try {
            System.out.println(num[3]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is invaid");
            System.out.println(e);
        }finally {
            num[4] = 100;
        }

        System.out.println(num[4]);











    }//main


}//class
