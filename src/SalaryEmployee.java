public class SalaryEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalaryEmployee(String name, String birthDate, String hireDate,
                          double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9*paycheck : paycheck;

        return (int) adjustedPay;
    }
    public void retire(){
        terminate("4/27/2024");
        isRetired = true;
    }
}