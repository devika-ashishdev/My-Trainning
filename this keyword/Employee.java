

import java.util.Scanner;

public class Employee {
    private double basicSalary;
    private double deduction;
    private double bonus;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        basicSalary = sc.nextDouble();
        System.out.print("Enter deduction: ");
        deduction = sc.nextDouble();
        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();
        sc.close();
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getBonus() {
        return bonus;
    }
}
