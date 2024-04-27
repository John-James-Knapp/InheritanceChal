public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
        this.name = "Anonymous";
        this.birthDate = "Unknown";
        this.endDate = "Unknown";
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge(){
        int birthYear = Integer.parseInt(birthDate.substring(6));
        int currentYear = 2024;
        return currentYear - birthYear;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @java.lang.Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
