package com.springboot.datajpa.app.demo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.springboot.datajpa.app.demo.models.entity.Cliente;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("clienteDao")
public class ClienteDaoImpl implements IClienteDao {

    @PersistenceContext
    private EntityManager em ;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return this.em.createQuery("from Cliente").getResultList();
    }

    @Transactional
    @Override
    public void save(Cliente cliente) {
        if(cliente != null && cliente.getId() > 0){
            em.merge(cliente);
        } else {
            em.persist(cliente);
        }
        
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Cliente cliente = findOne(id);
        em.remove(cliente);
        
    }

}