package com.example.crudprueba.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI <T, ID extends Serializable> {
 
	T save(T entity);
	
	void delete(ID id_usuario);
	
	T get(ID id_usuario);
	
	List<T> getAll();
	
}
