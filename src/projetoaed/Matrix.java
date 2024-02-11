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
// Complexidade O^3(Polinomial)
public class Matrix {
    public void matrix(CacheList<Cache> list){   
        System.out.println("");
        int mat[][]= new int [9][9];
        double dif[]= {1 , 1.5 , 2 , 2.5 , 3 , 3.5 , 4 ,4.5 , 5};
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                 for(int k=0; k < list.size(); k++){
                    if(list.get(k).getTerrain()==dif[i] && list.get(k).getDifficulty()==dif[j]){
                        mat[i][j]++;
                    } 
                }
            }
        }
        System.out.print("\t ");
        for(int i=0;i<9;i++){
            System.out.print(""+dif[i]+"\t  ");
        }
        System.out.print("\n");
        for(int i=0;i<9;i++){
            System.out.print(dif[i]+"\t");
            for(int j=0;j<9;j++){
                System.out.print("  "+mat[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }


}
