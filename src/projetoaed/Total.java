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
public class Total {
    
    //Método que percorre a DoblyLinkedList e verifica quais dos campos estão available e guarda numa variavel
    // Complexidade O^n(linear)
    public void total(CacheList<Cache> list){   
            int i=0;
            int available=0;
            int disabled=0;
            while(i<list.size()){
                if(list.get(i).isAvailable()){
                    available++;
                }
                else{
                    disabled++;
                }
                i++;
            }
            System.out.println("Numero Total de Caches: " + list.size() + "Número de Caches Available: " + available + "Número de Caches Disabled: " + disabled);
                
        }
}
