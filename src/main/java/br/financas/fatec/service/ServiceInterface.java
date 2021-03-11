package br.financas.fatec.service;

import java.util.List;

public interface ServiceInterface<T> {
	T create(T obj);
	T findbyId(Long id);
	List<T> findAll();
	boolean update(T obj);
	boolean delete(Long id);
}
