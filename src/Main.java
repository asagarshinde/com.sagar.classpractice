public class Main {
    public static void main(String [] args){
        BankAccount first = new BankAccount(1,4000,"Sagar","sagar@shinde.com","123456789");

        System.out.println(first.getAccountNumber());
        System.out.println(first.getEmail());
        first.deposit(100);
        first.withdraw(25);
    }
}
