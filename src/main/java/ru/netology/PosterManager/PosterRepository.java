package ru.netology.PosterManager;

public class PosterRepository {

    private Posters[] items = new Posters[0];

    public void save(Posters item) {
        Posters[] tmp = new Posters[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Posters[] findAll() {
        return items;
    }

    public Posters[] findById(int id) {

        for (Posters item : items) {
            if (item.getId() != id) {

                return null;
            }
        } return items;
    }
    public void removeById(int id) {
        Posters[] tmp = new Posters[items.length - 1];
        int copyToIndex = 0;
        for (Posters item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        Posters[] tmp = new Posters[0];
        items = tmp;
    }

}
