package ma.fstt.besoinservice.Repositories;

import ma.fstt.besoinservice.Entities.Besoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BesoinRepo extends JpaRepository<Besoin,Long> {

    @Query("select b from Besoin b where b.user_id = ?1")

List<Besoin> findByUser_id(Long id_user);

}
