package by.epam.training.kimbar.model.entity;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;
import by.epam.training.kimbar.model.exception.logic.IllegalPopularityException;
import by.epam.training.kimbar.model.exception.logic.IllgealAmountOfPagesException;
import org.junit.Test;

public class MagazineEntityTest {
    MagazineEntity magazine;

    @Test(expected  =   IllgealAmountOfPagesException.class)
    public void setAmountOfPagesTest() throws IllgealAmountOfPagesException {
        magazine = new MagazineEntity();
        magazine.setAmountOfPages(-5);
    }
    @Test(expected  =   IllegalPopularityException.class)
    public void setPopularityTest() throws IllegalPopularityException {
        magazine = new MagazineEntity();
        magazine.setPopularity(-5);
    }
    @Test
    public void ConstructorWithParametersTest(){
        magazine = new MagazineEntity(22,
                "Mumu","Turhenev","Story",
                7,
                true);
        boolean expected = true;
        assertEquals(expected,magazine.isWithHotNews());
    }
}
