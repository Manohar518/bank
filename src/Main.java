import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name,password and initial balance");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIAccount manuAcc=new SBIAccount(name,balance,password);
        System.out.println("Your account has been created with account number" +manuAcc.getAccountNo());

        //get balance
        System.out.println("your current balance is" +manuAcc.getBalance());

        //deposit
        System.out.println(manuAcc.depositMoney(500));
        System.out.println("new balance" +manuAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdraw:");
        int amount=sc.nextInt();
        System.out.println("enter your password");
        String enteredPassword=sc.next();

        System.out.println(manuAcc.withdraw(amount,enteredPassword));
        System.out.println("current balance"+manuAcc.getBalance());

        System.out.println("interest for 4 yea4s on current balanfe "+manuAcc.getBalance()+"is"+manuAcc.calculateInterest(4));
    }
}