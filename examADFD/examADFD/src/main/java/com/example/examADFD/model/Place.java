package com.example.examADFD.model;

public class Place {
    private Long id;
    private String name;
    private String imageUrl;
    private String description;

    public Place(Long id, String name, String imageUrl, String description) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getImageUrl() { return imageUrl; }
    public String getDescription() { return description; }
}
