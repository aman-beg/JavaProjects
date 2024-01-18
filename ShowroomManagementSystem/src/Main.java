package ShowroomManagementSystem.src;

import java.util.Scanner;

// iterface for this package
interface Utility{
        void getDetails();
        void setDetails();
}

public class Main {
    static void menu(){
        System.out.println();
        System.out.println("====================== WELCOME TO SHOWROOM MANAGEMENT SYSTEM =====================");
        System.out.println();
        System.out.println("================================= ENTER YOUR CHOICE =============================");
        System.out.println();
        System.out.println("1. ADD SHOWROOM                    2. ADD EMPLOYEE                  3. ADD CARS");
        System.out.println();
        System.out.println("4. GET SHOWROOM                    5. GET EMPLOYEE                  6. GET CARS");
        System.out.println();
        System.out.println("================================= ENTER 0 TO EXIT ===============================");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employee[] employee = new Employee[5];
        Cars[] cars = new Cars[5];
        int showroomCounter = 0;
        int employeeCounter = 0;
        int carsCounter = 0;
        int choice = 100;
        while (choice!=0){
            menu();
            choice = sc.nextInt();
            while (choice!=0 & choice!=9){
                switch (choice){
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1. ADD NEW SHOWROOM");
                        System.out.println("9. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employeeCounter] = new Employee();
                        employee[employeeCounter].setDetails();
                        employeeCounter++;
                        System.out.println();
                        System.out.println("2. ADD NEW EMPLOYEE");
                        System.out.println("9. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        cars[carsCounter] = new Cars();
                        cars[carsCounter].setDetails();
                        carsCounter++;
                        System.out.println();
                        System.out.println("3. ADD NEW CAR");
                        System.out.println("9. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i=0;i<showroomCounter;i++){
                            showroom[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU");
                        System.out.println("0. EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i=0;i<employeeCounter;i++){
                            employee[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU");
                        System.out.println("0. EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i=0;i<carsCounter;i++){
                            cars[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU");
                        System.out.println("0. EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;
                }
            }
        }
        sc.close();
        System.out.println("************************************************");
        System.out.println("****************** THANKS YOU! *****************");
        System.out.println("************************************************");
    }
}
