package dominio.interno;

import java.util.Set;

public class CLT extends Funcionario{

    private double salario;
    private int cargaHoraria;
    private String carteiraTrabalho;
    private Set<String> habilidades;

    public CLT(String nome, String cpf, String sobreNome, 
               double salario, int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidades, String... emails){

        super(nome, cpf, sobreNome, emails);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.carteiraTrabalho = carteiraTrabalho;
        this.habilidades = habilidades;

    }

}