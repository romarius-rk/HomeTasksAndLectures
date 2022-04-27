package lec8.lecture.task1;

public class PaperEdition implements Printble {
    protected String name;

    public PaperEdition(String name) {
        this.name = name;
    }

    @Override
    public void print(Library type) {
        System.out.println("This " + type + " name is " + name);
    }

    public String getName() {
        return name;
    }
}
