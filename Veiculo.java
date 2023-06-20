package questao2;


public class Veiculo {
    private String modelo;
    private double preco;
    
    public Veiculo( String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }

    
    public String getInfo(){
        return "Modelo:" +getModelo() + ", Preco: R$" + getPreco();
    }
    
    
    public void printDados() {
        System.out.println( getInfo());
    }
    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
