/*Canvas assignment
 * Jennifer Lee
 * 1/16/2019
 * Calculate the employee's pay
 * */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare variables
        String employeeNum;
        double hrWorked;
        double payRate;
        double wklyPay;
        final double MAX_HRLY_RATE = 25.0;
        final double MAX_HR_ALLOWED = 60.0;
        final double basePayHr = 35.0;

        // get values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the employee number: ");
        employeeNum = keyboard.nextLine(); // nextLine will read to the end of the line
        System.out.println("Enter the pay rate: ");
        payRate = keyboard.nextDouble();
        System.out.println("Enter the number of hours worked in the week: ");
        hrWorked = keyboard.nextDouble();

        // display the inputs
        System.out.println("The employee number is " + employeeNum);
        System.out.println("The pay rate is $" + payRate + "/hr");
        System.out.println("The number of hours worked in the week is " + hrWorked + "\n");

        // validate whether pay rate and hours worked are in range
        if(payRate <= MAX_HRLY_RATE && hrWorked <= MAX_HR_ALLOWED){
            // calculate weekly pay
            if(hrWorked <= basePayHr){
                wklyPay = hrWorked * payRate;
            } else
                wklyPay = basePayHr * payRate + (hrWorked-basePayHr)*(payRate*1.5);
            System.out.println("The weekly pay for recorded hours of " + hrWorked + " is $" + wklyPay);
        } else
            System.out.println("ERROR: The value you entered is out of range. \n" +
                    "The maximum pay rate is $25/hr and the maximum " +
                    "hours allowed per week is 60. \n" +
                    "Please enter the correct value.");

    }
}
