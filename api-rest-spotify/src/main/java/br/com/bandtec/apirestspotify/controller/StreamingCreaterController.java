package br.com.bandtec.apirestspotify.controller;

import br.com.bandtec.apirestspotify.model.Publisher;
import br.com.bandtec.apirestspotify.model.Streaming;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/streaming")
public class StreamingCreaterController {

    @PostMapping("/criar/{index}")
    public void create(@PathVariable int index, @RequestBody Publisher publisher, @PathVariable Streaming streaming) {
        publisher.add(streaming);
    }
}
