package by.epam.training.kimbar.controller;
import by.epam.training.kimbar.model.entity.album.AlbumEntity;

import by.epam.training.kimbar.model.logic.AlbumLogic;
import by.epam.training.kimbar.model.logic.sort.AlbumByPopularitySort;
import by.epam.training.kimbar.view.FilePrinter;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
@Author Timofei Kimbar Alexandrovich
@Version 1.0
@Description Epam second Main task  aiming at oop practise.
*/


public class Main1 {
    private static Random rnd = new Random();

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\dresko.txt");
        FilePrinter fp = new FilePrinter();
        AlbumLogic albumLogic = new AlbumLogic();
        AlbumEntity[] ae = new AlbumEntity[3];


        ae[0] = new AlbumEntity(15,
                "SpaceLearning","Fresko","Science",
                8,
                "Bad");
        ae[1] = new AlbumEntity(23,
                "Master and Margarita","Bulgakov","Novel",
                15,
                "Good");
        ae[2] = new AlbumEntity(22,
                "Mumu","Turhenev","Story",
                1,
                "Well");
        fp.print(Arrays.toString(albumLogic.sortByPages(ae)));
        fp.print(String.valueOf(albumLogic.findByMaxPages(ae)));
        fp.print(String.valueOf(albumLogic.findByMinPages(ae)));
        fp.print(String.valueOf(albumLogic.getTheMostPopularPublication(ae)));
        fp.print(Arrays.toString(albumLogic.sortByPopularity(ae)));
        fp.print(Arrays.toString(albumLogic.findByParameters(ae, "Well")));

        Arrays.sort(ae);
        System.out.println(Arrays.toString(ae));
    }
}
