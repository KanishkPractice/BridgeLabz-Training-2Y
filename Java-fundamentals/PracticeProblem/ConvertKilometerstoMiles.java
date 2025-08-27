import java.util.Scanner;
public class ConvertKilometerstoMiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in kilometers : ");
        int K = sc.nextInt();
        System.out.print("Distance in Miles : "+(K*0.621371));

        sc.close();

    }
}