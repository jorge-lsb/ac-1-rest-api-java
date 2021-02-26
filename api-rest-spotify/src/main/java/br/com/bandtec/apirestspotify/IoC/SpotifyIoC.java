package br.com.bandtec.apirestspotify.IoC;

import br.com.bandtec.apirestspotify.model.Spotify;

public class SpotifyIoC {
    private static Spotify spotify = new Spotify();

    public static Spotify getSpotify() {
        return spotify;
    }
}
