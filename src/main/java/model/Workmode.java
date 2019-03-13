package model;

import java.util.ArrayList;

public class Workmode {
    private ArrayList<String> mon;
    private ArrayList<String> tue;
    private ArrayList<String> wed;
    private ArrayList<String> thu;
    private ArrayList<String> fri;
    private ArrayList<String> sat;
    private ArrayList<String> sun;
    private ArrayList<String> holyday;
    private boolean nonstop;
    private boolean closed;
    private boolean worknow;


    public ArrayList<String> getMon() {
        return mon;
    }

    public void setMon(ArrayList<String> mon) {
        this.mon = mon;
    }

    public ArrayList<String> getTue() {
        return tue;
    }

    public void setTue(ArrayList<String> tue) {
        this.tue = tue;
    }

    public ArrayList<String> getWed() {
        return wed;
    }

    public void setWed(ArrayList<String> wed) {
        this.wed = wed;
    }

    public ArrayList<String> getThu() {
        return thu;
    }

    public void setThu(ArrayList<String> thu) {
        this.thu = thu;
    }

    public ArrayList<String> getFri() {
        return fri;
    }

    public void setFri(ArrayList<String> fri) {
        this.fri = fri;
    }

    public ArrayList<String> getSat() {
        return sat;
    }

    public void setSat(ArrayList<String> sat) {
        this.sat = sat;
    }

    public ArrayList<String> getSun() {
        return sun;
    }

    public void setSun(ArrayList<String> sun) {
        this.sun = sun;
    }

    public ArrayList<String> getHolyday() {
        return holyday;
    }

    public void setHolyday(ArrayList<String> holyday) {
        this.holyday = holyday;
    }

    public boolean isNonstop() {
        return nonstop;
    }

    public void setNonstop(boolean nonstop) {
        this.nonstop = nonstop;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isWorknow() {
        return worknow;
    }

    public void setWorknow(boolean worknow) {
        this.worknow = worknow;
    }

    public Workmode(ArrayList<String> mon, ArrayList<String> tue, ArrayList<String> wed, ArrayList<String> thu, ArrayList<String> fri, ArrayList<String> sat, ArrayList<String> sun, ArrayList<String> holyday, boolean nonstop, boolean closed, boolean worknow) {
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thu = thu;
        this.fri = fri;
        this.sat = sat;
        this.sun = sun;
        this.holyday = holyday;
        this.nonstop = nonstop;
        this.closed = closed;
        this.worknow = worknow;
    }

    public Workmode() {
    }
}
