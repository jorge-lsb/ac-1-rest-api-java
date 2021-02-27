package br.com.bandtec.apirestspotify.model;

public class Podcast extends Streaming {

    public Podcast(String name, double playingTime, double streamingValue, int amountOfStreaming) {
        super(name, playingTime, streamingValue, amountOfStreaming);
    }

    @Override
    public double getCalculateRevenue() {
        return (getStreamingValue() * getAmountOfStreaming()) + ((getStreamingValue() * getAmountOfStreaming()) * 0.20);
    }


}
