public class Person {

    private String name;
    public String getName(){ return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }

    //static topic
//    private int id;
//    //статична змінна
////    static int counter=1;
//
//    //статичний ініціалізатор
//    static int counter;
//    public static final double PI;
//    public static final int COUNTER;
//
//    static {
//        counter = 105;
//        PI = 3.14;
//        COUNTER = 100;
//        System.out.println("Static initializer");
//    }
//
//    public Person(){
//        id = counter++;
//        System.out.println("Constructor");
//    }
//    public void displayId(){
//
//        System.out.printf("Id: %d \n", id);
//    }
}
