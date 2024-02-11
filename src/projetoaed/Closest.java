/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

import java.util.Scanner;

/**
 *
 * @author dcalha
 */
public class Closest {
    
    //Método que pede ao utilizado que insira um número everifica qual é a cache com a altitude mais próxima que ele inseriu
    // Complexidade O^n(linear)
    private Scanner scanner;
    public void closest(CacheList<Cache> list){   
            int i=0;
            System.out.println("Indique a altitude :");
            Scanner in = new Scanner(System.in);
            int altitutePedida= in.nextInt();//Pedir ao utilizador
            Cache cacheMaisProxima=list.get(0);
            int dist=Math.abs(list.get(0).getAltitude()-altitutePedida);
            while(i<list.size()){
                if(Math.abs(list.get(i).getAltitude()-altitutePedida)<dist){
                    dist=Math.abs(list.get(i).getAltitude()-altitutePedida);
                    cacheMaisProxima=list.get(i);
                }
                i++;
            }
            System.out.println("Cache mais proxima:"+cacheMaisProxima.toString());
                
        }

}
