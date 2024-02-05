package homework_3.SRP;

public class Main {
    public static void main(String[] args) {
        Emploee manager = new Emploee("Manager", 2);
        CalculateSalary calculateSalary = new CalculateSalary(1000);
        System.out.println("Salary of " + manager.name+ " = " + calculateSalary.calculateSalary(manager) + " USD");
    }
}