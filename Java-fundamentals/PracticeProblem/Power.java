import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int B = sc.nextInt();
        System.out.print("Enter exponent : ");
        int E = sc.nextInt();
        System.out.print("Result : "+(Math.pow(B,E)));

        sc.close();

    }
}