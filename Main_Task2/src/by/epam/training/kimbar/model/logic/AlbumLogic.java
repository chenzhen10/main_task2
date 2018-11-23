package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Library;
import by.epam.training.kimbar.model.entity.album.AlbumEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.ArrayList;
import java.util.Arrays;

public class AlbumLogic extends PublicationLogic {
    @Override
    public AlbumEntity[] sortByPages(PublicationEntity[] publ) {
        Arrays.sort(publ);
        return (AlbumEntity[]) publ;
    }

    @Override
    public AlbumEntity[] sortByPopularity(PublicationEntity[] publ) {
        Arrays.sort((AlbumEntity[]) publ);
        return (AlbumEntity[]) publ;
    }


    @Override
    public AlbumEntity[] findByParameters(PublicationEntity[] publ, Object qualityOfPaper) {
        ArrayList<AlbumEntity> list = new ArrayList<>();
        for (PublicationEntity ae : publ) {
            if (((AlbumEntity) ae).getQualityOfPaper().equals(qualityOfPaper.toString())) {
                list.add((AlbumEntity) ae);
            }
        }
        return list.toArray(new AlbumEntity[0]);
    }

    @Override
    public AlbumEntity findByMinPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        AlbumEntity ae = (AlbumEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp > publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (AlbumEntity) publ[i];
            }
        }
        return ae;
    }


    @Override
    public AlbumEntity findByMaxPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        AlbumEntity ae = (AlbumEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (AlbumEntity) publ[i];
            }
        }
        return ae;
    }

    @Override
    public AlbumEntity getTheMostPopularPublication(PublicationEntity[] publ) {
        int temp = publ[0].getPopularity();
        AlbumEntity ae = (AlbumEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getPopularity()) {
                temp = publ[i].getPopularity();
                ae = (AlbumEntity) publ[i];
            }
        }
        return ae;
    }



}
