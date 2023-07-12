package com.company;

public class Song {
   private String typeList;
   private String name;
   private String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    @Override
    public String toString() {
        return String.format("%s",this.name);
    }
}
