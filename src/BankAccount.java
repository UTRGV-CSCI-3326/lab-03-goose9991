public class BankAccount {
    public static void main(String[] args){
        //initialize starting balance
        double balance = 2175.37;
        //perform transactions
        balance -= 302.5;
        balance += 50.03;
        balance /= 2;
        balance += 20;
        balance -= 1;
        balance *= 2;
        balance += 1;
        //print final balance formatted to hundredths place
        System.out.printf("%.2f\n", balance);
    }
}
