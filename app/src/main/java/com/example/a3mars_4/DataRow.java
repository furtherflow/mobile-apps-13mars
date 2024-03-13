package com.example.a3mars_4;
public class DataRow {
    private final String title;
    private final String description;
    public DataRow(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
