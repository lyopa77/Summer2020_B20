package day29_methods;

public class palndrome {
    public static void main(String[] args) {
        palindrome("ayak");
    }
    public static void palindrome (String word){
        String reversed = "";
        for(int i = word.length()-1;i>=0;i--){
            reversed += word.charAt(i);
        }

        System.out.println(reversed.equalsIgnoreCase(word));
    }


}
