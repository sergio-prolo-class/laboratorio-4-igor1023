package dominio.interno;

import java.util.HashSet;
import java.util.Set;

public class CLT extends Funcionario{

    private final int MAX_ESTAGIARIO = 2;

    // associacao com estagiario
    private Set<Estagiario> estagiarios;

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

        this.estagiarios = new HashSet<Estagiario>();
    }

    public boolean adicionarEstagiario(Estagiario estagiario){

        // foi assim que pensei em como controlar a quantidade de estagiarios
        if(this.estagiarios.size() < MAX_ESTAGIARIO)
            return this.estagiarios.add(estagiario);

        return false;
    }

}