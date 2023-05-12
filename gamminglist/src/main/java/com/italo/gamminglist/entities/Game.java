package com.italo.gamminglist.entities;

public class Game {
    private Long id;
    private String title;
    private Integer year;
    private String gender;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String title, Integer year, String gender, String platform,
                String imgUrl, String shortDescription, String longDescription) {
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.gender = gender;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
