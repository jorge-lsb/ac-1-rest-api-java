package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.Music;
import br.com.bandtec.apirestspotify.model.Podcast;
import br.com.bandtec.apirestspotify.services.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify")
public class SpotifyController {

    Publisher artist = new Publisher("Teto", true, "Musico de Trap", "musica");
    Publisher podcast = new Publisher("FlowPocast", true, "Podcast sobre assuntos variados", "podcast");

    @GetMapping("/exibir/artista")
    public Publisher getArtist() {
        return artist;
    }

    @GetMapping("/exibir/podcast")
    public Publisher getPodcast() {
        return podcast;
    }

    @GetMapping("/adiciona/{valorPorPlays}/{quantDePlays}/{type}")
    public String add(@PathVariable double valorPorPlays, @PathVariable int quantDePlays, @PathVariable String type) {
        if (type.equals("music")) {
            Music m = new Music(valorPorPlays, quantDePlays);
            artist.addStreaming(m);
            return "Musica adicionada com sucesso!";
        }

        if (type.equals("podcast")) {
            Podcast p = new Podcast(valorPorPlays, quantDePlays);
            podcast.addStreaming(p);
            return "Pocast adicionado com sucesso!";
        }
        return "Tipo ou valores incorretos";
    }


}
