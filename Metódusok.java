import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Metódusok {
     public static void main(String[] args) {
         System.out.println("ELSŐ FELADAT:\n");
         System.out.println(Arrays.toString(Elso(8, 2, 5)));
         System.out.println("\nMÁSODIK FELADAT:\n");
         System.out.println(java.util.Arrays.toString(Masodik(9, -5, 4)));
         System.out.println("\nHARMADIK FELADAT:\n");
         Harmadik(4, 5, 6, -1);
         System.out.println("\nNEGYEDIK FELADAT:\n");
         System.out.println(Negyedik(5, 8, 2));
         System.out.println("\nÖTÖDIK FELADAT:\n");
         System.out.println(Ötödik(2000, 2018)+" db szökőév van/volt a két év között");
         System.out.println("\nHATODIK FELADAT:\n");
         System.out.println(Hatodik(4));
         System.out.println("\nHETEDIK FELADAT:\n");
         System.out.println(Hetedik(12, 5));
         System.out.println("\nNYOLCADIK FELADAT:\n");
         System.out.println(Nyolcadik(16));
         System.out.println("\nKILENCEDIK FELADAT:\n");
         Kilencedik(8);
         System.out.println("\nTIZEDIK FELADAT:\n");
         System.out.println(Tizedik(156));
         System.out.println("\nTIZENEGYEDIK FELADAT:\n");
         System.out.println(Tizenegyedik(5));
         System.out.println("\nTIZENKETTEDIK FELADAT:\n");
         Tizenkettedik(50, 10, 5);
         System.out.println("\nTIZENHARMADIK FELADAT:\n");

         System.out.println("\nTIZENNEGYEDIK FELADAT:\n");
         Tizennegyedik();
         
         
         
        
    }
    //ELSŐ FELADAT
    public static int[] Elso(int a, int b, int c)
    {
        int[] tomb = new int[3];
        tomb[0]=a;
        tomb[1]=b;
        tomb[2]=c;
        int i,j,tmp;
        for(i=tomb.length;i>=1;i--)
        {
            for(j=0;j<i-1;j++)
            {
                if(tomb[j]>tomb[j+1])
                {
                    tmp=tomb[j];
                    tomb[j]=tomb[j+1];
                    tomb[j+1]=tmp;
                }
            }
        }
        return tomb;
    }
    //MÁSODIK FELADAT
    public static double[] Masodik(double a, double b, double c)
    {
        double[] tomb= new double[3];
        tomb[0]=a;
        tomb[1]=b;
        tomb[2]=c;
        double min=tomb[0];
        int i;
        for(i=0 ;i<tomb.length;i++)
        {
            if(tomb[i]<min)
            {
                min=tomb[i];
            }
        }
        double[] tomb2= new double[3];
        tomb2[0]=Math.abs(a);
        tomb2[1]=Math.abs(b);
        tomb2[2]=Math.abs(c);
        double max=tomb2[0];
        for(i=0;i<tomb2.length;i++)
        {
            if(tomb[i]>max)
            {
                max=tomb[i];
            }
        }
        
        double[] tomb3= new double[2];
        tomb3[0]=min;
        tomb3[1]=max;
        return tomb3;
        
     }
    //HARMADIK FELADAT
    public static void Harmadik(double a, double b, double c, double d)
    {
        System.out.println(a+" "+b+" "+c+" "+d);
        if(d>=0)
        {
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else
        {
            System.out.println(a+" "+b+" "+d+" "+c); 
        }           
        
    }
    //NEGYEDIK FELADAT
    public static boolean Negyedik(double a, double b, double c)
    {   
        if(a<=0 || b<=0 || c<=0)
        {
            return false;
        }
        if(a+b>c && a+c>b && b+c>a)
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
    //ÖTÖDIK FELADAT
    public static int Ötödik(int a, int b)
    {
        int i;
        int db=0;
        for(i=a+1;i<b;i++)
        {
            if((i%4==0 && i%100!=0) || i%400==0)
            {
                db++;
            }
        }
        return db;
    }
    //HATODIK FELADAT
    public static String Hatodik(int a)
    {
        String jegy=null;
        switch (a)
        {
            case 1: jegy="elégtelen";
            break;
            case 2: jegy="elégséges";
            break;
            case 3: jegy="közepes";
            break;
            case 4: jegy="jó";
            break;
            case 5: jegy="kiváló";
            break;
        }
        return jegy;
    }
    //HETEDIK FELADAT
    public static int Hetedik(double a, double b)
    {
        int hányados=0;
        do{
            hányados=hányados+1;
            a=a-b;
        }
        while(a>=b);
        return hányados;
    }
    //NYOLCADIK FELADAT
    public static boolean Nyolcadik(int szam)
    {
        int i;
        for(i=2;i<=szam/2;i++)
        {
            if(szam%i==0)
            {
                return false;
            }
            
        }
        return true;
    }
    //KILENCEDIK FELADAT
    public static void Kilencedik(int n)
    {
        int a=0;
        int b=1; 
        int c;
        int k;
        if(n==1)
        {
            System.out.println(a);
        }
        else{
            if(n==2)
            {
                System.out.println(a+" "+b);
            }
            else
            {
               c=a+b;
                System.out.println(a+"\n"+b+"\n"+c);
                k=3;
                do{
                    a=b;
                    b=c;
                    c=a+b;
                    System.out.println(c+" ");
                    k=k+1;
                }
                while(k<n);
            }
        }
    }
    //TIZEDIK FELADAT
    public static int Tizedik(int n)
    {
        int újszám=0;
        do {            
            újszám=újszám*10+(n%10);
            n=n/10;
        } while (n!=0);
        return újszám;
    }
    //TIZENEGYEDIK FELADAT
    public static int Tizenegyedik(int n)
    {
        int i;
        int szorzat=1;
        for(i=n;i>0;i--)
        {
            szorzat=szorzat*i;
        }
        return szorzat;
    }
    //TIZENKETTEDIK FELADAT
    public static void Tizenkettedik(int n1, int n2, int k)
    {
        int i;
        int db=0;
        if(n1<n2)
        {
           for(i=n1;i<=n2;i++)
           {
               if(i%k==0)
               {
                   System.out.println(i);
               }
           }
        }
        else
        {
           for(i=n2;i<=n1;i++)
           {
               if(i%k==0)
               {
                   System.out.println(i);
               }
           }
 
        }       
    }
//    TIZENHARMADIK FELADAT
//    public static int Tizenharmadik(int n)
//    {
//        
//    }
    //TIZENNEGYEDIK FELADAT
    public static void Tizennegyedik()
    {
        int i;
        for(i=0;i<1000;i++)
        {
            int n=i;
            int összeg=0;
            while(n!=0)
            {
                összeg+=Math.pow(n%10, 3);
                n=n/10;
            }
            if(i==összeg)
            {
                System.out.println(i);
            }
        }
         
    }
}
    
 
