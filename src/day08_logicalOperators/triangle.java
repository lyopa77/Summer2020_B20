package day08_logicalOperators;

public class triangle {
    public static void main(String[] args) {
        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 20;
        boolean valid = angle1+angle2+angle3 == 180;
        boolean invalid = !valid;
        if (valid){
            System.out.println("valid triangle");
        }
        if (invalid) {
            System.out.println("invalid triangle");

        }

    }
}
