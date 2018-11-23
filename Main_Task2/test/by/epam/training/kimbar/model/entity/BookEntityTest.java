package by.epam.training.kimbar.model.entity;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import by.epam.training.kimbar.model.entity.book.BookEntity;
import by.epam.training.kimbar.model.exception.logic.IllegalPopularityException;
import by.epam.training.kimbar.model.exception.logic.IllgealAmountOfPagesException;
import org.junit.Test;

public class BookEntityTest {
    BookEntity book;

    @Test(expected = IllgealAmountOfPagesException.class)
    public void setAmountOfPagesTest() throws IllgealAmountOfPagesException {
        book = new BookEntity();
        book.setAmountOfPages(-5);
    }

    @Test(expected = IllegalPopularityException.class)
    public void setPopularityTest() throws IllegalPopularityException {
        book = new BookEntity();
        book.setPopularity(-5);
    }

        @Test
        public void ContructorWithParametersTest () {
            book = new BookEntity(15,
                    "SaceLearning", "Fresko", "Science",
                    8,
                    "Solid");
            String expected = "Solid";
            assertEquals(expected, book.getCover());
        }
    }

