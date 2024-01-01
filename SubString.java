import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();
        }
        int ch[] = new int[26];
        int cap[] = new int[26];
        for (int i = 0; i < str[0].length(); i++) {
            if (Character.isUpperCase(str[0].charAt(i))) {
                if (cap[str[0].charAt(i) - 'A'] == 0) {
                    cap[str[0].charAt(i) - 'A']++;
                }
            } else {
                if (ch[str[0].charAt(i) - 'a'] == 0)
                    ch[str[0].charAt(i) - 'a']++;
            }

        }
        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.isUpperCase(str[i].charAt(j))) {
                    if (cap[str[i].charAt(j) - 'A'] == 0) {
                        cap[str[i].charAt(j) - 'A']++;
                    }
                } else {
                    if (ch[str[i].charAt(j) - 'a'] == 0)
                        ch[str[i].charAt(j) - 'a']++;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (ch[i] == n) {
                System.out.print((char) (i + 97));
            }
        }
    }
}