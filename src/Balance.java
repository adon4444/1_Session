
import java.util.Scanner;

public class Balance {
    public static void main(String[] args){

        int balance = 100;

        while(balance > 0){

        System.out.println("Balance = $" + balance);
        System.out.println("Amount to Withdraw?");
        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();

        balance -= amount;

        if (balance < 0){
            System.out.println("Incefficent Balance");
            balance +=amount;
        }
            }
        }
}


//   Scanner input = new Scanner(System.in);
//  int amount = input.nextInt();