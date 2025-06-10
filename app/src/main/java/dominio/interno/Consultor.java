package dominio.interno;

import java.time.LocalDate;

public class Consultor extends Temporario{

    //associacao com CLT pleno
    private Pleno intermediario;
    private int quantidadeRelatorios;

    public Consultor(String nome, String cpf, String sobreNome,
                    LocalDate dataTermino, double valorContrato, int qtdRelatorios, String... emails){

        super(nome, cpf, sobreNome, dataTermino, valorContrato, emails);
        this.quantidadeRelatorios = qtdRelatorios;

    }

    public void setIntermediario(Pleno intermediario){

        this.intermediario = intermediario;

    }
}