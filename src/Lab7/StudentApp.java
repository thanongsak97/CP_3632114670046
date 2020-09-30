package Lab7;

public class StudentApp {

    public static void main(String[] args) {

        // create object of Student class
        Student std1 = new Student();

        std1.setName("Thanongsak");
        std1.setPerson_id("1596387469327");
        std1.setAge(23);

        displayDataObject(std1);

        Student std2 = new Student();

        std2.setName("Nonthiwat");
        std2.setPerson_id("1596387469327");
        std2.setAge(23);

        displayDataObject(std2);

        std2.setName("Kosan");

        Student std3 = new Student("Singto","11111112222222" ,24);

        displayDataObject(std3);

        System.out.println(std3.toString());






    }//main

    private static void displayDataObject(Student std1) {
        System.out.println(std1.getName());
        System.out.println(std1.getPerson_id());
        System.out.println(std1.getAge());

    }






}//class
