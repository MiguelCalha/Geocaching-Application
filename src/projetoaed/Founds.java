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
public class Founds {
    
    private CacheList list;
    

    public Founds() {
        list = new CacheList();
    }
    // Complexidade O^n(linear)
    //Percorre a lista e ve os elementos encontrados
    public void encontrados(){
        
        int found=0;
        int notFound=0;
        
        for(int i=0; i<list.size(); i++){
            
            Cache cache = (Cache) list.getElementAtRank(i);
            found += cache.getEncontrado();
            notFound += cache.getNaoEncontrado();  
        }
        System.out.println("Encontrados:" + notFound);
        System.out.println("Não Encontrados" + found);
    }
}
