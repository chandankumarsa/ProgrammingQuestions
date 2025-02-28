public class ArrangeCharacterAscendingOrder {
    public static void main(String[] args) {
        String s = "jaaaaaavva";
        char[] ch = s.toCharArray();

        // Bubble Sort
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        System.out.println(new String(ch)); // Convert char array to String
    }
}
