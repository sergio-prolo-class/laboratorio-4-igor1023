package dominio.interno;

import java.util.Set;
import java.util.HashSet;

public class Pleno extends CLT{

    // Associação com Senior e Junior
    private final Set<Junior> orientados;
    private Senior chefe;

    public Pleno(String nome, String cpf, String sobreNome, 
               double salario, int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidades, String... emails){

        super(nome, cpf, sobreNome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        
        orientados = new HashSet<>();
    }

    public boolean addOrientado(Junior orientado){

        return orientados.add(orientado);

    }

    public void setChefe(Senior chefe){

        this.chefe = chefe;

    }

}