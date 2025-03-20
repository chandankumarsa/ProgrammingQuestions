package Practice20;
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello   World   !   ";
        
        // Trim leading/trailing spaces and replace multiple spaces with a single space
        str = str.trim().replaceAll("\\s+", " ");
        
        System.out.println(str);
    }
}
