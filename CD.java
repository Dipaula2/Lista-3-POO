


public class CD extends Midia {
    private int nMusicas;

    public CD() {
        
    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public void setMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Numero de Musicas: " + nMusicas;
    }
}
