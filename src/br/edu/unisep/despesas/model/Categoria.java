package br.edu.unisep.despesas.model;

public class Categoria {
    /*
     o encapsulamento é baseado nessas palavras
     public - visível para todos
     private - visível somente dentro da classe
     protected - visível somente dentro do pacote
     */
    private int id;
    private String descricao;

    public Categoria() {

    }

    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria\n" +
                "ID:" + this.id + "\n" +
                "Observação: " + this.descricao + "\n";

    }
}