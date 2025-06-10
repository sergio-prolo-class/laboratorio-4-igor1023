package dominio.interno;

import java.time.LocalDate;

public class Temporario extends Funcionario{

    private LocalDate dataTermino;
    private double valorContrato;

    public Temporario(String nome, String cpf, String sobreNome,
                      LocalDate dataTermino, double valorContrato, String... emails){

        super(nome, cpf, sobreNome, emails);
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

}