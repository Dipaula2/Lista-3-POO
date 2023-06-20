package questao2;


public class Carro extends Veiculo {
    private double Km;
    
    
    public Carro(String modelo, double preco,double Km) {
        super(modelo, preco);
        this.Km = Km;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }
    
     @Override
    public String getInfo() {
        return super.getInfo() + ", km Rodados: " + Km;
    }
    
    
    
    
    
}
