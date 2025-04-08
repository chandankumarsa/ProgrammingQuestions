package ArrayLIst_Implementations;

public class UserCode {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println("Is list empty? " + list.isEmpty());

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.getpos(1, "Mango");
        System.out.println("After inserting Mango at index 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        list.remove(2);
        System.out.println("After removing element at index 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        System.out.println("Final size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
