package by.epam.training.kimbar.util;

import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import by.epam.training.kimbar.model.entity.book.BookEntity;
import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.Random;

public class PublicationInit {
    private static Random rnd = new Random();
    private static final int RANGE_AMOUNT_OF_PAGES = 10;
    private static final String DEFAULT_GENRE = "None";
    private static final int DEFAULT_POPULARITY_RANGE = 10;
    private static final String QUALITY_OF_PAPER = "Well";
    private static final String COVER = "SOLID";
    private static final boolean WITH_HOT_NEWS = true;
    private static final String DEFAULT_NAME = "None";
    private static final String DEFAULT_AUTHOR = "None";



    public static PublicationEntity[] albumInit(PublicationEntity[] publ) {
        for (int i = 0; i < publ.length; i++) {
            publ[i] = new AlbumEntity(rnd.nextInt(RANGE_AMOUNT_OF_PAGES) + 1,
                    DEFAULT_NAME,DEFAULT_AUTHOR,DEFAULT_GENRE,
                    rnd.nextInt(DEFAULT_POPULARITY_RANGE),
                    QUALITY_OF_PAPER);
        }
        return publ;
    }

    public static PublicationEntity[] bookInit(PublicationEntity[] publ) {
        for (int i = 0; i < publ.length; i++) {
            publ[i] = new BookEntity(rnd.nextInt(RANGE_AMOUNT_OF_PAGES) + 1,
                    DEFAULT_NAME,DEFAULT_AUTHOR,DEFAULT_GENRE,
                    rnd.nextInt(DEFAULT_POPULARITY_RANGE),
                    COVER);
        }
        return publ;
    }

    public static PublicationEntity[] magazineInit(PublicationEntity[] publ) {
        for (int i = 0; i < publ.length; i++) {
            publ[i] = new MagazineEntity(rnd.nextInt(RANGE_AMOUNT_OF_PAGES) + 1,
                    DEFAULT_NAME,DEFAULT_AUTHOR,DEFAULT_GENRE,
                    rnd.nextInt(DEFAULT_POPULARITY_RANGE),
                    WITH_HOT_NEWS);
        }
        return publ;
    }
}
