package com.springboot.datajpa.app.demo.models.service;

import java.util.List;

import com.springboot.datajpa.app.demo.models.dao.IClienteDao;
import com.springboot.datajpa.app.demo.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return clienteDao.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public Cliente findOne(Long id) {
        // TODO Auto-generated method stub
        return clienteDao.findOne(id);
    }

    @Override
    public void delete(Long id) {
        clienteDao.delete(id);
    }
    
}
