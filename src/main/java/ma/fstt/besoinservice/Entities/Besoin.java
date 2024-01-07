package ma.fstt.besoinservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "besoin")
public class Besoin {
    @Id
    @GeneratedValue
    private Long besoin_id;
    private String description;
    private Integer votes;
    private Float coordoonnees_x;
    private Float coordoonnees_y;
    private String etat;
    private String username;
}
