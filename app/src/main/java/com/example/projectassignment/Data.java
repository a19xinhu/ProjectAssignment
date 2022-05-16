package com.example.projectassignment;

import androidx.annotation.NonNull;

public class Data {
    private String name;
    private String location;
    private int size;
    private String category;

    public Data(String name, String location, int size,String category) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @NonNull
    @Override
    public String toString() {  //decide what data to show
        return size+" cm "+name+" from "+location+" has "+ category+" vison.";

    }
}