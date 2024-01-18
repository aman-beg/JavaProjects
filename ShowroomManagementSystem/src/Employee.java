package ShowroomManagementSystem.src;
import java.util.Scanner;
import java.util.UUID;
public class Employee extends Showroom {
    String employeeId;
    String employeeName;
    String employeeDepartment;
    int employeeAge;

    @Override
    public void getDetails(){
        System.out.println("========= EMPLOYEE DETAILS =========");
        System.out.println("ID : "+employeeId);
        System.out.println("NAME : "+employeeName);
        System.out.println("AGE : "+employeeAge);
        System.out.println("DEPARTMENT : "+employeeDepartment);
        System.out.println("SHOWROOM NAME : "+showroomName);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        UUID uid = UUID.randomUUID();
        employeeId = uid.toString().replace("-","");
        System.out.println("========================= ENTER EMPLOYEE DETAILS ===========================");
        System.out.print("NAME : ");
        employeeName = sc.nextLine();
        System.out.print("AGE : ");
        employeeAge = sc.nextInt();
        sc.nextLine();
        System.out.print("DEPARTMENT : ");
        employeeDepartment = sc.nextLine();
        System.out.print("SHOWROOM NAME : ");
        showroomName = sc.nextLine();
        totalEmployees++;
    }
}
