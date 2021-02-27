package br.com.bandtec.apirestspotify.model;

public abstract class Streaming {
    private String name;
    private double playingTime;
    private double streamingValue;
    private int amountOfStreaming;

    public Streaming(String name, double playingTime, double streamingValue, int amountOfStreaming) {
        this.name = name;
        this.playingTime = playingTime;
        this.streamingValue = streamingValue;
        this.amountOfStreaming = amountOfStreaming;
    }

    public abstract double getCalculateRevenue();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

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
