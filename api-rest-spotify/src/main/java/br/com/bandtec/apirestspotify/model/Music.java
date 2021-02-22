package br.com.bandtec.apirestspotify.model;

public class Music extends Streaming {

    public Music(double streamingValue, int amountOfStreaming) {
        super(streamingValue, amountOfStreaming);
    }

    @Override
    public double calculateRevenue() {
        return (getStreamingValue() * getAmountOfStreaming()) + ((getStreamingValue() * getAmountOfStreaming()) * 0.15);
    }
}
