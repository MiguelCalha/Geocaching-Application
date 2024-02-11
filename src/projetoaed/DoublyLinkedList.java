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
public interface DoublyLinkedList<T> {
    
public void add(T pElem) throws ElemntInvalidException;
public T remove(T pElem);
public T get(int rank);
public void set(int rank, T pElem);
public int size();
public boolean isEmpty();
public T search(T pElem);
public String print();
public T getElementAtRank(int rank);



}
