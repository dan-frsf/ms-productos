package dan.ms.tp.msproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dan.ms.tp.msproductos.dao.CategoriaJpaRepo;
import dan.ms.tp.msproductos.modelo.Categoria;

@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaJpaRepo jpaRepo;

    @GetMapping
    public ResponseEntity<List<Categoria>> listAll(){
        List<Categoria> categorias = jpaRepo.findAll();
        return ResponseEntity.ok().body(categorias);
    }
}
