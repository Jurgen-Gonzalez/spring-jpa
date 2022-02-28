package com.springboot.datajpa.app.demo.models.dao;

import com.springboot.datajpa.app.demo.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


}
