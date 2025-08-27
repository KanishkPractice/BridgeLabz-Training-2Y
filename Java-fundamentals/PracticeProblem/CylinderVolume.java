import java.util.Scanner;
public class CylinderVolume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the Cylinder : ");
        int r = sc.nextInt();
        System.out.print("Enter height of the Cylinder : ");
        int h = sc.nextInt();
        System.out.print("Volume of the Cylinder : "+(3.14*r*r*h));

        sc.close();

    }
}