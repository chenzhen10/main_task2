package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.book.BookEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.ArrayList;
import java.util.Arrays;

public class BookLogic extends PublicationLogic {

    @Override
    public PublicationEntity[] sortByPages(PublicationEntity[] publ) {
        Arrays.sort(publ);
        return publ;
    }

    @Override
    public PublicationEntity[] sortByPopularity(PublicationEntity[] publ) {
//        Arrays.sort((BookEntity[]) publ, new BookEntity());
        return publ;
    }

    @Override
    public PublicationEntity[] findByParameters(PublicationEntity[] publ, Object cover) {
        ArrayList<BookEntity> list = new ArrayList<>();
        for (PublicationEntity ae : publ) {
            if (((BookEntity) ae).getCover().equals(cover.toString())) {
                list.add((BookEntity) ae);
            }
        }
        return list.toArray(new BookEntity[0]);
    }


    @Override
    public BookEntity findByMinPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        BookEntity ae = (BookEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp > publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (BookEntity) publ[i];
            }
        }
        return ae;
    }

    @Override
    public BookEntity findByMaxPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        BookEntity ae = (BookEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (BookEntity) publ[i];
            }
        }
        return ae;
    }

    @Override
    public BookEntity getTheMostPopularPublication(PublicationEntity[] publ) {
        int temp = publ[0].getPopularity();
        BookEntity ae = (BookEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getPopularity()) {
                temp = publ[i].getPopularity();
                ae = (BookEntity) publ[i];
            }
        }
        return ae;
    }
}
