package damjj.eventosmusicalesjj.Controllers;

import damjj.eventosmusicalesjj.Entities.Entrada;
import damjj.eventosmusicalesjj.Services.EntradaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entradas")
public class EntradaController {
    private final EntradaService entradaService;

    public EntradaController(EntradaService entradaService) {
        this.entradaService = entradaService;
    }

    @GetMapping
    public List<Entrada> getAllEntradas() {
        return entradaService.getAllEntradas();
    }

    @GetMapping("/{id}")
    public Optional<Entrada> getEntradaById(@PathVariable String id) {
        return entradaService.getEntradaById(id);
    }

    @PostMapping
    public Entrada saveEntrada(@RequestBody Entrada entrada) {
        return entradaService.saveEntrada(entrada);
    }

    @DeleteMapping("/{id}")
    public void deleteEntrada(@PathVariable String id) {
        entradaService.deleteEntrada(id);
    }
}
