package damjj.eventosmusicalesjj.Repositories;

import damjj.eventosmusicalesjj.Entities.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface EventoRepository extends MongoRepository<Evento, String> {
    List<Evento> findByNombreContainingIgnoreCase(String nombre);
    List<Evento> findByFecha(Date fecha);
    List<Evento> findByArtistasContaining(String artistaId);
}