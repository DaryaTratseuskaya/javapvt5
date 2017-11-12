import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static javax.swing.text.html.parser.DTDConstants.PI;

/**
 * Created by daryatratseuskaya on 11/11/17
 */
public class Task1 {
    public static void main(String[] args) {

        //Task1

        String a = "Some text is here, lets check it blablabla";
        int b = a.length();
        System.out.println(b);
        String c = a.substring(21);
        System.out.println(c);
        String d = a.substring(0, 21);
        System.out.println(d);

        //Task2

        int r = 778;
        if (r % 10 == 7){
            System.out.println("Last num is 7");
        } else
            System.out.println("Last num is not 7");

        //Task3

        int S, side1, side2, radius;
        Double S2;
        side1 = 4;
        side2 = 4;
        radius = 1;

        S = side1 * side2;
        S2 = PI*pow(radius,2);

        if (S < S2){
            System.out.println("The hole is closed");
        } else
            System.out.println("The hole is NOT closed");

        //Task4

        int sum = 5112;

        if (sum % 100  > 10 && sum % 100  < 15 ){
            System.out.println(sum + " рублей");
        } else if (sum % 10 == 1){
            System.out.println(sum + " рубль");
        } else if (sum % 10 >= 2 && sum % 10 < 5){
            System.out.println(sum + " рубля");
        } else if (sum % 10 >= 5 && sum % 10 < 10){
            System.out.println(sum + " рублей");
        }

        //Task5

        String str = "jdsfkjs ? sdjdsj ? sdjksdkj # dkjkjf #";

        String newStr = str.replace( "?", "HELLO");
        String newStr2 = newStr.replace("#", "");
        System.out.println(newStr2);

        //Task6


        int x = 2;
        double e = pow(x,2);
        double n = sin(e);
        double y = pow(n,2);
        double t = pow(x,4);
        double i = 1 + t;
        double u = sqrt(i);
        double result = y/u;
        System.out.println(result);







    }
}
