package lec6.task1_CretitCard;

public class Main {
    public static void main(String[] args) {
        CreditCard cardOne = new CreditCard(1111222233334444L, 314.6);
        CreditCard cardTwo = new CreditCard(2222444466668888L, 14.88);
        CreditCard cardThree = new CreditCard(1111333355557777L, 322.07);

        cardOne.displayBalance();
        cardTwo.displayBalance();
        cardThree.displayBalance();

        cardOne.withdrawCash(141.35);
        cardTwo.withdrawCash(0.88);
        cardThree.creditCash(228.01);

        cardOne.displayBalance();
        cardTwo.displayBalance();
        cardThree.displayBalance();

    }
}
