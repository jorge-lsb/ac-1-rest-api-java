package br.com.bandtec.apirestspotify.model;

public class Music extends Streaming {

    public Music(String name, double playingTime, double streamingValue, int amountOfStreaming) {
        super(name, playingTime, streamingValue, amountOfStreaming);
    }

    @Override
    public double calculateRevenue() {
        return (getStreamingValue() * getAmountOfStreaming()) + ((getStreamingValue() * getAmountOfStreaming()) * 0.15);
    }
}
