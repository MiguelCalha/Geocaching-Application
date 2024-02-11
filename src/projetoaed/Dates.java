/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

import java.time.LocalDate;

/**
 *
 * @author dcalha
 */
public class Dates {
    
    
    //Método que percorre a DoblyLinkedList e verifica qual é data mais antiga e recente e guarda numa variavél, no fim imprime essa cache e a mais recente
    // Complexidade O^n(linear)
    public void datas(CacheList<Cache> list){

        Cache cacheAntiga = list.get(0);
        Cache cacheRecente = list.get(0);
        
        for(int i=0; i < list.size(); i++){            
            if(list.get(i).getHiddenDate().isAfter(cacheRecente.getHiddenDate())){
                cacheRecente = list.get(i);
            } else if(list.get(i).getHiddenDate().isBefore(cacheAntiga.getHiddenDate())) {
                
                cacheAntiga = list.get(i);
            }
            
        }
        System.out.println("Data mais antiga: " + cacheAntiga + "Data mais recente " + cacheRecente);
    }
}
