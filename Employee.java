import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    private String name;
    private String empNumber;
    private Date hireDate;
	
    //default constructor.
    Employee() {

    }

    public Employee(String name, String empNumber, Date hireDate) {
        this.name = name;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNumber() {
        return empNumber;
    }

     //What I'm doing here is taking the employees name and comparing it to a 
     //regular expression. If the name doesn't match it'll throw an exception.
    public void setEmpNumber(String empNumber) throws InvalidEmployeeNumber {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\-\\D");
        Matcher matcher = pattern.matcher(empNumber);
        
        if(matcher.matches()){
        this.empNumber = empNumber;
        }
        else{
            throw new InvalidEmployeeNumber();
        }
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

}
