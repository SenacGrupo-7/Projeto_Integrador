package com.example;

import java.util.Scanner;

public class App 
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro!");

        System.out.println("\nCadastro de Pessoa Física:");
        PessoaFisica pessoaFisica = cadastrarPessoaFisica(scanner);

        System.out.println("\nCadastro de Pessoa Jurídica:");
        PessoaJuridica pessoaJuridica = cadastrarPessoaJuridica(scanner);

        System.out.println("\nCadastro de Professor:");
        Professor professor = cadastrarProfessor(scanner);

        System.out.println("\nCadastro de Fornecedor:");
        Fornecedor fornecedor = cadastrarFornecedor(scanner);

        System.out.println("\nCadastro de Aluno:");
        Aluno aluno = cadastrarAluno(scanner);

        // Exibir informações cadastradas
        System.out.println("\nInformações cadastradas:");
        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
        System.out.println(professor);
        System.out.println(fornecedor);
        System.out.println(aluno);
    }

    private static PessoaFisica cadastrarPessoaFisica(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("RG: ");
        String rg = scanner.nextLine();

        return new PessoaFisica(nome, endereco, telefone, cpf, rg);
    }

    private static PessoaJuridica cadastrarPessoaJuridica(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Razão Social: ");
        String razaoSocial = scanner.nextLine();

        return new PessoaJuridica(nome, endereco, telefone, cnpj, razaoSocial);
    }

    private static Professor cadastrarProfessor(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        return new Professor(nome, endereco, telefone, disciplina, salario);
    }

    private static Fornecedor cadastrarFornecedor(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Produto: ");
        String produto = scanner.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        return new Fornecedor(nome, endereco, telefone, produto, cnpj);
    }

    private static Aluno cadastrarAluno(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Período: ");
        int periodo = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        return new Aluno(nome, endereco, telefone, matricula, curso, periodo);
    }
}

