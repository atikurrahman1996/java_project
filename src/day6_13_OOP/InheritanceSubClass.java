package day6_13_OOP;

public class InheritanceSubClass extends InheritanceParentClass {
	public String occupation;

    void displayInfo2() {
        System.out.println("User name is: " + name);
        System.out.println("User age is: " + age);
        System.out.println("User occupation is: " + occupation);
    }
}

