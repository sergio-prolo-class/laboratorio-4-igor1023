package dominio.interno;

import java.util.Set;
import java.util.HashSet;

public class Senior extends CLT{

    private double bonificacao;
    private Set<Pleno> subordinados;

    public Senior(String nome, String cpf, String sobreNome, 
               double salario, int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidades, double bonificacao, String... emails){

        super(nome, cpf, sobreNome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        this.bonificacao = bonificacao;
        subordinados = new HashSet<>();

    }

    public double getBonificacao(){

        return this.bonificacao;

    }

    public boolean addSubordinados(Pleno subordinado){

        return subordinados.add(subordinado);

    }

}