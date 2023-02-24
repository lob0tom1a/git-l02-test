import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        System.out.println("Hello, "+args[0]);
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double a = Double.parseDouble(args[3]);
        double b = Double.parseDouble(args[4]);
        double c = Double.parseDouble(args[5]);
        double n = Double.parseDouble(args[6]);
        double a0 = Double.parseDouble(args[7]);
        double a1 = Double.parseDouble(args[8]);
        double a2 = Double.parseDouble(args[9]);
        int variant = Integer.parseInt(args[10]);
        double w = Double.parseDouble(args[11]);
        double d = Double.parseDouble(args[12]);

        System.out.println("Аргументы - "+x+" "+y+" "+a+" "+b+" "+c+" "+n+" "+a0+" "+a1+" "+a2+" ");
        System.out.println("Номер варианта - "+variant);
        if (variant == 1){
            res = (5*Math.pow(a,n*x))/(b+c)-Math.sqrt(Math.abs(Math.cos(x*x*x)));
        }
        else if (variant==2){
            res =(Math.abs(x-y))/Math.pow(1+2*x,a)-Math.pow(Math.E,Math.sqrt(1+w));
        }
        else if (variant==3){
            res = Math.sqrt(a0+a1*x+a2*Math.pow(Math.abs(Math.sin(x)),1/3));
        }
        else if (variant==4){
            res = Math.log(Math.pow(Math.abs(a),7))+Math.atan(x*x)+(Math.PI)/(Math.sqrt(Math.abs(a+x)));
        }
        else if (variant==5){
            res = Math.pow((((a+b)*(a+b))/(c+d))+Math.pow(Math.E,Math.sqrt(x+1)),1/5);
        }
        else if (variant==6){
            res = Math.pow(Math.E,((2*Math.sin(4*x)+Math.pow(Math.cos(x*x),2)))/(3*x));
        }
        else if (variant == 7){
            res = (1/4)*((1+x*x)/(1-x)+Math.tan(x)/2);
        }
        System.out.println(res);
    }
}
