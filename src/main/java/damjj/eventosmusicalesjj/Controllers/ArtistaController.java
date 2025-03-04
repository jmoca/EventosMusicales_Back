package damjj.eventosmusicalesjj.Controllers;

import damjj.eventosmusicalesjj.Entities.Artista;
import damjj.eventosmusicalesjj.Services.ArtistaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping
    public List<Artista> getAllArtistas() {
        return artistaService.getAllArtistas();
    }

    @GetMapping("/{id}")
    public Optional<Artista> getArtistaById(@PathVariable String id) {
        return artistaService.getArtistaById(id);
    }

    @PostMapping
    public Artista saveArtista(@RequestBody Artista artista) {
        return artistaService.saveArtista(artista);
    }

    @DeleteMapping("/{id}")
    public void deleteArtista(@PathVariable String id) {
        artistaService.deleteArtista(id);
    }
}