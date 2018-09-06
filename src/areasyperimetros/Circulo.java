package areasyperimetros;
public class Circulo {
    private int rad;
    private int resu;
    public void setrad(int valor){
        this.rad = valor;
    }
    public int getresultado(){
        return this.resu;
    }
    public void Area(){
        this.resu = this.rad*this.rad;
    }
    public void Perimetro(){
        this.resu = 2*this.rad;
    }
}