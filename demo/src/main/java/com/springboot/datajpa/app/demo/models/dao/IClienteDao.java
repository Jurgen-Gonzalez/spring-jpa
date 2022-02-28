package com.springboot.datajpa.app.demo.models.dao;

import com.springboot.datajpa.app.demo.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {


}
