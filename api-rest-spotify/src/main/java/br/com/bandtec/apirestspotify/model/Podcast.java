package br.com.bandtec.apirestspotify.model;

public class Podcast extends Streaming {

    public Podcast(double streamingValue, int amountOfStreaming) {
        super(streamingValue, amountOfStreaming);
    }

    @Override
    public double calculateRevenue() {
        return (getStreamingValue() * getAmountOfStreaming()) + ((getStreamingValue() * getAmountOfStreaming()) * 0.20);
    }


}
