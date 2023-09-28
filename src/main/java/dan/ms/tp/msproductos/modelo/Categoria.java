package dan.ms.tp.msproductos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PRD_CATEGORIA")
@Data
public class Categoria {
    @Id
    @Column(name = "id_categoria")
    private Integer id;
    private String nombre;
}
