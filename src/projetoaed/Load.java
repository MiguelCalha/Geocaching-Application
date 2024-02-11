/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaed;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




/**
 *
 * @author dcalha
 */
public class Load {
    private String nomeFicheiro;
   
    // Complexidade O^n(linear)
    //Algoritmo que carrega ficheiro CSV e guarda-o numa lista duplamente ligada
    public void carregarCaches(CacheList<Cache> cacheList,String nomeFicheiro) throws IOException, ElemntInvalidException
    {
        String Ficheiro=nomeFicheiro;
        
       BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\dcalha\\Desktop\\Projetos\\AED\\ProjetoAED\\" + Ficheiro + ".csv")));
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            linha+=";";
            String[] dadosCache = linha.split(";");
            for(int i=0;i<16;i++)
            {
                System.out.println(dadosCache[i]);
            }
            
                double latitudeCache = Double.parseDouble(dadosCache[4]);
                double longitudeCache = Double.parseDouble(dadosCache[5]);
                CacheType cacheType=CacheType.valueOf(dadosCache[6]);
                CacheSize cacheSize=CacheSize.valueOf(dadosCache[7]);
                double dificuldadeCache = Double.parseDouble(dadosCache[8]);
                double terrenoCache = Double.parseDouble(dadosCache[9]);
                boolean disponivel = false;
                
                switch (dadosCache[10]) {
                    case "AVAILABLE":
                        disponivel = true;
                        break;
                    case "DISABLED":
                        disponivel = false;
                }
                String numeroFicheiro=Ficheiro.charAt(Ficheiro.length()-1)+"";
                 DateTimeFormatter formatarData;
               if(numeroFicheiro.equals("1"))
               {
                    formatarData = DateTimeFormatter.ofPattern("yyyy/MM/dd");
               }
               else
               {
                    formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               }
                    
                    LocalDate data = LocalDate.parse(dadosCache[11], formatarData);
                int numeroVezesCacheEncontrada = Integer.parseInt(dadosCache[12]);
                int numeroVezesCacheNaoEncontrada = Integer.parseInt(dadosCache[13]);
                int favoritosCache = Integer.parseInt(dadosCache[14]);
                int altitudeCache = Integer.parseInt(dadosCache[15]);
                cacheList.add(new Cache(dadosCache[0], dadosCache[1], dadosCache[2], dadosCache[3], latitudeCache, longitudeCache, cacheType, cacheSize, dificuldadeCache, terrenoCache, disponivel, data, numeroVezesCacheEncontrada, numeroVezesCacheNaoEncontrada, favoritosCache, altitudeCache));
                linha="";
        }
        reader.close();
    }
    
}
        
    
    

