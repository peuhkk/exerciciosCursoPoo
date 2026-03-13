package employers.application2;

import employers.entities2.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Employee: "+ employee.Name+ ", $ " + employee.NetSalary());

        System.out.println();
        System.out.print("Wich percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.print("");
        System.out.print("Updated data: "+ employee.Name+ ", $ " + employee.NetSalary());

    }
}
