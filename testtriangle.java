
import java.util.Scanner;

public class testtriangle {
    public static void main(String[] args) {
        double x1,x2,x3,x4,x5,x6;
        Scanner sc=new Scanner(System.in);
System.out.println("coordone de sommet1:");
System.out.print("abscsisse ");
x1=sc.nextDouble();
System.out.print("ordonne");
x2=sc.nextDouble();
System.out.println("coordonne sommet 2");
System.out.print("abscisse");
x3=sc.nextDouble();
System.out.print("ordonne");
x4=sc.nextDouble();
System.out.println("coordonne sommet3");
System.out.print("abscisse");
x5=sc.nextDouble();
System.out.print("ordonne");
x6=sc.nextDouble();
triangle t=new triangle(x1,x2,x3,x4,x5,x6);
t.afficher();
t.deplacer(1, 1);
t.Echelle(2);
t.afficher();
System.out.println("le triangle est isocele :"+t.Isocele());
System.out.println("le triangle est equilateral:"+t.Equilateral());
System.out.println("le perimetre est : "+t.perimetre());
sc.close();
    
    }
}
