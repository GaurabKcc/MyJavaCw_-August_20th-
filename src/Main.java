import models.Measurement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value (meter): ");
        float my_value = sc.nextInt();

        Measurement compute = new Measurement(my_value);

        System.out.println("Original value is : " + my_value + " metre");
        System.out.println("Value in cm is :" + compute.getCm());
        System.out.println("Value in km is :" + compute.getKm());
        System.out.println("Value in mm is :" + compute.getMm());
        System.out.println("Value in dm is :" + compute.getDm());
    }
}
