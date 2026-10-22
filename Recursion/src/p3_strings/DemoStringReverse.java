package p3_strings;

public class DemoStringReverse {
    public static void main(String[] args){
        System.out.println(reverse("123456789"));

    }

    private static String reverse(String str) {
        int len = str.length();
        if (len == 0){
            return "";
        }
        return str.substring(len-1)  + reverse(str.substring(0,len-1));
    }

}
