package by.epam.training.kimbar.model.entity.publication;


import by.epam.training.kimbar.model.exception.logic.IllegalPopularityException;
import by.epam.training.kimbar.model.exception.logic.IllgealAmountOfPagesException;

import java.lang.Override;

public class PublicationEntity {
    private int amountOfPages;
    private String genre;
    private int popularity;
    private String name;
    private String author;

    public PublicationEntity() {

    }

    public PublicationEntity(int amountOfPages, String author, String name, int popularity, String genre) {
        this.amountOfPages = amountOfPages;
        this.author = author;
        this.name = name;
        this.popularity = popularity;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) throws IllgealAmountOfPagesException {
        if (amountOfPages <= 0) {
            throw new IllgealAmountOfPagesException();
        }
        this.amountOfPages = amountOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) throws IllegalPopularityException {
        if (popularity <= 0){
            throw  new IllegalPopularityException();
        }
        this.popularity = popularity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicationEntity that = (PublicationEntity) o;

        if (amountOfPages != that.amountOfPages) return false;
        if (popularity != that.popularity) return false;
        if (!genre.equals(that.genre)) return false;
        if (!name.equals(that.name)) return false;
        if (!author.equals(that.author)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amountOfPages;
        result = 31 * result + genre.hashCode();
        result = 31 * result + popularity;
        result = 31 * result + name.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "amountOfPages=" + amountOfPages +
                ", genre='" + genre + '\'' +
                ", popularity=" + popularity +
                '}';
    }


}
