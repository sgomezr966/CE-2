
import java.util.Scanner;

public class Exercise217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problem 2.17
        Scanner scan = new Scanner(System.in);
        double temp;
        double wind;
        while (true) {
            System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
            temp = Double.parseDouble(scan.next());
            if (temp > 41 || temp < -58) {
                System.out.println("That temperature is above/below the given perameters. Try again.");
            } else {
                break;}
        }
        while (true) {
            System.out.println("Enter the wind speed (>=2) in miles per hour: ");
            wind = Double.parseDouble(scan.next());
            if (wind < 2) {
                System.out.println("That wind speed is too low, Try again.");
            } else {
                break;}
        }

        double answer = tempCalc(temp, wind);
        System.out.println("The wind chill index is "+ answer);
    }

    public static double tempCalc(double temp, double speed) {
        //Formula - 35.74 + 0.6215(temp) - 35.75(speed^0.16) + 0.4275(temp)(speed^0.16)
        double total = 35.74;
        total += 0.6215*temp;
        total -= 35.75*(Math.pow(speed,0.16));
        total += 0.4275*temp*(Math.pow(speed,0.16));
        return total;
    }

}
