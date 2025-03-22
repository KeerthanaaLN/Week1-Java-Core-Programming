import java.util.*;

public class EmployeeBonusCalculator {
    static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2];
        
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            employeeData[i][1] = rand.nextInt(11);
        }
        return employeeData;
    }
    
    static double[][] calculateNewSalary(double[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] salaryBonusData = new double[numEmployees][3];
        
        for (int i = 0; i < numEmployees; i++) {
            double salary = employeeData[i][0];
            double experience = employeeData[i][1];
            double bonusPercentage = (experience > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            salaryBonusData[i][0] = salary;
            salaryBonusData[i][1] = newSalary;
            salaryBonusData[i][2] = bonus;
        }
        return salaryBonusData;
    }
    
    static void displayResults(double[][] employeeData, double[][] salaryBonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("Emp\tSalary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t\t%.2f\n", 
                (i + 1), employeeData[i][0], employeeData[i][1], salaryBonusData[i][1], salaryBonusData[i][2]);
            totalOldSalary += salaryBonusData[i][0];
            totalNewSalary += salaryBonusData[i][1];
            totalBonus += salaryBonusData[i][2];
        }
        
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }
    
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] salaryBonusData = calculateNewSalary(employeeData);
        displayResults(employeeData, salaryBonusData);
    }
}
