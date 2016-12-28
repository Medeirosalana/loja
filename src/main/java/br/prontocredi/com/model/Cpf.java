package br.prontocredi.com.model;

import br.prontocredi.com.dao.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cpf implements PersistDB{

    @Id
    @GeneratedValue
    private int id;        
    private String cpfcnpj;
    private String nome;
    private String logradouro;
    private String numero;
    private String complemeto;
    private String cep;
    private String bairro;
    private String municipio;
    private String uf;
    private String telefone;        
    private String id_consumidor;
    private String numero_terminal;
    private String uf_habilitacao;
    private String convenio;
    private String id_enderecos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemeto() {
        return complemeto;
    }

    public void setComplemeto(String complemeto) {
        this.complemeto = complemeto;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getId_consumidor() {
        return id_consumidor;
    }

    public void setId_consumidor(String id_consumidor) {
        this.id_consumidor = id_consumidor;
    }

    public String getNumero_terminal() {
        return numero_terminal;
    }

    public void setNumero_terminal(String numero_terminal) {
        this.numero_terminal = numero_terminal;
    }

    public String getUf_habilitacao() {
        return uf_habilitacao;
    }

    public void setUf_habilitacao(String uf_habilitacao) {
        this.uf_habilitacao = uf_habilitacao;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getId_enderecos() {
        return id_enderecos;
    }

    public void setId_enderecos(String id_enderecos) {
        this.id_enderecos = id_enderecos;
    }

    @Override
    public String toString() {
        return "cpf{" + "id=" + id + ", cpfcnpj=" + cpfcnpj + ", nome=" + nome + ", logradouro=" + logradouro + ", numero=" + numero + ", complemeto=" + complemeto + ", cep=" + cep + ", bairro=" + bairro + ", municipio=" + municipio + ", uf=" + uf + ", telefone=" + telefone + ", id_consumidor=" + id_consumidor + ", numero_terminal=" + numero_terminal + ", uf_habilitacao=" + uf_habilitacao + ", convenio=" + convenio + ", id_enderecos=" + id_enderecos + '}';
    }
    
}
