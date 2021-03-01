package br.com.bandtec.apirestspotify.model;

import br.com.bandtec.apirestspotify.services.BaseServices;

import java.util.ArrayList;
import java.util.List;

public class Spotify implements BaseServices {

    private List<Publisher> listPublisher;

    public Spotify() {
        this.listPublisher = new ArrayList<Publisher>();
    }

    @Override
    public void add(Object generic) {
        listPublisher.add((Publisher) generic);
    }

    @Override
    public void update(int index, Object generic) {
        listPublisher.set(index, (Publisher) generic);
    }

    @Override
    public void delete(int index) {
        listPublisher.remove(index);
    }

    public Publisher getPublisher(int index) {
        if (listPublisher.size() > index)
            return listPublisher.get(index);

        return null;
    }

    public List<Publisher> getListPublisher() {
        return listPublisher;
    }

    public void setListPublisher(List<Publisher> listPublisher) {
        this.listPublisher = listPublisher;
    }
}
