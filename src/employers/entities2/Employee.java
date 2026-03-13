package employers.entities2;

public class Employee {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double x) {
        GrossSalary = GrossSalary + GrossSalary * x / 100.0;
    }

    public String toString() {
        return Name + ", $ " + String.format("%.2f", NetSalary());

    }
}
