public class MainClass {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // Accessing members with different modifiers
        System.out.println("Public Variable: " + obj.publicVar);
        // System.out.println("Private Variable: " + obj.privateVar); 
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Default Variable: " + obj.defaultVar);

        // Calling methods
        obj.publicMethod();
        // obj.privateMethod(); 
        obj.protectedMethod();
        obj.defaultMethod();
    }
}
