package com.example.iaralopes.cadastrocliente;


/**
 * Created by Iara Lopes on 01/10/2017.
 */

public class Cliente {

    int codigo;
    String nome;
    String telefone;
    String celular;

    public Cliente () {

    }

    public Cliente (int codigo, String nome, String telefone, String celular) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
