package br.prontocredi.com.dao;

import br.prontocredi.com.model.Cpf;

public class CpfDAO extends GenericDAO<Cpf>{

    @Override
    public Class<Cpf> getClassType() {
        return Cpf.class;
    }

    
}
