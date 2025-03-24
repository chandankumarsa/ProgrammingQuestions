public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String s = "Java is very easy";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000')  
                continue;
            int count = 1; // Initialize with 1 to count the first occurrence
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';  // Mark counted character
                }
            }
            System.out.println(ch[i] + " = " + count);
        }
    }
}
