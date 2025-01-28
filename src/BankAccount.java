public class BankAccount {
    public static void main(String[] args){
        double balance = 2175.37;
        balance -= 302.5;
        balance += 50.03;
        balance /= 2;
        balance += 20;
        balance -= 1;
        balance *= 2;
        balance += 1;
        System.out.printf("%.2f\n", balance);
    }
}
