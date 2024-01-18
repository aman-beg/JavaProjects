package EmployeePayrollSystem.src;

import java.util.*;

abstract class Employee{
    private String name;
    private int id;

    Employee(String name, int id){
        this.name = name;
        this.id  = id;
    }
    

    int getId(){
        return id;
    }

    @Override
    public String toString(){
        return ("Employee [name="+name+", id="+id+", Monthly Salary="+calculateSalary()+"]");
    }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary(){
        return monthlySalary;
    }

}

class PartTimeEmployee extends Employee{
    private int hoursworked;
    private double hourlyRate;

    PartTimeEmployee(String name, int id,int hoursworked, double hourlyRate){
        super(name,id);
        this.hourlyRate = hourlyRate;
        this.hoursworked = hoursworked;
    }

    double calculateSalary(){
        return hourlyRate*hoursworked;
    }
}

class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for (Employee employee : employeeList){
            if(employee.getId()==id){
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String [] args){
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("yahya",1, 40000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Kulsum",2, 40, 900);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial employee details : ");
        payrollSystem.displayEmployee();
        System.out.println("removing emp1");
        payrollSystem.removeEmployee(1);
        System.out.println("Remaining employee details : ");
        payrollSystem.displayEmployee();
    }
}
