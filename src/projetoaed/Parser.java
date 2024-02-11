/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

import java.io.IOException;
/**
 *
 * @author dcalha
 */import java.util.Scanner;

public class Parser {
    private Scanner scanner;
    private CacheList<Cache> list ;
    
    

    public Parser() {
        this.scanner = new Scanner(System.in);
        list = new CacheList<>();
    }
// Complexidade O^n(linear)
    public boolean parseCommand() throws IOException, ElemntInvalidException {
        String command = readCommand();
        Search search = new Search();
        Founds found = new Founds();
        Matrix matrix = new Matrix();
        Total total = new Total();
        Closest closest = new Closest();
        Altitudes altitudes = new Altitudes();
        Dates dates = new Dates();
        
        switch (command.toUpperCase()) {
            case "LOAD":
               Load load= new Load();
               System.out.println("Nome do ficheiro .csv");
               String nome= readCommand();
               load.carregarCaches(list, nome);
                //System.out.println(list.print());
                //System.out.println(list.size());
                break;
            case "FOUNDS":
                System.out.println("Encontrados...");
                found.encontrados();
                break;
            case "TOTAL":     
                total.total(list);          
                break;
            case "DATES":
                dates.datas(list);
                break;
            case "ALTITUDES":
               altitudes.altitudes(list);
                break;
            case "CLOSEST":
                closest.closest(list);
                break;
            case "CENTER":
                System.out.println("[FALTA IMPLEMENTAR] Comando CENTER");
                break;
            case "MATRIX81":
                matrix.matrix(list);
                break;
            case "SEARCH":             
                search.Search(list);            
                break;
            case "TOP10":
                System.out.println("[FALTA IMPLEMENTAR] Comando TOP10");
                break;
            case "STATES":
                System.out.println("[FALTA IMPLEMENTAR] Comando STATES");
                break; 
            case "QUIT":
                return false;

        }
        pressAnyKeyToContinue();
        return true;
    }
 private void pressAnyKeyToContinue()
 { 
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
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