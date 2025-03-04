package damjj.eventosmusicalesjj.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "eventos")
public class Evento {
    @Id
    private String id;
    private String nombre;
    private Date fecha;
    private String lugar;
    private List<String> artistas;
    private double precio;
}
