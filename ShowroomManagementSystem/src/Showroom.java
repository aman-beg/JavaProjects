package ShowroomManagementSystem.src;
import java.util.Scanner;
public class Showroom implements Utility{
    String showroomName;
    String showroomAddress;
    String managerName;
    int totalEmployees;
    int totalCars = 0;

    @Override
    public void getDetails(){
        System.out.println("========= SHOWROOM DETAILS =========");
        System.out.println("SHOWROOM NAME = "+showroomName);
        System.out.println("SHOWROOM ADDRESS = "+showroomAddress);
        System.out.println("MANAGER NAME = "+managerName);
        System.out.println("TOTAL EMPLOYEES = "+totalEmployees);
        System.out.println("TOTAL CARS = "+totalCars);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== ENTER SHOWROOM DETAILS =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME = ");
        showroomName = sc.nextLine();
        System.out.print("SHOWROOM ADDRESS = ");
        showroomAddress = sc.nextLine();
        System.out.print("MANAGER NAME = ");
        managerName = sc.nextLine();
        System.out.print("TOTAL EMPLOYEES = ");
        totalEmployees = sc.nextInt();
        System.out.print("TOTAL CARS = ");
        totalCars = sc.nextInt();
    }
}
