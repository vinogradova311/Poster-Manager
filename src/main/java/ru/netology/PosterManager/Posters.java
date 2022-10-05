package ru.netology.PosterManager;

public class Posters {
    private int id;
    private int name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Posters(int name) {
        this.name = name;
    }
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

}
