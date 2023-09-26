import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopien wielomianu");
        int degree = scanner.nextInt();
        System.out.println("Podaj wspolczynniki wielomianu");

        double[] arrayElements = new double[degree + 1];
        for(int i = 0; i <= degree; i++){
            arrayElements[i] = scanner.nextDouble();
        }
        System.out.println("Podaj liczbe ktora ma byc pierwiastkiem wielomianu");
        double x = scanner.nextDouble();

    }
    public static boolean is_Root(double[] arrayT, double x){
        int degree = arrayT.length;
        double result = 0;
        for (int i = 0; i <degree; i++) {
            result += arrayT[0] * pow(x, degree - i - 1);
        }
        result += arrayT[degree - 1];
        if(result ==0 ) return true;
        else return false;
    }
}