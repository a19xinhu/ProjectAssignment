package com.example.projectassignment;

import androidx.annotation.NonNull;

public class Data {
    private String name;
    private String location;
    private int size;
    private String category;
    private String auxdata;

    public Data(String name, String location, int size,String category,String auxdata) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.category = category;
        this.auxdata = auxdata;
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

    public String getAuxdata() {
        return auxdata;
    }

    public void setAuxdata(String auxdata) {
        this.auxdata = auxdata;
    }



    @NonNull
    @Override
    public String toString() {  //decide what data to show
        return name+" from "+location+" who has "+ category+" vison is "+ auxdata +".";
    }
}