package by.epam.training.kimbar.model.logic;
import static org.junit.Assert.*;

import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class MagazineLogicTest {
    static MagazineEntity[] me;
    static MagazineLogic ml;

    @BeforeClass
    public static void  init(){
        ml = new MagazineLogic();
        me = new MagazineEntity[3];
        me[0] = new MagazineEntity(15,
                "SaceLearning","Fresko","Science",
                9,
                true);
        me[1] = new MagazineEntity(23,
                "Master and Margarita","Bulgakov","Novel",
                10,
                true);
        me[2] = new MagazineEntity(22,
                "Mumu","Turhenev","Story",
                3,
                false);
    }

    @Test
    public void sortByPagesTest(){
        int i = 0;
        int tmp = 0 ;
        Arrays.sort(me);
        int[] arr = {23,22,15};
        int exp = 3;
        for (MagazineEntity ab: me ) {
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
        int[] arr = {2,8,9};
        int exp = 3;
        Arrays.sort(me);
        for (MagazineEntity ab: me ) {
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
        ml.findByParameters(me,false);
        int exp = 1;
        boolean flag = false;
        for (MagazineEntity ab: me ) {
            if(flag == ab.isWithHotNews()){
                tmp ++;
            }
        }
        assertEquals(exp,tmp);

    }
    @Test
    public void findByMinPagesTest(){
        int exp = 15;
        assertEquals(exp,ml.findByMinPages(me).getAmountOfPages());

    }

    @Test
    public void findByMaxPagesTest(){
        int exp = 23;
        assertEquals(exp,ml.findByMaxPages(me).getAmountOfPages());
    }

    @Test
    public void getTheMostPopularPublicationTest(){
        int exp = 10;
        assertEquals(exp,ml.getTheMostPopularPublication(me).getPopularity());

    }
}
