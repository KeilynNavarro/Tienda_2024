
package com.tienda.tienda.dao;

import com.tienda.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    List<Categoria> findByDescripcion(String descripcion);
}
