package exercicio8_3;

public class CamaroteSuperior {
    private String localizacao;
    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    private Normal normal;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteSuperior(String localizacao, Normal normal) {
        setLocalizacao(localizacao);
        setNormal(normal);
    }
}
