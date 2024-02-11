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
public class Search {
    private Scanner scanner;
    
    public Search() {
        
        this.scanner = new Scanner(System.in);
    }
    // Complexidade O^n(linear)
    public void Search(CacheList<Cache> list){
        System.out.println("Insira o código da cache->");
        String codigo = readCommand();
        
        if(codigo == null){
            
            System.out.println("O Código Inserido não é válido");
        }else{
            boolean flag=false;
            int i=0;

            while(i<list.size()&&!flag){
                System.out.println(list.get(i).getCode());
                if(list.get(i).getCode().equals(codigo)){
                   System.out.println(list.get(i).toString());  
                   
                   flag=true;
                }
                i++;
            }
           if(!flag){
               System.out.println("Não encontrou");
           }
            
               
        }
       
        
        
    }
    
    public String readCommand() {
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            if (s1 != "") {
                return s1;
            }
            System.out.println("Input inválido");
        }
        return null;
    }
    
}
