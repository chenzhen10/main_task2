package by.epam.training.kimbar.util.filehandler;

import java.util.ArrayList;
import java.util.List;

public class ValidateFromFile {

    public static List getValidateVectorFromFile(String txt) {
        String[] arr = txt.split(" ");
        int i = 0;
        ArrayList k = new ArrayList();
        while (i < arr.length) {
            if (arr[i].matches("[-+]?\\d+")) {
                k.add(arr[i]);
            }
            i++;
        }
        return k;
    }
}
