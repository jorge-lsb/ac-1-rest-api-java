package br.com.bandtec.apirestspotify.model;

public abstract class Streaming {
    private double streamingValue;
    private int amountOfStreaming;

    public Streaming(double streamingValue, int amountOfStreaming) {
        this.streamingValue = streamingValue;
        this.amountOfStreaming = amountOfStreaming;
    }

    public abstract double calculateRevenue();

    public double getStreamingValue() {
        return streamingValue;
    }

    public void setStreamingValue(double streamingValue) {
        this.streamingValue = streamingValue;
    }

    public int getAmountOfStreaming() {
        return amountOfStreaming;
    }

    public void setAmountOfStreaming(int amountOfStreaming) {
        this.amountOfStreaming = amountOfStreaming;
    }
}
