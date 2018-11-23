package by.epam.training.kimbar.model.logic.sort;

import by.epam.training.kimbar.model.entity.book.BookEntity;

public class BookByPopularitySort extends BookEntity implements Comparable<BookEntity> {

    @Override
    public int compareTo(BookEntity o) {
        return o.getPopularity() - this.getPopularity();
    }
}
