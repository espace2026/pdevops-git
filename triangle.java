public class triangle {
    private point s1, s2, s3 ;

    public triangle() {
        s1=new point();
        s2=new point();
        s3=new point();

    }
    public triangle(double a1, double a2, double a3, double a4, double a5, double a6){
        s1=new point(a1,a2);
        s2=new point(a3,a4);
        s3=new point(a5,a6);

    }
    public void  afficher(){
        s1.afficher();
        s2.afficher();
        s3.afficher();
        
    }
    public void deplacer(double x,double y){
        s1.deplacer(x, y);
        s2.deplacer(x, y);
        s3.deplacer(x, y);
    }
public void Echelle(double ve){
    s1.Echelle(ve);
    s2.Echelle(ve);
    s3.Echelle(ve);
}
public double cote1(){
    return (s1.Distance(s2));
}
public double cote2(){
    return (s1.Distance(s3));
}
public double cote3(){
    return(s3.Distance(s2));
}
public boolean Isocele(){
    return (cote1()==cote2()||cote1()==cote3()||cote2()==cote3());

}
public boolean Equilateral(){
    return (cote1()==cote2() && cote3()==cote2());

}
public double perimetre(){
    return (cote1()+cote2()+cote3());
}

}

