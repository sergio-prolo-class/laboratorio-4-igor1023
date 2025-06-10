package dominio.interno;

public class Estagiario extends Funcionario{

    // associacao com CLT
    private CLT orientador; 

    private double salario;
    private int cargaHorariaSemanal;
    private String nomeInstituicao;
    private boolean estagioObrigatorio;

    public Estagiario(String nome, String cpf, String sobreNome, double sal, 
                      int hora, String instituicao, boolean obrigatorio, String... emails){

        super(nome, cpf, sobreNome, emails);

        this.salario = sal;
        this.cargaHorariaSemanal = hora;
        this.nomeInstituicao = instituicao;
        this.estagioObrigatorio = obrigatorio;

    }

    public void setOrientador(CLT orientador){

        this.orientador = orientador;

    }

}