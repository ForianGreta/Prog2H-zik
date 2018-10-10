/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class Test {
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher)
    {
        for(int i=0;i<teher.length-1;i++)
        {
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                Teherautó tmp= teher[i];
                teher[i]=teher[j];
                teher[j]=tmp;
            }
        }
    }
    }
    public static Autó keresMaxMotorTeljesítmény(Autó[] auto){   
        int max=Integer.MIN_VALUE;
    
        int index=0;
    
        for(int i=0;i<auto.length;i++)
        {
            if(auto[i].getMotorteljesítmény()>max)
            {
                max=auto[i].getMotorteljesítmény();
                index=i;
                
            }
        }
        return auto[index];
    }
    public static void main(String[] args) {
        Autó[] auto= new Autó[]{
        new Autó("FGH-065", 2000),
        new Autó("ZHR-222", 34000),
        new Autó("ABC-123", 4000),
        new Autó("PRO-987", 4000),
        new Autó("ZGR-555", 1500),
        new Teherautó("KHG-257", 5000, 10),
        new Teherautó("JKL-987", 4000, 100),
        new Teherautó("LGF-984", 2500, 20),
        new Teherautó("FAZ-111", 1500, 50),
        new Teherautó("MSM-323", 3000, 10)
    };
        Teherautó[] teher= new Teherautó[]{
        new Teherautó("ERT-987", 5000, 10),
        new Teherautó("ASD-545", 4000, 100),
        new Teherautó("TZU-524", 2500, 20),
        new Teherautó("FFZ-111", 1500, 50),
        new Teherautó("MEM-323", 2000, 10),
        new Teherautó("KBG-257", 5000, 10),
        new Teherautó("JML-987", 4000, 100),
        new Teherautó("LAF-984", 2500, 20),
        new Teherautó("FLZ-111", 1500, 50),
        new Teherautó("MBM-323", 5000, 10)
        };
        rendezMaxSzállíthatóTeherCsökkenőleg(teher);
        for(Teherautó t:teher){
        System.out.println(t);}
        System.out.println("legnagyobb motorteljesítmény:");
        System.out.println(keresMaxMotorTeljesítmény(auto));
        
}
}
