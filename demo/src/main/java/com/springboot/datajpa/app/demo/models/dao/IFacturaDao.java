package com.springboot.datajpa.app.demo.models.dao;

import com.springboot.datajpa.app.demo.models.entity.Factura;

import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao  extends CrudRepository<Factura, Long>{
    
}
