package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;
import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.ArrayList;
import java.util.Arrays;


public class MagazineLogic extends PublicationLogic {

    @Override
    public PublicationEntity[] sortByPages(PublicationEntity[] publ) {
        Arrays.sort(publ);
        return publ;
    }

    @Override
    public PublicationEntity[] sortByPopularity(PublicationEntity[] publ) {
//        Arrays.sort((MagazineEntity[]) publ, new MagazineEntity());
        return publ;
    }

    @Override
    public PublicationEntity[] findByParameters(PublicationEntity[] publ, Object withHotNews) {
        ArrayList<MagazineEntity> list = new ArrayList<>();
        for (PublicationEntity ae : publ) {
            if (((MagazineEntity) ae).isWithHotNews()) {
                list.add((MagazineEntity) ae);
            }
        }
        return list.toArray(new MagazineEntity[0]);
    }


    @Override
    public MagazineEntity findByMinPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        MagazineEntity ae = (MagazineEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp > publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (MagazineEntity) publ[i];
            }
        }
        return ae;
    }

    @Override
    public MagazineEntity findByMaxPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        MagazineEntity ae = (MagazineEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (MagazineEntity) publ[i];
            }
        }
        return ae;
    }

    @Override
    public MagazineEntity getTheMostPopularPublication(PublicationEntity[] publ) {
        int temp = publ[0].getPopularity();
        MagazineEntity ae = (MagazineEntity) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getPopularity()) {
                temp = publ[i].getPopularity();
                ae = (MagazineEntity) publ[i];
            }
        }
        return ae;
    }


}
