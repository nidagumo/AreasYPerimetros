package areasyperimetros;
import areasyperimetros.Circulo;
import areasyperimetros.Triangulo;
import areasyperimetros.Rectangulo;
import areasyperimetros.Cuadrado;
import java.util.Scanner;
public class AreasYPerimetros {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Triangulo t = new Triangulo();
        Rectangulo r = new Rectangulo();
        Cuadrado cu = new Cuadrado();
        System.out.println("Bienvenido a la calculadora de Areas y Perimetros");
        System.out.println("Digite 1 para Circulo");
        System.out.println("Digite 2 para Triangulo");
        System.out.println("Digite 3 para Rectangulo");
        System.out.println("Digite 4 para Cuadrado");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Digite el radio");
                c.setrad(sc.nextInt());
                c.Area();
                System.out.println("el area es : "+c.getresultado()+"π^2");
                c.Perimetro();
                System.out.println("el perimetro es : "+c.getresultado()+"π ");
                break;
            case 2:
                System.out.println("Digite la altura");
                t.setaltura(sc.nextInt());
                System.out.println("Digite la base");
                t.setbase(sc.nextInt());
                t.Area();
                System.out.println("el area es : "+t.getresultado());
                break;
            case 3:
                System.out.println("Digite la altura");
                r.setaltura(sc.nextInt());
                System.out.println("Digite la base");
                r.setbase(sc.nextInt());
                r.Area();
                System.out.println("el area es : "+r.getresultado());
                r.Perimetro();
                System.out.println("el perimetro es : "+r.getresultado());
                break;
            case 4:
                System.out.println("Digite el Lado");
                cu.setlado(sc.nextInt());
                cu.Area();
                System.out.println("el area es : "+cu.getresultado());
                cu.Perimetro();
                System.out.println("el perimetro es : "+cu.getresultado());
                break;
        }
    }
    
}