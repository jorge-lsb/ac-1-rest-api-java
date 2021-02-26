package br.com.bandtec.apirestspotify.model;

import br.com.bandtec.apirestspotify.services.BaseServices;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements BaseServices {

    private String name;
    private boolean verified;
    private String details;
    private String type;
    private List<Streaming> listStreaming;

    public Publisher(String name, boolean verified, String details, String type) {
        this.name = name;
        this.verified = verified;
        this.details = details;
        this.type = type;
        listStreaming = new ArrayList<Streaming>();
    }

    @Override
    public void add(Object generic) {
        listStreaming.add(((Streaming) generic));
    }

    @Override
    public void update(int index, Object generic) {
        listStreaming.set(index, ((Streaming) generic));
    }

    @Override
    public void delete(int index) {
        listStreaming.remove(index);
    }

    public int totalListeners() {
        int total = 0;
        for (Streaming s : listStreaming) {
            total += s.getAmountOfStreaming();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Streaming> getListStreaming() {
        return listStreaming;
    }

    public void setListStreaming(List<Streaming> listStreaming) {
        this.listStreaming = listStreaming;
    }
}
