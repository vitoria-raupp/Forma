public class Quadrado extends Forma {
    private double lado;
    
    Quadrado(double lad){
        setLado(lad);
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calculaArea(){
        return this.lado *this.lado;
    }
    @Override
    public double calculaPerimetro(){
        return this.lado * 4;
    }
    
    @Override
    public String toString(){
        return "Quadrado: \n Raio: " +this.lado + "\n Area: " + this.calculaArea() + "\n Perimetro: " + this.calculaPerimetro() ;
    }
}