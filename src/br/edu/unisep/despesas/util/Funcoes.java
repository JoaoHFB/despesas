package br.edu.unisep.despesas.util;

import br.edu.unisep.despesas.model.Categoria;
import br.edu.unisep.despesas.model.Empresa;
import br.edu.unisep.despesas.model.Lancamento;
import br.edu.unisep.despesas.model.Tipo;

    import javax.swing.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Objects;
    import java.util.Scanner;

public class Funcoes {

    private List<Categoria> categorias = new ArrayList<>();
    private List<Empresa> empresas = new ArrayList<>();
    private List<Tipo> tipos = new ArrayList<>();
    private List<Lancamento> lancamentos = new ArrayList<>();
    public void novaCategoria() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da categoria"));
        String descricao = JOptionPane.showInputDialog("Digite a descricao da categoria");

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setDe scricao(descricao);
        JOptionPane.showMessageDialog(null, categoria);

        categorias.add(categoria);
        //como ler os dados pelo terminal
        /*Scanner s = new Scanner(System.in);
        System.out.println("Digite o id da categoria: ");
        id = s.nextLong();
        System.out.println("Digite o nome da categoria: ");
        s = new Scanner(System.in);
        descricao = s.nextLine();*/
    }

    public void novotipo() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da tipo"));
        String descricao = JOptionPane.showInputDialog("Digite a descricao da tipo");
//        String tipo1 = JOptionPane.showOptionDialog("");
        String[] tipos = {"Entradas", "Saidas"};
        int tipoEscolhido = JOptionPane.showOptionDialog(null,
                "Selecione o tipo",
                "Escolha o tipo do tipo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tipos,
                tipos[0]);


        Tipo tipo = new Tipo(id, descricao, tipos[tipoEscolhido]);
    }
    public void novaempresa(){
        Empresa empresa = new Empresa();
        empresa.setId(Integer.parseInt(JOptionPane.showInputDialog("Dogite o id da empresa")));
        empresa.setNome(JOptionPane.showInputDialog("Digite o nome"));
        empresa.setEndereco(JOptionPane.showInputDialog("Digite o endereco"));
        empresa.setTelefone(JOptionPane.showInputDialog("Digite o telefone"));
        empresa.setCnpj(JOptionPane.showInputDialog("Digite o cnpj"));
        JOptionPane.showMessageDialog(null, empresa);

    }
    public void listarcategoria(){
        String texto = "Categoria\n";
        for(Categoria categoria : categorias){
            texto += categoria + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    public void novolancamento(){

    }

    public boolean escolheropcao() {
        String[] opcoes = {
                "Cadastrar Categoria",
                "Cadastrar Empresa",
                "Cadastrar Tipo",
                "Cadastrar Lançamento",
                "Listar Categoria",
                "Listar Empresa",
                "Listar Tipo",
                "Listar Lançamento",
                "Excluir Categoria",
                "Excluir Empresa",
                "Excluir Tipo",
        };

        int opcaoEscolhida = JOptionPane.showOptionDialog(null,
                "Selecione a opção",
                "Menu principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        switch (opcaoEscolhida) {
            case 0:
                novaCategoria();
                break;
            case 1:
                novaempresa();
                break;
            case 2:
                novotipo();
                break;
            case 3:
                novolancamento();
                break;
            case 4:
                listarcategoria();
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                return false;
        }
        return true;
    }
}