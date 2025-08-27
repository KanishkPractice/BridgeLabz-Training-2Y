import java.util.Scanner;
public class PerimeterRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        int L = sc.nextInt();
        System.out.print("Enter width of the rectangle : ");
        int W = sc.nextInt();
        System.out.print("Parimeter of the rectangle : "+(2*(L+W)));

        sc.close();

    }
}