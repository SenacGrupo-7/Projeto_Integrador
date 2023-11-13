package com.example;

public class Aluno extends Pessoa {

    private final String curso = null;
    private final int matricula = 0;
    private final int periodo = 0;
    private Pessoa pessoa;

    public Aluno(String nome, String endereco, String telefone, int matricula1, String curso1, int periodo1) {
        super(nome, endereco, telefone);
    }



    // Getter and setter methods for matricula, curso, and periodo

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   

}
