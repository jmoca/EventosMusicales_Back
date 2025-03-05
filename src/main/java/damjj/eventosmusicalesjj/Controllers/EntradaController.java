package damjj.eventosmusicalesjj.Controllers;

import damjj.eventosmusicalesjj.Entities.Entrada;
import damjj.eventosmusicalesjj.Services.EntradaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Entrada>> getAllEntradas() {
        List<Entrada> entradas = entradaService.getAllEntradas();
        if (entradas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(entradas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entrada> getEntradaById(@PathVariable String id) {
        Optional<Entrada> entrada = entradaService.getEntradaById(id);
        return entrada.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Entrada> saveEntrada(@RequestBody Entrada entrada) {
        Entrada nuevaEntrada = entradaService.saveEntrada(entrada);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEntrada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntrada(@PathVariable String id) {
        entradaService.deleteEntrada(id);
        return ResponseEntity.noContent().build();
    }
}
