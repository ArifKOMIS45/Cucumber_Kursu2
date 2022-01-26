package Utilities;

import java.util.ArrayList;
import java.util.List;

public class denem {

    public static String FirstReverse(String str) {
        // code goes here
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        str = reverse;

        return str;
    }

    public static void main(String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(FirstReverse(s.nextLine()));
        String str = "cats AND*Dogs-are Awesome";
        String newstr = str.toLowerCase();
        List<Character> newStr2 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            if ((newstr.charAt(i) >= 'a' && newstr.charAt(i) <= 'z')) {
                newStr2.add(newstr.charAt(i));
            } else {
                newStr2.add('_');
            }
        }

        System.out.println(newStr2);
        // return newStr2;

    }


}





