import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        int t = sc.nextInt();
        System.out.print("Temperature in Fahrenheit : "+(((t*9)/5)+32));

        sc.close();

    }
}