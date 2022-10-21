package com.example.crudprueba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.crudprueba.commons.GenericServiceImpl;
import com.example.crudprueba.dao.api.UsuariosDaoApi;
import com.example.crudprueba.model.Usuarios;
import com.example.crudprueba.service.api.UsuariosServiceApi;

@Service
public class UsuariosServiceImpl extends GenericServiceImpl<Usuarios, Long> implements UsuariosServiceApi{
    
	@Autowired
	private UsuariosDaoApi usuariosDaoApi;
	
	
	@Override
	public CrudRepository<Usuarios, Long> getDao() {
		// TODO Auto-generated method stub
		return usuariosDaoApi;
	}

}
