package com.tienda.tienda.service.impl;

import com.tienda.tienda.dao.CategoriaDao;
import com.tienda.tienda.domain.Categoria;
import com.tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired

    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();

        if (activos) {
            lista.removeIf(c ->!c.isActivo());
        }
        return lista;
    }

}
