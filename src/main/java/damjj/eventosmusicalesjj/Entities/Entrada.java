package damjj.eventosmusicalesjj.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "entradas")
public class Entrada {
    @Id
    private String id;
    private String eventoId;
    private String comprador;
    private int cantidad;
}

