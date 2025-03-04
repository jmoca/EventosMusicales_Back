package damjj.eventosmusicalesjj.Repositories;

import damjj.eventosmusicalesjj.Entities.Entrada;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EntradaRepository extends MongoRepository<Entrada, String> {
    List<Entrada> findByEventoId(String eventoId);
    List<Entrada> findByComprador(String comprador);
}
