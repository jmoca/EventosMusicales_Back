package damjj.eventosmusicalesjj.Controllers;

import damjj.eventosmusicalesjj.Entities.Artista;
import damjj.eventosmusicalesjj.Services.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Artista>> getAllArtistas() {
        List<Artista> artistas = artistaService.getAllArtistas();
        if (artistas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(artistas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> getArtistaById(@PathVariable String id) {
        Optional<Artista> artista = artistaService.getArtistaById(id);
        return artista.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Artista> saveArtista(@RequestBody Artista artista) {
        Artista nuevoArtista = artistaService.saveArtista(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoArtista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtista(@PathVariable String id) {
        artistaService.deleteArtista(id);
        return ResponseEntity.noContent().build();
    }
}
