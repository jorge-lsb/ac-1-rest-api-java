package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.bandtec.apirestspotify.IoC.SpotifyIoC.getSpotify;

@RestController
@RequestMapping("/streaming")
public class StreamingCreaterController {

    Spotify spotify = getSpotify();

    @GetMapping("/{index}")
    public List<Streaming> get(@PathVariable int index) {
        return spotify.getPublisher(index).getListStreaming();
    }

    @PostMapping("/musica/{index}")
    public void create(@PathVariable int index, @RequestBody Music streaming) {
        spotify.getListPublisher().get(index).add(streaming);
    }

    @PostMapping("/podcast/{index}")
    public void create(@PathVariable int index, @RequestBody Podcast streaming) {
        spotify.getListPublisher().get(index).add(streaming);
    }

    @PutMapping("/musica/{indexPublisher}/{indexStreaming}")
    public void update(@PathVariable int indexPublisher,
                       @PathVariable int indexStreaming,
                       @RequestBody Music streaming) {
        spotify.getPublisher(indexPublisher).update(indexStreaming, streaming);
    }

    @PutMapping("/podcast/{indexPublisher}/{indexStreaming}")
    public void update(@PathVariable int indexPublisher,
                       @PathVariable int indexStreaming,
                       @RequestBody Podcast streaming) {
        spotify.getPublisher(indexPublisher).update(indexStreaming, streaming);
    }

    @DeleteMapping("/{indexPublisher}/{indexStreaming}")
    public void remove(@PathVariable int indexPublisher, @PathVariable int indexStreaming) {
        spotify.getPublisher(indexPublisher).delete(indexStreaming);
    }
}
