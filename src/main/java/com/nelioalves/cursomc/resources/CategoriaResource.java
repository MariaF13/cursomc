package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value= "/categorias")
public class CategoriaResource {
    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "REST está funcionando";
    }
}
