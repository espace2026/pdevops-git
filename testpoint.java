
import java.util.Scanner;
public class testpoint{
    public static void main(String[] args) throws Exception  {
        
    point x1 = new point(3,4);

        System.out.print("coordonne du point x avant deplacement: ");

        x1.afficher();
        System.out.println(x1);
point x2=new point();
System.out.println(x2);

x1.deplacer(2, 2);
System.out.print("coordonne de x1 apres deplacement:");
x1.afficher();

double abs,ord,a1,a2;
Scanner sc = new Scanner(System.in);
System.out.print("valeur d'abscisse:");
abs=sc.nextDouble();
System.out.print("valeur de l'ordonne:");
ord=sc.nextDouble();
point y=new point(abs,ord);
System.out.print("cordonne du point y avant deplacement:");
y.afficher();
System.out.print("valeur deplacement d'abscisse:");
a1=sc.nextDouble();
System.out.print("valeur deplacement d'ordonne:");
a2=sc.nextDouble();
y.deplacer(a1, a2);

System.out.print("cordonne du point y apres deplacement");
y.afficher();
System.out.print("distance entre x1 et y=");

System.out.format("%.2f", x1.Distance(y));
sc.close();

    }

}
    

