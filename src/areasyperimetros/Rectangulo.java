package areasyperimetros;
public class Rectangulo{
   private int base;
   private int altura;
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
        this.resu = (2*this.base)+(2*this.altura);
    }
}