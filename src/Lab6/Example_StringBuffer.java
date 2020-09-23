package Lab6;

public class Example_StringBuffer {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Thanongsak Athikerd");
        str.append("RUTS");
        str.insert(19," ");
        System.out.println(str);
        str.replace(0,10,"MT");
        System.out.println(str.reverse());





    }//main



}//class
