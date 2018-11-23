package by.epam.training.kimbar.model.logic;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.book.BookEntity;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BookLogicTest {
    static BookEntity[] be;
    static BookLogic bl;

    @BeforeClass
    public static void  init(){

        bl = new BookLogic();
        be = new BookEntity[3];
        be[0] = new BookEntity(15,
                "SaceLearning","Fresko","Science",
                7,
                "Solid");
        be[1] = new BookEntity(23,
                "Master and Margarita","Bulgakov","Novel",
                9,
                "Soft");
        be[2] = new BookEntity(22,
                "Mumu","Turhenev","Story",
                8,
                "Half-Solid");
    }

    @Test
    public void sortByPagesTest(){
        int i = 0;
        int tmp = 0 ;
        Arrays.sort(be);
        int[] arr = {23,22,15};
        int exp = 3;
        for (BookEntity ab: be ) {
            if(arr[i] == ab.getAmountOfPages()){
                tmp++;
            }
            i++;
        }
        assertEquals(exp,tmp);

    }

    @Test
    public void sortByPopularityTest(){
        int i = 0;
        int tmp = 0 ;
        Arrays.sort(be);
        int[] arr = {9,7,4};
        int exp = 3;
        for (BookEntity ab : be ) {
            if(arr[i] == ab.getPopularity()){
                tmp++;
            }
            i++;
        }
        assertEquals(exp,tmp);
    }

    @Test
    public void findByParametersTest(){
        int tmp = 0 ;
        int exp = 1;
        String test = "Half-Solid";
        bl.findByParameters(be,"Half-Solid");
        for (BookEntity ab: be ) {
            if(test.equals(ab.getCover())){
                tmp++;
            }
        }
        assertEquals(exp,tmp);
    }

    @Test
    public void findByMinPagesTest(){
        int exp = 15;
        assertEquals(exp,bl.findByMinPages(be).getAmountOfPages());
    }

    @Test
    public void findByMaxPagesTest(){
        int exp = 23;
        assertEquals(exp,bl.findByMaxPages(be).getAmountOfPages());
    }

    @Test
    public void getTheMostPopularPublicationTest(){
        int exp = 9;
        assertEquals(exp,bl.getTheMostPopularPublication(be).getPopularity());
    }
}
