package dominio.interno;

import java.time.LocalDate;

public class Tecnico extends Temporario{

    private String turnoTrabalho;
    private boolean necessitaEPI;

    public Tecnico(String nome, String cpf, String sobreNome,
                   LocalDate dataTermino, double valorContrato,
                   String turno, boolean necessitaEPI, String... emails){

        super(nome, cpf, sobreNome, dataTermino, valorContrato, emails);
        this.turnoTrabalho = turno;
        this.necessitaEPI = necessitaEPI;
    }

}