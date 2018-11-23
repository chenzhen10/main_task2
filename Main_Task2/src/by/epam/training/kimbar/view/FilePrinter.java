package by.epam.training.kimbar.view;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    File file = new File("D:\\test.txt");
    FileWriter fw;

    {
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void print(String o) throws IOException {
        fw.write(o);
        fw.flush();
        fw.write("\n");
    }

}
