package com.springboot.datajpa.app.demo.controllers;

import java.util.Map;

import javax.validation.Valid;

import com.springboot.datajpa.app.demo.models.dao.IClienteDao;
import com.springboot.datajpa.app.demo.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClienteController {

    @Autowired
    @Qualifier("clienteDao")
    private IClienteDao clienteDao;

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteDao.findAll());
        return "listar";
    }
    
    @RequestMapping(value="/form")
    public String crear(Map<String, Object> model){ //Map y Model es lo mismo
        Cliente cliente = new Cliente();
        model.put("cliente", cliente);
        model.put("titulo", "Formulario de clientes");
        return "form";
    }

    @PostMapping(value="/form")
    public String guardar(@Valid Cliente cliente, BindingResult result, Model model) {

        if(result.hasErrors()){
            model.addAttribute("titulo", "Formulario de cliente");
            return "form";
        }


        clienteDao.save(cliente);
        
        return "redirect:listar";
    }

    @RequestMapping(value="/form/{id}")
    public String editar(@PathVariable(value="id") Long id, Map<String, Object> model){ //Map y Model es lo mismo

        Cliente cliente = null;

        if(id>0){
            cliente = clienteDao.findOne(id);
        } else {
            return "redirect:/listar";
        }

        model.put("cliente", cliente);
        model.put("titulo", "Editar cliente");
        return "form";
    }

    @RequestMapping(value="/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") Long id){
        if(id>0){
            clienteDao.delete(id);
        }
        
        return "redirect:/listar";
    }
    
}