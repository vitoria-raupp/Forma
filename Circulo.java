public class Circulo extends Forma {
    private double raio;
    
    Circulo(double r){
        setRaio(r);
    }
    public void setRaio(double r){
        if (r >= 0) this.raio= r;
        else this.raio = 0;
    }
    @Override
    public double calculaArea(){
        return Math.PI * this.raio * this.raio;
    }
    @Override
    public double calculaPerimetro(){
        return Math.PI * 2 * this.raio;
    }
    @Override
    public String toString(){
        return "Círculo \n Raio: "+ this.raio+ "\n Área: "+ this.calculaArea()+ "\n Perimetro: "+ this.calculaPerimetro();
    }
}
