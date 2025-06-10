package dominio.externo;
import dominio.interno.Senior;

import java.time.LocalDate;

public class Premium extends Cliente{

    private double pagamentoMensal;
    private LocalDate dataInicioPremium;
    private Senior representante;

    public Premium(String nome, String cpf, String sobreNome, 
                   String endereco, String telefone, char genero,
                   double pagamentoMensal, String... emails){

        super(nome, cpf, sobreNome, endereco, telefone, genero, emails);
        this.pagamentoMensal = pagamentoMensal;
        this.dataInicioPremium = LocalDate.now();

        this.representante = null;
    }

    public void setRepresentante(Senior representante){

        this.representante = representante;

    }
}