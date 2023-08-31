public class Exercise2_18 {
    public static void main(String[] args) {
        /*
        (Print a table) Write a program that displays the following table. Calculate the
        middle point of two points.
          a            b        Middle Point
        (0, 0)      (2, 1)       (1.0, 0.5)
        (1, 4)      (4, 2)       (2.5, 3.0)
        (2, 7)      (6, 3)       (4.0, 5.0)
        (3, 9)      (10, 5)      (6.5, 7.0)
        (4, 11)     (12, 7)      (8.0, 9.0)
        */

        // assign a values
        double a1_x = 0;
        double a1_y = 0;

        double a2_x = 1;
        double a2_y = 4;

        double a3_x = 2;
        double a3_y = 7;

        double a4_x = 3;
        double a4_y = 9;

        double a5_x = 4;
        double a5_y = 11;


        // assign b values
        double b1_x = 2;
        double b1_y = 1;

        double b2_x = 4;
        double b2_y = 2;

        double b3_x = 6;
        double b3_y = 3;

        double b4_x = 10;
        double b4_y = 5;

        double b5_x = 12;
        double b5_y = 7;

        //compute middle points

        double m1_x = (a1_x + b1_x) / 2;
        double m1_y = (a1_y + b1_y) / 2;

        double m2_x = (a2_x + b2_x) / 2;
        double m2_y = (a2_y + b2_y) / 2;

        double m3_x = (a3_x + b3_x) / 2;
        double m3_y = (a3_y + b3_y) / 2;

        double m4_x = (a4_x + b4_x) / 2;
        double m4_y = (a4_y + b4_y) / 2;

        double m5_x = (a5_x + b5_x) / 2;
        double m5_y = (a5_y + b5_y) / 2;

        // print the table
        System.out.println("  a         b      Middle point");
        System.out.println("(" + (int)a1_x + ", " + (int)a1_y + ")" + "    " + "(" + (int)b1_x + ", " + (int)b1_y + ")" + "    " + "(" + m1_x + ", " + m1_y + ")");
        System.out.println("(" + (int)a2_x + ", " + (int)a2_y + ")" + "    " + "(" + (int)b2_x + ", " + (int)b2_y + ")" + "    " + "(" + m2_x + ", " + m2_y + ")");
        System.out.println("(" + (int)a3_x + ", " + (int)a3_y + ")" + "    " + "(" + (int)b3_x + ", " + (int)b3_y + ")" + "    " + "(" + m3_x + ", " + m3_y + ")");
        System.out.println("(" + (int)a4_x + ", " + (int)a4_y + ")" + "    " + "(" + (int)b4_x + ", " + (int)b4_y + ")" + "   " + "(" + m4_x + ", " + m4_y + ")");
        System.out.println("(" + (int)a5_x + ", " + (int)a5_y + ")" + "   " + "(" + (int)b5_x + ", " + (int)b5_y + ")" + "   " + "(" + m5_x + ", " + m5_y + ")");
    }
}
