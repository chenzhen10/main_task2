package by.epam.training.kimbar.model.entity.album;


import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.Comparator;
import java.util.Objects;

public class AlbumEntity extends PublicationEntity implements Comparable<AlbumEntity>{
    private String qualityOfPaper;

    public AlbumEntity() {

    }

    public AlbumEntity(int amountOfPages,String name,String author , String genre, int popularity, String qualityOfPaper) {
        super(amountOfPages,name,author, popularity, genre);
        this.qualityOfPaper = qualityOfPaper;
    }

    public String getQualityOfPaper() {
        return qualityOfPaper;
    }

    public void setQualityOfPaper(String qualityOfPaper) {
        this.qualityOfPaper = qualityOfPaper;
    }

    @Override
    public String toString() {
        return "AlbumEntity{" +
                "qualityOfPaper='" + qualityOfPaper + '\'' + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlbumEntity that = (AlbumEntity) o;
        return Objects.equals(qualityOfPaper, that.qualityOfPaper);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), qualityOfPaper);
    }

    @Override
    public int compareTo(AlbumEntity o) {
        return o.getAmountOfPages() - this.getAmountOfPages();
    }



}
