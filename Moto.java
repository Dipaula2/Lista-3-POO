package questao2;


public class Moto extends Veiculo {
    
    private int ano;
    

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     @Override
    public String getInfo() {
        return super.getInfo() + ", Ano: " + ano;
    }
    

    
}
