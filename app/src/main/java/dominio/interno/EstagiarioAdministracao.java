package dominio.interno;

public class EstagiarioAdministracao extends Estagiario{

    private String setor;
    private String descricaoTarefa;

    public EstagiarioAdministracao(String nome, String cpf, String sobreNome, double sal, 
                      int hora, String instituicao, boolean obrigatorio, 
                      String setor, String tarefa, String... emails){

        super(nome, cpf, sobreNome, sal, hora, instituicao, obrigatorio, emails);
        this.setor = setor;
        this.descricaoTarefa = tarefa;

    }

    @Override //Vs code sugeriu
    public void setOrientador(CLT orientador){

        super.setOrientador(orientador);

    }

}