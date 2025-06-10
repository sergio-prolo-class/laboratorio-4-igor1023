package dominio.interno;

public class EstagiarioTi extends Estagiario{

    private String nsComputador;
    private boolean trabalhaRemoto;

    public EstagiarioTi(String nome, String cpf, String sobreNome, double sal, 
                      int hora, String instituicao, boolean obrigatorio, 
                      String ns, boolean trabalhaRemoto, String... emails){

        super(nome, cpf, sobreNome, sal, hora, instituicao, obrigatorio, emails);
        this.nsComputador = ns;
        this.trabalhaRemoto = trabalhaRemoto;

    }

    @Override //VS code sugeriu
    public void setOrientador(CLT orientador){

        super.setOrientador(orientador);

    }

}