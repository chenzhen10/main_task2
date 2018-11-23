package by.epam.training.kimbar.model.entity;


import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.ArrayList;
import java.util.List;

public class Librarian {

    public static List getBooks(Library lib){
        List books = new ArrayList();
        for(PublicationEntity  publ : lib.getPe()){
            books.add(publ);
        }
        return books;
    }


}
