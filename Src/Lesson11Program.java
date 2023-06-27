public class Lesson11Program {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        System.out.println(tom.getName());
        tom.setName("Anatoliy");
        System.out.println(tom.getName());


//перевірка чи об'єкт є потрібним типом єкземпляра класу
        //instanceof = false
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Employee ){
//            Employee clientKate = (Employee) kate;
//            clientKate.display();
//        }
//        else{
//
//            System.out.println("Conversion is invalid");
//        }

        //instanceof = true
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Client){
//
//            Client clientKate = (Client) kate;
//            clientKate.display();
//        }
//        else{
//
//            System.out.println("Conversion is invalid");
//        }

        //приведення від об'єкта до працівника
        // помилкове приведення
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Employee emp = (Employee) kate;
//        emp.display();
//
//        // або таке
//        ((Employee)kate).display();
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        // приведення від батьківського класу Object до типу Person
//        ((Person)kate).display();
//
//        Object sam = new Employee("Sam", "Oracle");
//        // приведення від батьківського класу Object до типу Employee
//        ((Employee)sam).display();
//        Object sam = new Employee("Sam", "Oracle");
//
//        // приведення від батьківського класу Object до типу Employee
//        Employee emp = (Employee)sam;
//        emp.display();
//        System.out.println(emp.getCompany());

        //пиведення до об'єкту та до персони
//        Object tom = new Person("Tom");
//        Object sam = new Employee("Sam", "Oracle");
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        Person alice = new Employee("Alice", "Google");
//


        // приведення до персони
//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new Employee("Sam", "Oracle");
//        sam.display();
//        Person bob = new Client("Bob",3000, "DeutscheBank");
//        bob.display();

        //наслідування зі змінною у класі наслідника - Employee
//        Employee sam = new Employee("Sam", "Microsoft");
//        sam.display();  // Sam
//        sam.work();     // Sam works in Microsoft

        //clean inherits
//        Person tom = new Person("Tom");
//        tom.display();
//        Employee sam = new Employee("Sam");
//        sam.display();

        //static methods
//        System.out.println(Operation.sum(45, 23));          // 68
//        System.out.println(Operation.subtract(45, 23));     // 22
//        System.out.println(Operation.multiply(4, 23));      // 92

        //статичні змынні та ініціалізатор
//        Person tom = new Person();
//        Person bob = new Person();
//
//        tom.displayId();    // Id = 1
//        bob.displayId();    // Id = 2
//        System.out.println(Person.counter); // 3
//
//        // змінюємо Person.counter
//        Person.counter = 8;
//
//        Person sam = new Person();
//        sam.displayId();    // Id = 8
    }
    Employee transferObjectToEmployee(Object obj){
        return (Employee) obj;
    }
}
