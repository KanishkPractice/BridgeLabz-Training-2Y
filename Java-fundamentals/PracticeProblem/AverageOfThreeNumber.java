import java.util.Scanner;
public class AverageOfThreeNumber{
    public static void main(String[] args){
        Scanner su = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int A = su.nextInt();
        System.out.print("Enter 2nd number : ");
        int B = su.nextInt();
        System.out.print("Enter 3rd number : ");
        int C = su.nextInt();
        System.out.print("Average of three numbers is : "+((A+B+C)/3));
        su.close();

    }
}