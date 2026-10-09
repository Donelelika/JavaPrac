package group1.bankprogram;
import java.util.Scanner;

public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ;
       //declare variales
       double balance = 122345;
       boolean isRunning=true;
       int choices;
       
       //display menu
       while(isRunning){
       System.out.println("                                                                            ");
       System.out.println("____________________________________________________________________________");
       System.out.println("               "+"Banking Program"+"                 ");
       System.out.println("____________________________________________________________________________");
       System.out.println("1.Show Balance");
       System.out.println("2.Deposit");
       System.out.println("3.Withdraw");
       System.out.println("4.Exit");
       
       
       System.out.print("Enter your choice(1-4):");
       choices = scanner.nextInt();
       
       
       switch(choices){
           case 1-> showBalance(balance);
           case 2-> balance = balance + deposit();
           case 3-> balance= balance - withdraw(balance);
           case 4-> isRunning= false;
           default -> System.out.println("invalid choice");
       }
       }
       System.out.println("Thank you, Have a nie day!");
       
       
      
      
    }
    static void showBalance(double balance){
    System.out.printf("$%.2f\n" , balance);
    }
    static double deposit(){
    double amount;
    System.out.print("Enter  deposit amount:");
    amount = scanner.nextDouble();
    if (amount<0){
    System.out.println("Amount cannot be negative!");
    return 0;
    }
    else{
    return amount;    
        }
    }
    static double withdraw(double balance){
    double amount;
    
    System.out.print("Enter anount to be withdrawn:");
    amount= scanner.nextDouble();
    
    if(amount> balance){
        System.out.println("INSUFFICIENT FUNDS");
        return 0;
    }
    else if (amount<0){
    System.out.println("Amount cannot be negative");
    return 0; 
    } 
    else
    {return amount;
    }
        
    }
}
