package day32Methods;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();

        String fullName = formatFullName(first, last);
        System.out.println(fullName);
    }

public static String formatFullName(String first, String last){
    first = first.substring(0, 1).toUpperCase()+ first.substring(1).toLowerCase();

    last = last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();
    String fullName = first + " "+ last;
        return fullName = "";

}

}
