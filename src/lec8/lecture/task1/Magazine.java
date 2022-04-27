package lec8.lecture.task1;

public class Magazine extends PaperEdition{

    public Magazine(String name) {
        super(name);
    }

    @Override
    public void print(Library type) {
        super.print(type);
        System.out.println("just magazine");
    }
}
