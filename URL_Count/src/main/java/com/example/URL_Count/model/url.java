package com.example.URL_Count.model;

public class url {
    private int count;
    private String name;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "url{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }

    public url( String name,int count) {
        this.count = count;
        this.name = name;
    }
}
