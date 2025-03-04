package damjj.eventosmusicalesjj.Controllers;

import damjj.eventosmusicalesjj.Entities.Evento;
import damjj.eventosmusicalesjj.Services.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoService.getAllEventos();
    }

    @GetMapping("/{id}")
    public Optional<Evento> getEventoById(@PathVariable String id) {
        return eventoService.getEventoById(id);
    }

    @PostMapping
    public Evento saveEvento(@RequestBody Evento evento) {
        return eventoService.saveEvento(evento);
    }

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable String id) {
        eventoService.deleteEvento(id);
    }
}
