package by.epam.training.kimbar.model.entity;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;
import by.epam.training.kimbar.model.exception.logic.IllegalPopularityException;
import by.epam.training.kimbar.model.exception.logic.IllgealAmountOfPagesException;
import org.junit.Test;

public class PublicationEntityTest {
    PublicationEntity publicationEntity;

    @Test(expected  =   IllgealAmountOfPagesException.class)
    public void setAmountOfPagesTest() throws IllgealAmountOfPagesException {
        publicationEntity = new PublicationEntity();
        publicationEntity.setAmountOfPages(-5);
    }
    @Test(expected  =   IllegalPopularityException.class)
    public void setPopularityTest() throws IllegalPopularityException {
        publicationEntity = new PublicationEntity();
        publicationEntity.setPopularity(-5);
    }

    @Test
    public void ConstructorWithParametersTest(){
        publicationEntity = new PublicationEntity(15,
                "SpaceLearning","Fresko",9,
                "Science");;
        int expected = 150;
        assertEquals(expected,publicationEntity.getAmountOfPages());
    }



}
