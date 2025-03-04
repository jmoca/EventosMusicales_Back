package damjj.eventosmusicalesjj.Services;

import damjj.eventosmusicalesjj.Entities.Artista;
import damjj.eventosmusicalesjj.Repositories.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> getAllArtistas() {
        return artistaRepository.findAll();
    }

    public Optional<Artista> getArtistaById(String id) {
        return artistaRepository.findById(id);
    }

    public Artista saveArtista(Artista artista) {
        return artistaRepository.save(artista);
    }

    public void deleteArtista(String id) {
        artistaRepository.deleteById(id);
    }
}