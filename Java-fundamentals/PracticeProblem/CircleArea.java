import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        int r = sc.nextInt();
        System.out.print("Area of the circle : "+(3.14*r*r));
        sc.close();

    }
}