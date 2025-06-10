package dominio.interno;

import java.util.Set;

public class Junior extends CLT{

    // Associação com Senior e Junior
    private Pleno orientador;

    public Junior(String nome, String cpf, String sobreNome, 
               double salario, int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidades, String... emails){

        super(nome, cpf, sobreNome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);

        this.orientador = null;
    }

    public void setOrientador(Pleno orientador){

        this.orientador = orientador;

    }

}