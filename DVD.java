


public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Numero de Faixas: " + nFaixas;
    }
}