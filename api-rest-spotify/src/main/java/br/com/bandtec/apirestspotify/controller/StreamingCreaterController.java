package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.Publisher;
import br.com.bandtec.apirestspotify.model.Spotify;
import br.com.bandtec.apirestspotify.model.Streaming;
import org.springframework.web.bind.annotation.*;

import static br.com.bandtec.apirestspotify.IoC.SpotifyIoC.getSpotify;

@RestController
@RequestMapping("/streaming")
public class StreamingCreaterController {

    Spotify spotify = getSpotify();

    @GetMapping("listar/{index}")
    public Publisher get(@PathVariable int index) {
        return (Publisher) spotify.getPublisher(index).getListStreaming();
    }

    @PostMapping("/criar/{index}")
    public void create(@PathVariable int index, @PathVariable Streaming streaming) {
        spotify.getListPublisher().get(index).add(streaming);
    }

    @PutMapping("/atualizar/{indexPublisher}/{indexStreaming}")
    public void update(@PathVariable int indexPublisher,
                       @PathVariable int indexStreaming,
                       @RequestBody Streaming streaming) {
        spotify.getPublisher(indexPublisher).update(indexStreaming, streaming);
    }

    @GetMapping("/remover/{indexPublisher}/{indexStreaming}")
    public void remove(@PathVariable int indexPublisher, @PathVariable int indexStreaming) {
        spotify.getPublisher(indexPublisher).delete(indexStreaming);
    }
}
