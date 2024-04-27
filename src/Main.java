public class Main {

    public static void main(String[]args){

        Employee john = new Employee("john","05/07/1996",
                "01/01/2020");
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("Pay = " + john.collectPay());

        SalaryEmployee brent = new SalaryEmployee("Brent","11/14/1990",
                "03/03/2020", 80000);
        System.out.println(brent);
        System.out.println("Brent's Paycheck = $" + brent.collectPay());

        brent.retire();
        System.out.println("Brent's Pension check = S" + brent.collectPay());

        HourlyEmployee chelsea = new HourlyEmployee("Chelsea", "09/01/1992",
                "02/07/2021", 23.85);
        System.out.println(chelsea);
        System.out.println("Chelsea's Paycheck = $" + chelsea.collectPay());
        System.out.println("Chelsea's Holiday Pay = $" + chelsea.getDoublePay());
    }
}
