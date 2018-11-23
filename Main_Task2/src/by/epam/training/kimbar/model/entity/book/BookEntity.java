package by.epam.training.kimbar.model.entity.book;

import by.epam.training.kimbar.model.entity.publication.PublicationEntity;


import java.lang.Override;
import java.util.Comparator;


public class BookEntity extends PublicationEntity implements Comparable<BookEntity> {
    private String cover;

    public BookEntity() {

    }

    public BookEntity(int amountOfPages,String name,String author , String genre, int popularity, String cover) {
        super(amountOfPages,name,author, popularity, genre);
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "cover='" + cover + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (cover != null ? !cover.equals(that.cover) : that.cover != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cover != null ? cover.hashCode() : 0;
    }

    @Override
    public int compareTo(BookEntity o) {
        return o.getAmountOfPages() - this.getAmountOfPages();
    }


}
