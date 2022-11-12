package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String nazwa;
    private String wymiary;
    private boolean stempel;

    public Stamp(String nazwa,String wymiary,boolean stempel){
        this.nazwa = nazwa;
        this.wymiary = wymiary;
        this.stempel = stempel;


    }

    public String getNazwa() {
        return nazwa;
    }

    public String getWymiary() {
        return wymiary;
    }

    public boolean isStempel() {
        return stempel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stempel == stamp.stempel && Objects.equals(nazwa, stamp.nazwa) && Objects.equals(wymiary, stamp.wymiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, wymiary, stempel);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nazwa='" + nazwa + '\'' +
                ", wymiary='" + wymiary + '\'' +
                ", stempel=" + stempel +
                '}';
    }
}
