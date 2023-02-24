import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        System.out.println("Hello,"+args[0]);
        double x = new Scanner(System.in).nextDouble();
        double y = new Scanner(System.in).nextDouble();
        double res = (3*Math.pow(Math.cos(x-Math.PI/6),2))/((1/2)+Math.sin(y)*Math.sin(y));
        System.out.println(res);
    }
}
