package mypack;

import java.io.Serializable;

public class PersonBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int age;

    // No-argument constructor
    public PersonBean() {
    }

    // Constructor with parameters
    public PersonBean(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter for firstName property
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName property
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName property
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName property
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for age property
    public int getAge() {
        return age;
    }

    // Setter for age property
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonBean [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}

