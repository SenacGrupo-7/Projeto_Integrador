package com.example;

public class Fornecedor extends PessoaJuridica {

    public Fornecedor(String nome, String endereco, String telefone, String cnpj1, String razaoSocial1) {
        super(nome, endereco, telefone, cnpj1, razaoSocial1);
    }


        @Override
    public char getRazaoSocial() {
        return razaoSocial;
    }

        @Override
    public void setRazaoSocial(char razaoSocial) {
        this.razaoSocial = razaoSocial;
    }}
