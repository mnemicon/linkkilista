package harjoitus.linkkilista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkkiRepository extends JpaRepository<Linkki, Long> {
    
}