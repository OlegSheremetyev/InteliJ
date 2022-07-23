package Replits;

public class Replit138 {
    public static String alphabetical(String s) {
        s = s.toLowerCase();
        char max = s.charAt(0);
        String result = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (max < s.charAt(i)) {
                result += String.valueOf(s.charAt(i));
                max = s.charAt(i);
            }
        }
        return (String) result;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
