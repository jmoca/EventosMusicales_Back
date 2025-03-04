package damjj.eventosmusicalesjj.Repositories;

import damjj.eventosmusicalesjj.Entities.Artista;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArtistaRepository extends MongoRepository<Artista, String> {
    List<Artista> findByNombreContainingIgnoreCase(String nombre);
    List<Artista> findByGenero(String genero);
}
