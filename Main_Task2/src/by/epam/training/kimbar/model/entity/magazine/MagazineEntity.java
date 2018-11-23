package by.epam.training.kimbar.model.entity.magazine;


import by.epam.training.kimbar.model.entity.publication.PublicationEntity;


import java.lang.Override;
import java.lang.String;
import java.util.Comparator;

public class MagazineEntity extends PublicationEntity implements Comparable<MagazineEntity> {
    private boolean withHotNews;

    public MagazineEntity() {

    }

    public MagazineEntity(int amountOfPages, String name, String author, String genre, int popularity, boolean withHotNews) {
        super(amountOfPages,name,author ,popularity,genre);
        this.withHotNews = withHotNews;
    }

    public boolean isWithHotNews() {
        return withHotNews;
    }

    public void setWithHotNews(boolean withHotNews) {
        this.withHotNews = withHotNews;
    }

    @Override
    public String toString() {
        return "MagazineEntity{" +
                "withHotNews=" + withHotNews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MagazineEntity that = (MagazineEntity) o;

        if (withHotNews != that.withHotNews) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (withHotNews ? 1 : 0);
    }

    @Override
    public int compareTo(MagazineEntity o) {
        return o.getAmountOfPages() - this.getAmountOfPages();
    }


}
