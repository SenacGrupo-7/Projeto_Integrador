package com.example;

public class PessoaFisica extends Pessoa {
    
    	private String cpf;

	private String rg;

	private Pessoa pessoa;
             
        
    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     * @param cpf
     * @param rg
     */

    public PessoaFisica(String nome, String endereco, String telefone, String cpf1, String rg1) {
        super(nome, endereco, telefone);
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
