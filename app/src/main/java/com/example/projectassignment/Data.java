package com.example.projectassignment;

import androidx.annotation.NonNull;

public class Data {
    private String name;
    private String location;
    private int size;

    public Data(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
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

    @NonNull
    @Override
    public String toString() {  //decide what data to show
        return "Mountain "+name+" at "+location+" is "+size+" meters height";

    }
}