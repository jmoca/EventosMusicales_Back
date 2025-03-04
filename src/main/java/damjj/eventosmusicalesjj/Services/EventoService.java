package damjj.eventosmusicalesjj.Services;

import damjj.eventosmusicalesjj.Entities.Evento;
import damjj.eventosmusicalesjj.Repositories.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> getEventoById(String id) {
        return eventoRepository.findById(id);
    }

    public Evento saveEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public void deleteEvento(String id) {
        eventoRepository.deleteById(id);
    }
}
