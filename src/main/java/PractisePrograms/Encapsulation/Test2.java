package PractisePrograms.Encapsulation;

public class Test2 {
    public static void main(String[] args) {
        bankAccount bankacc = new bankAccount();
        bankacc.setAccountNo("11223344");
        bankacc.setBalance(100);
        System.out.println("Your AccountNo. is : " + bankacc.getAccountNo());
        System.out.println("Current Balance : " + bankacc.getBalance());
        bankacc.withdraw(10);
        System.out.println("Current Balance : " +bankacc.getBalance());
        bankacc.deposit(50);
        System.out.println("Current Balance : " +bankacc.getBalance());
        System.out.println();
    }
}
