package StringProgramByRamanaSir;
public class FindIndexValue {
    public static void main(String[] args) {
        String s = "ash123";
        char key = 's';
        
        // Use indexOf() method to find the index of the character 's'
        int index = s.indexOf(key);
        
        // Output the index value
        System.out.println("Index of '" + key + "' in the string is: " + index);
    }
}
