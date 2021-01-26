package recursion;

public class Reverse {

    public static String reverseString(String str){
        if (str.isEmpty()){
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);

    }

}
