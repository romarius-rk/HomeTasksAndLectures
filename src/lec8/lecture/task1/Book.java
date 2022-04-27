package lec8.lecture.task1;

public class Book extends PaperEdition{

    public Book(String name) {
        super(name);
    }

    @Override
    public void print(Library type) {
        super.print(type);
        System.out.println("Books are cool!");
    }
}
