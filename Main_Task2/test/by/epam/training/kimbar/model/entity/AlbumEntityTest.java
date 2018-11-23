package by.epam.training.kimbar.model.entity;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.exception.logic.IllegalPopularityException;
import by.epam.training.kimbar.model.exception.logic.IllgealAmountOfPagesException;
import org.junit.Test;



public class AlbumEntityTest {
    AlbumEntity al ;



    @Test(expected  =   IllgealAmountOfPagesException.class)
    public void setAmountOfPagesTest() throws IllgealAmountOfPagesException {
        al = new AlbumEntity();
        al.setAmountOfPages(-5);
    }
    @Test(expected  =   IllegalPopularityException.class)
    public void setPopularityTest() throws IllegalPopularityException {
        al = new AlbumEntity();
        al.setPopularity(-5);
    }
    @Test
    public void ConstructorWithParametersTest(){
        al  = new AlbumEntity(22,
                "Mumu","Turhenev","Story",
                8,
                "Well");;
        String expected = "Average";
        assertEquals(expected,al.getQualityOfPaper());
    }





}
