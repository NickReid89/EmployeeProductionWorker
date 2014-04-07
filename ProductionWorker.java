import java.util.Date;

public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyPay;

    ProductionWorker() {

    }

    ProductionWorker(int shift, double hourlyPay, String name, String empNum, Date hireDate) throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber {
	// Throws exception if the hourly rate is below zero.
        if (hourlyPay < 0) {
            throw new InvalidPayRate();
	// Throws an exception if the shift is not a 1 or a two.
        } else if (shift < 1 || shift > 2) {
            throw new InvalidShift();
        } else {
            this.setName(name);
            this.setEmpNumber(empNum);
            this.setHireDate(hireDate);
            this.shift = shift;
            this.hourlyPay = hourlyPay;
        }
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) throws InvalidShift {
        if (shift < 1 || shift > 2) {
            throw new InvalidShift();
        } else {
            this.shift = shift;
        }
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) throws InvalidPayRate {
        if (hourlyPay < 0) {
            throw new InvalidPayRate();
        }else{
        this.hourlyPay = hourlyPay;
        }
    }
}
