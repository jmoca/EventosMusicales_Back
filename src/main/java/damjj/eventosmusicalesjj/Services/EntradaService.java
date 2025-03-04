package damjj.eventosmusicalesjj.Services;

import damjj.eventosmusicalesjj.Entities.Entrada;
import damjj.eventosmusicalesjj.Repositories.EntradaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntradaService {
    private final EntradaRepository entradaRepository;

    public EntradaService(EntradaRepository entradaRepository) {
        this.entradaRepository = entradaRepository;
    }

    public List<Entrada> getAllEntradas() {
        return entradaRepository.findAll();
    }

    public Optional<Entrada> getEntradaById(String id) {
        return entradaRepository.findById(id);
    }

    public Entrada saveEntrada(Entrada entrada) {
        return entradaRepository.save(entrada);
    }

    public void deleteEntrada(String id) {
        entradaRepository.deleteById(id);
    }
}
