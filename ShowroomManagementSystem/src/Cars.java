package ShowroomManagementSystem.src;

import java.util.Scanner;

public class Cars extends Showroom {
    String carName;
    String carColor;
    String carType;
    String carFuelType;
    int carPrice;
    String carTransmission;

    @Override
    public void getDetails(){
        System.out.println("========= CAR DETAILS =========");
        System.out.println("CAR NAME : "+carName);
        System.out.println("CAR COLOR : "+carColor);
        System.out.println("CAR TYPE : "+carType);
        System.out.println("CAR FUEL TYPE : "+carFuelType);
        System.out.println("CAR TRANSMISSION : "+carTransmission);
        System.out.println("CAR PRICE : "+carPrice);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== ENTER CAR DETAILS =======================");
        System.out.println();
        System.out.print("CAR NAME = ");
        carName = sc.nextLine();
        System.out.print("CAR COLOR = ");
        carColor = sc.nextLine();
        System.out.print("CAR TYPE (SEDAN/SUV/HATCHBACK) = ");
        carType = sc.nextLine();
        System.out.print("CAR FUEL TYPE = ");
        carFuelType = sc.nextLine();
        System.out.print("CAR TRANSMISSION (AUTOMATIC/MANUAL) = ");
        carTransmission = sc.nextLine();
        System.out.print("CAR PRICE = ");
        carPrice = sc.nextInt();
        totalCars++;
    }
}
