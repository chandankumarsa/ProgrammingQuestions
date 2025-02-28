public class InitCap {
    public static void main(String[] args) {
        String s = "ramana kumar";
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] -= 32; // Convert to uppercase
                }
            }
        }
        System.out.println(new String(ch));
    }
}
