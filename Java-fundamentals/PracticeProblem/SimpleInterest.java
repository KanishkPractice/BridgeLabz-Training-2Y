import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int P = sc.nextInt();
        System.out.print("Enter Rate : ");
        int R = sc.nextInt();
        System.out.print("Enter Time : ");
        int T = sc.nextInt();
        System.out.print("Simple interest is : "+((P*R*T)/100));

        sc.close();
    }
}