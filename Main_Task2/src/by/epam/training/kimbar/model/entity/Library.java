package by.epam.training.kimbar.model.entity;


import by.epam.training.kimbar.model.entity.publication.PublicationEntity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<PublicationEntity> pe;


    public Library() {
        pe = new ArrayList<>();
    }

    public Library(List<PublicationEntity> pe) {
        this.pe = pe;
    }

    public List<PublicationEntity> getPe() {
        return pe;
    }

    public void setPe(ArrayList<PublicationEntity> pe) {
        this.pe = pe;
    }

    @Override
    public String toString() {
        return "Library{" +
                "pe=" + pe +
                '}';
    }
}
