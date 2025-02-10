package D_AbandonObject;
class Example1 {
    int data;
}
public class AbandonObjectNull {
    public static void main(String[] args) {
        Example1 obj = new Example1(); // Object created
        obj.data = 10;
        
        System.out.println("Before null assignment: " + obj.data);

        obj = null; // The object is now abandoned

        // System.out.println(obj.data); // This would cause a NullPointerException
    }
}
