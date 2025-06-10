package dominio;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Pessoa{

    private String nome;
    private String cpf;
    private String sobreNome;
    private Set<String> emails;

    public Pessoa(String nome, String cpf, String sobreNome, String... emails){

        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.emails = new HashSet<>(Arrays.asList(emails));

    }

    @Override
    public boolean equals(Object o){

        if(!(o instanceof Pessoa p))  
            return false;
        
        return cpf.equals(p.cpf);

    }

    @Override
    public int hashCode(){

        return cpf.hashCode();

    }
}