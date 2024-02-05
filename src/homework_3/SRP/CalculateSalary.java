package homework_3.SRP;

public class CalculateSalary {
    int baseSalary;

    public CalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(Emploee emploee) {
        return baseSalary * emploee.salaryFactor;
    }
}
