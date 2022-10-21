package com.example.crudprueba.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.crudprueba.model.Usuarios;

public interface UsuariosDaoApi extends CrudRepository<Usuarios, Long> {

}
