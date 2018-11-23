package by.epam.training.kimbar.view;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String o) {
        System.out.println(o);
    }
}
