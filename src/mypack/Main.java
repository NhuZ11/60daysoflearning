package mypack;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PersonBean using the no-argument constructor
        PersonBean person = new PersonBean();
        CarBean car=new CarBean();

        car.setName("Lamborghini");

        System.out.println("The name of car is" + car.getName());

        // Set properties using setter methods
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);

        // Get properties using getter methods
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        int age = person.getAge();

        // Print the properties
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);

        // Use the toString method to print all properties
        System.out.println(person);
    }
}

