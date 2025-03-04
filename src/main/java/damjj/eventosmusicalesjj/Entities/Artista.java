package damjj.eventosmusicalesjj.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Date;

@Data
@Document(collection = "artistas")
public class Artista {
    @Id
    private String id;
    private String nombre;
    private String genero;
    private String biografia;
    private RedesSociales redes;

    @Data
    public static class RedesSociales {
        private String facebook;
        private String instagram;
        private String twitter;
    }
}