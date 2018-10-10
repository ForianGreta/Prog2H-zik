
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gréta
 */
public class koPapirOllo {
    
    public static void main(String[] args) {
        int ertek = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String beker = sc.nextLine();
            Random r = new Random();
            if (r.nextInt(3) == 0) {
                System.out.println("gép:kő");
            }
            if(r.nextInt()==0 && beker.equals("kő")){
                System.out.println("döntetlen");
            }
            if(r.nextInt()==0 && beker.equals("papír")){
                System.out.println("te nyertél");
            }
            if(r.nextInt()==0 && beker.equals("olló")){
                System.out.println("gép nyert");
            }
            if (r.nextInt(3) == 1) {
                System.out.println("gép:papír");
            }
            if(r.nextInt()==1 && beker.equals("kő")){
                System.out.println("gép nyert");
            }
            if(r.nextInt()==1 && beker.equals("papír")){
                System.out.println("döntetlen");
            }
            if(r.nextInt()==1 && beker.equals("olló")){
                System.out.println("te nyertél");
            }

            
            if (r.nextInt(3) == 2) {
                System.out.println("gép:olló");
            }
            if(r.nextInt()==2 && beker.equals("kő")){
                System.out.println("te nyertél");
            }
            if(r.nextInt()==2 && beker.equals("papír")){
                System.out.println("gép nyert");
            }
            if(r.nextInt()==2 && beker.equals("olló")){
                System.out.println("döntetlen");
            }

            

            if (beker.equals("vege")) {
                break;
            }

        }
    }
}
