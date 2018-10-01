


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class main {
    public static void main(String[] args) {
        //ELSŐ FELADAT
        System.out.println("ELSŐ FELADAT:\n");
        Pont p1= new Pont(3,6);
        Pont p2= new Pont(9,5);
        Pont p3= new Pont(2,4);
        Pont p4= new Pont(7,2);
        System.out.println("1. pont koordinátái: ("+ p1.getX()+";"+p1.getY()+")");
        System.out.println("2. pont koordinátái: ("+ p2.getX()+";"+p2.getY()+")");
        System.out.println("3. pont koordinátái: ("+ p3.getX()+";"+p3.getY()+")");
        System.out.println("4. pont koordinátái: ("+ p4.getX()+";"+p4.getY()+")");
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        System.out.println("1. pont új koordinátái: ("+ p1.getX()+";"+p1.getY()+")");
        System.out.println("2. pont új koordinátái: ("+ p2.getX()+";"+p2.getY()+")");
        System.out.println("3. pont új koordinátái: ("+ p3.getX()+";"+p3.getY()+")");
        System.out.println("4. pont új koordinátái: ("+ p4.getX()+";"+p4.getY()+")");
        //MÁSODIK FELADAT
        System.out.println("\nMÁSODIK FELADAT:\n");
        RegularPolygon s1= new RegularPolygon();
        RegularPolygon s2= new RegularPolygon(6, 4);
        RegularPolygon s3= new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("az első sokszög:\n"+ s1);
        System.out.println("kerülete: "+s1.getPerimeter());
        System.out.println("területe: "+s1.getArea());
        System.out.println("a második sokszög:\n"+ s2);
        System.out.println("kerülete: "+s2.getPerimeter());
        System.out.println("területe: "+s2.getArea());
        System.out.println("a harmadik sokszög:\n"+ s3);
        System.out.println("kerülete: "+s3.getPerimeter());
        System.out.println("területe: "+s3.getArea());
        //HARMADIK FELADAT
        System.out.println("\nHARMADIK FELADAT:\n");
        Rectangle t1= new Rectangle(4, 40);
        Rectangle t2= new Rectangle(3.5, 35.9);
        System.out.println("az első téglalap:\n"+ t1);
        System.out.println("területe: "+t1.getArea());
        System.out.println("kerülete: "+t1.getPerimeter());
        System.out.println("a második téglalap:\n"+ t2);
        System.out.println("területe: "+t2.getArea());
        System.out.println("kerülete: "+t2.getPerimeter());    
        //ÖTÖDIK FELADAT
        System.out.println("\nÖTÖDIK FELADAT:\n");
        QuadraticEquation m1= new QuadraticEquation(-3, 4, -2);
        QuadraticEquation m2= new QuadraticEquation(2, -5, 3);
        QuadraticEquation m3= new QuadraticEquation(1, -4, 4);
        System.out.println("m1:\n" + m1);
        if(m1.getDiscriminant()>0)
        {
            System.out.println("x1=" + m1.getRoot1()+" x2=" + m1.getRoot2());
        }
        if(m1.getDiscriminant()==0)
        {
            System.out.println("x=" + m1.getRoot1());
        }
        if(m1.getDiscriminant()<0)
        {
            System.out.println("The equation has no roots.");
        }        
        System.out.println("m2:\n" + m2);
        if(m2.getDiscriminant()>0)
        {
            System.out.println("x1=" + m2.getRoot1()+" x2=" + m2.getRoot2());
        }
        if(m2.getDiscriminant()==0)
        {
            System.out.println("x=" + m2.getRoot1());
        }
        if(m2.getDiscriminant()<0)
        {
            System.out.println("The equation has no roots.");
        }        
        System.out.println("m3:\n" + m3);
        if(m3.getDiscriminant()>0)
        {
            System.out.println("x1=" + m3.getRoot1() +" x2=" + m3.getRoot2());
        }
        if(m3.getDiscriminant()==0)
        {
            System.out.println("x=" + m3.getRoot1());
        }
        if(m3.getDiscriminant()<0)
        {
            System.out.println("The equation has no roots.");
        }
        //HATODIK FELADAT
        System.out.println("\nHATODIK FELADAT:\n");
        LinearEquation e1= new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation e2= new LinearEquation(6, 5, 4, 9, 8, 7);
        LinearEquation e3= new LinearEquation(3, 8, 4, 6, 2, 5);
        if(e1.isSolvable())
        {
            System.out.println("első egyenletrendszer megoldása:\nx="+e1.getX()+" y="+e1.getY());
        }
        else
        {
            System.out.println("The equation has no solution.");
        }
         if(e2.isSolvable())
        {
            System.out.println("második egyenletrendszer megoldása:\nx="+e2.getX()+" y="+e2.getY());
        }
        else
        {
            System.out.println("The equation has no solution.");
        }
          if(e3.isSolvable())
        {
            System.out.println("harmadik egyenletrendszer megoldása:\nx="+e3.getX()+" y="+e3.getY());
        }
        else
        {
            System.out.println("The equation has no solution.");
        }
        System.out.println("\nMÁDOSIK RÉSZ:\n");
         System.out.println("ELSŐ FELADAT:\n");
         System.out.println(java.util.Arrays.toString(Metódusok.Elso(8, 2, 5)));
         System.out.println("\nMÁSODIK FELADAT:\n");
         System.out.println(java.util.Arrays.toString(Metódusok.Masodik(9, -5, 4)));
         System.out.println("\nHARMADIK FELADAT:\n");
         Metódusok.Harmadik(4, 5, 6, -1);
         System.out.println("\nNEGYEDIK FELADAT:\n");
         System.out.println(Metódusok.Negyedik(5, 8, 2));
         System.out.println("\nÖTÖDIK FELADAT:\n");
         System.out.println(Metódusok.Ötödik(2000, 2018)+" db szökőév van/volt a két év között");
         System.out.println("\nHATODIK FELADAT:\n");
         System.out.println(Metódusok.Hatodik(4));
         System.out.println("\nHETEDIK FELADAT:\n");
         System.out.println(Metódusok.Hetedik(12, 5));
         System.out.println("\nNYOLCADIK FELADAT:\n");
         System.out.println(Metódusok.Nyolcadik(16));
         System.out.println("\nKILENCEDIK FELADAT:\n");
         Metódusok.Kilencedik(8);
         System.out.println("\nTIZEDIK FELADAT:\n");
         System.out.println(Metódusok.Tizedik(156));
         System.out.println("\nTIZENEGYEDIK FELADAT:\n");
         System.out.println(Metódusok.Tizenegyedik(5));
         System.out.println("\nTIZENKETTEDIK FELADAT:\n");
         Metódusok.Tizenkettedik(50, 10, 5);
         System.out.println("\nTIZENHARMADIK FELADAT:\n");

         System.out.println("\nTIZENNEGYEDIK FELADAT:\n");
         Metódusok.Tizennegyedik();
    } 
}
