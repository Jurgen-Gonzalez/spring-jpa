package com.springboot.datajpa.app.demo.models.service;

import java.util.List;

import com.springboot.datajpa.app.demo.models.entity.Cliente;
import com.springboot.datajpa.app.demo.models.entity.Producto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

    public List<Producto> findByNombre(String term);

}
