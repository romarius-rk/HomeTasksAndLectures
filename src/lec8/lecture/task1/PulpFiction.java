package lec8.lecture.task1;

public class PulpFiction {
    public static void main(String[] args) {
        Book book1 = new Book("Fight club");
        Book book2 = new Book("End of eternity");
        Book book3 = new Book("Survived");
        Magazine mag1 = new Magazine("Pulp Fiction");
        Magazine mag2 = new Magazine("Cosmopolitan");
        Magazine mag3 = new Magazine("Popular mechanic");

        Printble[] printbles = {book1,mag1,book2,mag3,book3,mag2};

        printMagazines(printbles);
        System.out.println("=============");
        printBooks(printbles);

    }

    public static void printMagazines (Printble[] printbles){
        for (int i = 0; i< printbles.length; i++){
            if (printbles[i] instanceof Magazine){
                ((Magazine) printbles[i]).print(Library.MAGAZINE);
            }
        }
    }

    public static void printBooks (Printble[] printbles){
        for (int i = 0; i< printbles.length; i++){
            if (printbles[i] instanceof Book){
                ((Book) printbles[i]).print(Library.BOOK);
            }
        }
    }
}
