package lec8.hometask1;

public class Runner {
    public static void main(String[] args) {
        SimCard cardOne = new SimCard("Ivanov Ilya", 375445377712L);
        SimCard cardTwo = new SimCard("Kratos God", 375298800535L);
        SimCard cardThree = new SimCard("Zeus God", 375298473289L);

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("Ipeach 9S++", 322, cardOne);
        Phone phone3 = new Phone("Sumsuk",cardTwo);
        Phone phone4 = new Phone("Nokia",cardThree);

        phone1.receiveCall(cardTwo);
        phone2.receiveCall(cardThree,"*very cool guy*");
        phone3.receiveCall(cardOne, "*huging his dog*");
        phone4.receiveCall(cardTwo);

        phone2.sendingMassage(cardOne,cardTwo);


    }
}
