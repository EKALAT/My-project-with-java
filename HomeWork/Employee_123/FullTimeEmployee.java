package Employee_123;

public class FullTimeEmployee extends Employee implements IEmployee{
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return paymentPerHour * 100;
    }
}
