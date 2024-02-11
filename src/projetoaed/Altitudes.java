/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

/**
 *
 * @author dcalha
 */
public class Altitudes {
    
    // Percorre a lista e verfica qual é o com maior alttude e meno guardando em variaveis locais
    // Complexidade O^n(linear)
     public void altitudes(CacheList<Cache> list){   
            int i=0;
            Cache maiorAltitude = list.get(0);
            Cache menorAltitude = list.get(0);
            
            while(i<list.size()){
                Cache cache = (Cache) list.getElementAtRank(i);
                if(cache.getAltitude() > maiorAltitude.getAltitude()){
                    
                    maiorAltitude = cache;
                }
                else if(cache.getAltitude() == maiorAltitude.getAltitude()){
                  int comparar = cache.getName().compareTo(maiorAltitude.getName());
                        if (comparar < 0) {
                            maiorAltitude = cache;
                        }  
                }
                i++;
            }
            System.out.println("Maior Altitude: " + maiorAltitude + "Menor Altitude: " + menorAltitude);
                
        }
}
