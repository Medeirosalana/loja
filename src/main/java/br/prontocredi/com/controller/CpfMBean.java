package br.prontocredi.com.controller;

import br.prontocredi.com.dao.CpfDAO;

import br.prontocredi.com.model.Cpf;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CpfMBean extends AbstractController<Cpf>{
    Cpf cpf = new Cpf();

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
        
    }
    public List<Cpf> getListaCompleta() {
        CpfDAO dao = new CpfDAO();
        try {
            return dao.findAll();
        } finally {
            dao.close();
        }
    }

    public String salvar() {
        CpfDAO dao = new CpfDAO();
        try {
            if (cpf.getId()==0) {
                dao.create(cpf);
                
            } else {
                dao.update(cpf);
            }
            addInfo("Cpf salvo com sucesso!");
        } finally {
            cpf = new Cpf();
            dao.close();
        }
        return null;
    }

    public String selecionar(Cpf carro) {
        this.cpf = carro;
        return null;
    }

    public String deletar(Cpf carro) {
        CpfDAO dao = new CpfDAO();
        try {
            dao.delete(carro);
            addInfo("cpf apagado com sucesso!");
        } finally {
            dao.close();
        }
        return null;
    }
    
    
}
