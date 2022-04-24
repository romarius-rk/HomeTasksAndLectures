package lec6.task1_CretitCard;

public class CreditCard {

    long bankAccountNumber;
    double currentBalance;

    public CreditCard() {
    }

    public CreditCard(long bankAccountNumber, double currentBalance) {
        this.bankAccountNumber = bankAccountNumber;
        this.currentBalance = currentBalance;
    }

    public void withdrawCash(double withdrawalOfMoney) {
        this.currentBalance -= withdrawalOfMoney;
        System.out.printf("С вашего счёта списано %f.\n", withdrawalOfMoney);
    }

    public void creditCash(double refill) {
        this.currentBalance += refill;
        System.out.printf("На ваш счёт зачислино %f.\n", refill);
    }

    public void displayBalance() {
        System.out.printf("На вашем счету %f средств.\n", this.currentBalance);
    }
}
