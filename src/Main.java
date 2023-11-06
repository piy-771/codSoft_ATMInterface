import java.util.Scanner;


     class atm{
        double balance;
        int pin = 7967;

        public void checkPin(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Pin");
            int enteredPin = sc.nextInt();
            if(enteredPin==pin){
                menu();
            }
            else {
                System.out.println("You Entered the wrong pin");
            }
        }
        public void menu(){

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4.  Exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice==1){
                checkBalance();
            } else if (choice==2) {
                deposit();

            } else if (choice==3) {
                withdraw();

            }else if(choice==4){
                System.out.println("Thanks You for using ATM");
            }
            else{
                System.out.println("You entered the invalid option");
            }
        }
        public void checkBalance(){
            System.out.println("Your available balance is "+ this.balance);
            menu();
        }
        public void deposit(){
            System.out.println("Enter the depositing amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            this.balance += amount;
            System.out.println("Your " + amount + "amount has been deposit.Your new balance is "+ this.balance);
            menu();
        }
        public void withdraw(){
            System.out.println("Enter the withdrawing amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            if(amount>0 && amount<=this.balance){
                this.balance -= amount;
                System.out.println("Your " + amount + "amount has been withdraw.Your new balance is " + this.balance);
            }else {
                System.out.println("You entered the invalid amount");
            }
            menu();
        }



    }

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to ATM Machine");
        atm obj = new atm();
        obj.checkPin();
        obj.balance=1000;//initial amount







    }
}