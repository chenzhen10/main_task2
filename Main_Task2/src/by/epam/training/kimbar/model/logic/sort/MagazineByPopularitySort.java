package by.epam.training.kimbar.model.logic.sort;

import by.epam.training.kimbar.model.entity.magazine.MagazineEntity;

public class MagazineByPopularitySort extends MagazineEntity  implements Comparable<MagazineEntity> {

    @Override
    public int compareTo(MagazineEntity o) {
        return o.getPopularity() - this.getPopularity();
    }
}
