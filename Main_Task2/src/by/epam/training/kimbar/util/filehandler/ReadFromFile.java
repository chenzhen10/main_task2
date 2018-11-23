package by.epam.training.kimbar.util.filehandler;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static String readFromFile(File path) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String line = bf.readLine();
        StringBuilder tmp = new StringBuilder();
        while (line != null) {
            tmp.append(line);
            line = bf.readLine();
        }
        bf.close();
        return String.valueOf(tmp);
    }
}
