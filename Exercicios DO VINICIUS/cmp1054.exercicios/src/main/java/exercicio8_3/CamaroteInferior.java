package exercicio8_3;

public class CamaroteInferior {
    private String localizacao;

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    private Normal normal;

    public CamaroteInferior(String localizacao, Normal normal) {
        setLocalizacao(localizacao);
        setNormal(normal);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteInferior(String localizacao) {
        this.localizacao = localizacao;
    }
}
