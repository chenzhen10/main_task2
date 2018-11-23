package by.epam.training.kimbar.model.entity;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class LibraryTest {
    Library lib;

    @Test
    public void getTest(){
        lib = new Library();
        AlbumEntity ae = new AlbumEntity(15,
                "SaceLearning","Fresko","Science",
                9,
                "Bad");
        AlbumEntity ae1 = new AlbumEntity(23,
                "Master and Margarita","Bulgakov","Novel",
                8,
                "Good");
        AlbumEntity  ae2 = new AlbumEntity(22,
                "Mumu","Turhenev","Story",
                3,
                "Well");
        ArrayList al = new ArrayList();
        al.add(ae);
        al.add(ae1);
        al.add(ae2);
        lib.setPe(al);
        assertEquals(al,lib.getPe());
    }
}
