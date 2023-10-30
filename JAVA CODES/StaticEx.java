public class StaticEx {
    // Static variable (class variable)
    static int staticVariable = 0;

    // Instance variable
    int instanceVariable;

    // Constructor
    public StaticEx(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static Variable: " + staticVariable);
        // You cannot access instanceVariable here because it's not static.
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // You can call the static method and access the static variable without
        // creating an object.
        StaticEx.staticMethod();
        System.out.println("Static Variable (outside the class): " + StaticEx.staticVariable);

        // To access instance variables or instance methods, you need to create an
        // object.
        StaticEx obj1 = new StaticEx(1);
        StaticEx obj2 = new StaticEx(2);

        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}
