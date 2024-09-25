package br.edu.unisep.despesas.model;

public class Empresa {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String Cnpj;
    // construtor vazio
    // construtor comm todos os atributos
    // getter e setter


    public Empresa() {
    }

    public Empresa(int id, String nome, String endereco, String telefone, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        Cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;

    }

    @Override
    public String toString() {
        return "Empresa\n" +
                "ID:" + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Endereço: " + this.endereco + "\n" +
                "telefone: " + this.telefone + "\n" +
                "Cnpj: " + this.Cnpj + "\n";

    }
}
