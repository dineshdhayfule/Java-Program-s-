/*a. Write java program to show importance of static variable and 
static method.
*/
package pr4;

class Example {
    static int staticVariable;
    int instanceVariable;

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Example.staticVariable = 10; // Accessing a static variable without an instance

        Example.staticMethod(); // Calling a static method without an instance

        Example obj1 = new Example();
        obj1.instanceVariable = 20; // Accessing an instance variable through an object
        obj1.instanceMethod(); // Calling an instance method through an object

        Example obj2 = new Example();
        obj2.instanceVariable = 30;

        // Static variable is shared among all instances
        System.out.println("Static variable value for obj1: " + obj1.staticVariable);
        System.out.println("Static variable value for obj2: " + obj2.staticVariable);

        // Static method is the same for all instances
        obj1.staticMethod();
        obj2.staticMethod();
    }
}
