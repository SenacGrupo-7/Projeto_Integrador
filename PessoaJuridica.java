package com.example;

public class PessoaJuridica extends Pessoa {

        
    private char cnpj;

    char razaoSocial;

    private Pessoa pessoa;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj1, String razaoSocial1) {
        super(nome, endereco, telefone);
    }

    public char getCnpj() {
        return cnpj;
    }

    public void setCnpj(char cnpj) {
        this.cnpj = cnpj;
    }

    public char getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(char razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}

