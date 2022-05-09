package lec8.hometask1;

public class Runner {
    public static void main(String[] args) {
        Owner ownerOne = new Owner("Vanya FSB", "*very cool guy*");
        Owner ownerTwo = new Owner("Olya The fox", "*just cute fox*");
        Owner ownerThree = new Owner("Ilya bee", "*huging his dog*");

        SimCard cardOne = new SimCard("Life", 375445377712L);
        SimCard cardTwo = new SimCard("A1", 375298800535L);
        SimCard cardThree = new SimCard("Vodafone", 375298473289L);

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("Ipeach 9S++", 322, cardOne);
        Phone phone3 = new Phone("Sumsuk",cardTwo);
        Phone phone4 = new Phone("Nokia",cardThree);

        phone1.receiveCall(cardTwo);
        phone2.receiveCall(cardThree,ownerOne);
        phone3.receiveCall(cardOne, ownerTwo);
        phone4.receiveCall(cardTwo);

        phone2.sendingMassage(cardOne,cardTwo);


    }
}
