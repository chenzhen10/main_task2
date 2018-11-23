package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

public abstract class PublicationLogic {

    public abstract PublicationEntity[] sortByPages(PublicationEntity[] publ);

    public abstract PublicationEntity[] sortByPopularity(PublicationEntity[] publ);

    public abstract PublicationEntity[] findByParameters(PublicationEntity[] publ, Object o);

    public abstract PublicationEntity findByMinPages(PublicationEntity[] publ);

    public abstract PublicationEntity findByMaxPages(PublicationEntity[] publ);

    public abstract PublicationEntity getTheMostPopularPublication(PublicationEntity[] publ);
}
