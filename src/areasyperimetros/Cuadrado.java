package areasyperimetros;
public class Cuadrado {
    protected int lado;
    protected int resu;
    public void setlado(int valor){
        this.lado = valor;
    }
    public int getresultado(){
        return this.resu;
    }
    public void Area(){
        this.resu = (this.lado)^2;
    }
    public void Perimetro(){
        this.resu = 4*this.lado;
    }
}