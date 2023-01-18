package harjoitus.linkkilista;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@NoArgsConstructor @Data @AllArgsConstructor
public class Linkki extends AbstractPersistable<Long> {
    private String osoite;
    private String kuvaus;
    private String hakusana;
    private String tyyppi;
}