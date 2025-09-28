
public class PrimitiveDataType {

    /*
    NOTE:
        - Local variables (declared inside a method) **do not have default values** in Java. 
        They must be initialized before use, otherwise the compiler throws an error.
        - Class (instance) variables **do have default values** automatically:
        int -> 0, double -> 0.0, char -> '\u0000', boolean -> false, etc.
        - This is why trying to print an uninitialized local variable fails, 
        but printing a class variable works without explicit initialization.
     */
    int intVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    byte byteVar;
    short shortVar;
    long longVar;
    float floatVar;

    public static void main(String[] args) {

        PrimitiveDataType obj = new PrimitiveDataType();

        System.out.println("intVar: " + obj.intVar);
        System.out.println("doubleVar: " + obj.doubleVar);
        System.out.println("charVar: " + obj.charVar);
        System.out.println("booleanVar: " + obj.booleanVar);
        System.out.println("byteVar: " + obj.byteVar);
        System.out.println("shortVar: " + obj.shortVar);
        System.out.println("longVar: " + obj.longVar);
        System.out.println("floatVar: " + obj.floatVar);
    }
}
