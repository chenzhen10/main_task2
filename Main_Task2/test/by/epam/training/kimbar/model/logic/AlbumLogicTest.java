package by.epam.training.kimbar.model.logic;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class AlbumLogicTest {
   static   AlbumLogic  al;
    static AlbumEntity[] ae;

    @BeforeClass
    public static void  init(){
        ae = new AlbumEntity[3];
        al = new AlbumLogic();
        Random rnd = new Random();
        ae[0] = new AlbumEntity(15,
                "SaceLearning","Fresko","Science",
                rnd.nextInt(5)+1,
                "Bad");
        ae[1] = new AlbumEntity(23,
                "Master and Margarita","Bulgakov","Novel",
                rnd.nextInt(5)+1,
                "Good");
        ae[2] = new AlbumEntity(22,
                "Mumu","Turhenev","Story",
                rnd.nextInt(5)+1,
                "Well");
    }

    @Test
    public void sortByPagesTest(){
        int i = 0;
        int tmp = 0 ;
        Arrays.sort(ae);
        int[] arr = {23,22,15};
        int exp = 3;
        for (AlbumEntity ab: ae ) {
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
        Arrays.sort(ae);
        int[] arr = {4,7,9};
        int exp = 3;
        for (AlbumEntity ab : ae ) {
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
        String test = "Bad";
        al.findByParameters(ae,"Bad");
        for (AlbumEntity ab: ae ) {
            if(test.equals(ab.getQualityOfPaper())){
                tmp++;
            }
        }
        assertEquals(tmp,exp);
    }

    @Test
    public void findByMinPagesTest(){
        int exp = 15;
        assertEquals(exp,al.findByMinPages(ae).getAmountOfPages());
    }

    @Test
    public void findByMaxPagesTest(){
        int exp = 23;
        assertEquals(exp,al.findByMaxPages(ae).getAmountOfPages());
    }

    @Test
    public void getTheMostPopularPublicationTest(){
        int exp = 9;
        assertEquals(exp,al.getTheMostPopularPublication(ae).getPopularity());
    }

}
