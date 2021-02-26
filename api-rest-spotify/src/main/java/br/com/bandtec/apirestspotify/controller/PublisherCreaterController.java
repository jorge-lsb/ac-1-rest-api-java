package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.Publisher;
import br.com.bandtec.apirestspotify.model.Spotify;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherCreaterController {

    Spotify spotify = new Spotify();

    @GetMapping("/publicadores")
    public Spotify get() {
        return spotify;
    }

    @PostMapping("/criar")
    public void create(@RequestBody Publisher publisher) {
        spotify.add(publisher);
    }

    @PutMapping("/atualizar/{index}")
    public void update(@PathVariable int index, @RequestBody Publisher publisher) {
        spotify.update(index, publisher);
    }

    @GetMapping("/remover/{index}")
    public void remove(@PathVariable int index) {
        spotify.delete(index);
    }
}
