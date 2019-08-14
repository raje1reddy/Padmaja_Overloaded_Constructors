
class Employee {
    String name;
    int age;

    //No argument constructor
    Employee() {
        name = "John";
        age = 25;
    }

    //Constructor with one argument (String)
    Employee(String newName) {
        name = newName;
        //age = 25;
    }

    //Constructor with two arguments(int,String)
    Employee(int newAge, String newName) {
        name = newName;
        age = newAge;
    }

    //Constructor with two arguments(String,int)
    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
