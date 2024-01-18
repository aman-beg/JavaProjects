package ATM.src;

import java.util.HashMap;
import java.util.Scanner;

public class Operation {
    Scanner scan = new Scanner(System.in);
    int pincode,choice;
    float amount;
    HashMap <Integer,Data> map = new HashMap<>();

    Operation(){
        inputPinCode();
    }

    void inputPinCode(){
        System.out.println("*************************************************************");
        System.out.print("Enter Your Secret PinCode : ");
        try {
            pincode=scan.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception Occured : "+e);
            System.out.println();
            System.out.println("Kindly Restart The Program!");
            System.out.println();
            System.exit(1);
        }
        
        Account();
    }

    void inputChoice(){
        try {
            choice = scan.nextInt();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception Occured : "+e);
            System.out.println();
            System.out.println("Kindly Restart The Program!");
            System.out.println();
            System.exit(1);
        }
    }

    float inputAmount(){
        try {
            amount = scan.nextFloat();
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception Occured : "+e);
            System.out.println();
            System.out.println("Kindly Restart The Program!");
            System.out.println();
            System.exit(1);
        }
        return amount;
    }

    void Account(){

        if (map.containsKey(pincode)){
            Data ob = map.get(pincode);
            menu();
            operate(ob);
        } else {
            System.out.println();
            System.out.println();
            System.out.println("Your PinCode doesn't exist!");
            System.out.println("Create Account First!");
            System.out.println("*************************************************************");
            System.out.println("Enter 0 to create Account");
            System.out.println("Enter 9 to ReEnter PinCode");
            inputChoice();
            if (choice == 0){
                Data ob = new Data();
                map.put(pincode, ob);
                System.out.println("Account Created with recent PinCode");
                System.out.println("Choose Operations for Your Account");
                menu();
                operate(ob);
            } else if(choice == 9){
                inputPinCode();
            } else {
                System.out.println("Enter Valid Input");
            }
        }
    }


    void operate(Data ob){
        // inputting choice for operation
        System.out.println("*************************************************************");
        System.out.print("Enter Your Choice : ");
        inputChoice();
        // operations according to the choice
        switch (choice) {
            case 1:
                checkBalance(ob);
                menu();
                operate(ob);
            case 2:
                deposit(ob);
                menu();
                operate(ob);
            case 3:
                withdraw(ob);
                menu();
                operate(ob);
            case 4:
                inputPinCode();
            case 5:
                break;
            default:
                System.out.println("Enter Valid Choice!");
                menu();
                operate(ob);
        }
    }

    void menu(){
        System.out.println("*************************************************************");
        System.out.println("Please Select valid input!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. WithDraw Amount");
        System.out.println("4. Switch Account");
        System.out.println("5. Exit");
        System.out.println("*************************************************************");
    }
    void checkBalance(Data ob){
        System.out.println("Your Account Balance : "+ob.balance);
    }
    void deposit(Data ob){
        System.out.print("Enter Amount : ");
        ob.balance+=inputAmount();
        System.out.println("Amount Deposited Successfully!");
    }
    void withdraw(Data ob){
        System.out.print("Enter Amount : ");
        ob.balance-=inputAmount();
        System.out.println("Amount Debited!");
    }
}
