package dan.ms.tp.msproductos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dan.ms.tp.msproductos.modelo.Categoria;

@Repository
public interface CategoriaJpaRepo extends JpaRepository<Categoria,Integer> {
    
}
