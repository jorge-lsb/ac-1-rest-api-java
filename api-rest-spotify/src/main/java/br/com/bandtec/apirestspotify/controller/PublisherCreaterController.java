package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.Publisher;
import br.com.bandtec.apirestspotify.model.Spotify;
import org.springframework.web.bind.annotation.*;

import static br.com.bandtec.apirestspotify.IoC.SpotifyIoC.getSpotify;

@RestController
@RequestMapping("/publisher")
public class PublisherCreaterController {

    Spotify spotify = getSpotify();

    @GetMapping
    public Spotify get() {
        return spotify;
    }

    @GetMapping("/{index}")
    public Publisher getById(@PathVariable int index) {
        return spotify.getPublisher(index);
    }

    @PostMapping
    public void create(@RequestBody Publisher publisher) {
        spotify.add(publisher);
    }

    @PutMapping("/{index}")
    public void update(@PathVariable int index, @RequestBody Publisher publisher) {
        spotify.update(index, publisher);
    }

    @DeleteMapping("/{index}")
    public void remove(@PathVariable int index) {
        spotify.delete(index);
    }
}
