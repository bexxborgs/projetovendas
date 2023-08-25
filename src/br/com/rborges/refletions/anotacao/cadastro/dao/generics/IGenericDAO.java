package br.com.rborges.dao.generics;


import br.com.rborges.domain.Persistente;

public interface IGenericDAO extends Persistente {

    public Boolean cadastrar (T entity) throws TipoChaveNaoEncontradaException;



}
