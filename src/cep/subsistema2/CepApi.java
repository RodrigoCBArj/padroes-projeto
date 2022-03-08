package cep.subsistema2;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cidade X";
    }

    public String recuperarEstado(String cep) {
        return "Estado X";
    }
}
