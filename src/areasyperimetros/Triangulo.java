package areasyperimetros;
public class Triangulo {
    protected int base;
    protected int altura;
    private int resu;
    public void setbase(int valor){
       this.base = valor;
    }
    public void setaltura(int valor){
       this.altura = valor;
    }
    public int getresultado(){
        return this.resu;
    }
    public void Area(){
        this.resu = (this.base*this.altura)/2;
    }
    public void Perimetro(){
    }
}