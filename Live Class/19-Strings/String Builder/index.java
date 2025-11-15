public class index {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);

        }
        // abcdefghijklmnopqrstuvwxyz
        // 0(26)
        // 0(2^2)
        System.out.println(sb);
        // System.out.println(sb.length());
    }
}