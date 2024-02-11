/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dcalha
 */
public class Main {

    Parser parser = new Parser();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ElemntInvalidException, IOException {
        Parser parser= new Parser();
        Founds found = new Founds();
        
        boolean continuar=true;
        do {
        System.out.println("->LOAD");
        System.out.println("->FOUNDS");
        System.out.println("->TOTAL");
        System.out.println("->DATES");
        System.out.println("->ALTITUDES");
        System.out.println("->CLOSEST");
        System.out.println("->CENTER");
        System.out.println("->MATRIX81");
        System.out.println("->SEARCH");
        System.out.println("->TOP10");
        System.out.println("->STATES");
           continuar= parser.parseCommand();
        } while (continuar==true);
    }

}
