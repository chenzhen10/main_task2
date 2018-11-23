package by.epam.training.kimbar.model.logic.sort;


import by.epam.training.kimbar.model.entity.album.AlbumEntity;

public class AlbumByPopularitySort extends AlbumEntity implements Comparable<AlbumEntity>  {

    @Override
    public int compareTo(AlbumEntity o) {
        return o.getAmountOfPages() - this.getAmountOfPages() ;
    }
}
