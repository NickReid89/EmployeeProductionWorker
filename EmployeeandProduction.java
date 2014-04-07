
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.InputMismatchException;

public class EmployeeandProduction {

    public static void main(String[] args)throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber{
	//Call to make an employee.
        MakeEmployee();
    }

    public static void MakeEmployee() throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber {
      	//created a default date so not to run into a null exception.
        Date date = new Date(01, 01, 01);
        Scanner sc = new Scanner(System.in);
	//create the worker object.
        ProductionWorker pr = new ProductionWorker();
	
	// Note: While the custom exceptions are not in this class they are still called
	// 	 in the production and employee class. I felt this would be a little more
	// 	 clean to do it this way.
        try {
            out.print("Which shift will the employee be working?\n");
            pr.setShift(sc.nextInt());
            out.print("\nWhat is the hourly wage of the employee?\n");
            pr.setHourlyPay(sc.nextDouble());
            out.print("\nWhat is the name of the employee?\n");
            pr.setName(sc.next());
            out.print("\nWhat is the employees number?\n");
            pr.setEmpNumber(sc.next());
            out.print("\nwhat is the day of hire for the employee?\n");
            date.setDate(sc.nextInt());
            out.print("\nwhat is the month of hire for the employee?\n");
            date.setMonth(sc.nextInt());
            out.print("\nwhat is the year of hire for the employee?\n");
            date.setYear(sc.nextInt());
            out.print("\n Production Worker created!");
	// Catch in the case where the user types in random characters.
        } catch (InputMismatchException ime) {
            out.print("Input mismatch! Looking for an integer only!");
	// Just in case
        }catch (Exception e) {
            out.print(e);
        }

    }

}
