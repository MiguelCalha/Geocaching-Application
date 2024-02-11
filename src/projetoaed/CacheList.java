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
public class CacheList<T> implements DoublyLinkedList<T> {

    private Node<T> header;
    private Node<T> trailer;

    public CacheList() {

        header = new Node<T>(null);
        trailer = new Node<T>(null);
        header.prev = null;
        trailer.next = null;
        header.next = trailer;
        trailer.prev = header;

    }

    @Override
  
    public void add(T pElem) throws ElemntInvalidException {

        Node<T> newNode = new Node<T>(pElem);
        newNode.next = header.next;
        newNode.prev = header;
        newNode.next.prev = newNode;
        header.next = newNode;

    }

    @Override
    public T remove(T pElem) {
        Node<T> front = header.next;
        Node<T> back = trailer.prev;
        
        while(!back.next.equals(front.prev) && back.next!=front)
        {
            if(front.elem.equals(pElem))
            {
                if(front.prev==null)
                {
                    header.next=front;
                }
                else 
                {
                    front.prev.next=front.next;
                    front.next.prev=front.prev;
                }
                return pElem;
            }
            if(back.elem.equals(pElem))
            {
                if(back.next==null)
                {
                    trailer.prev=back;
                }
                else 
                {
                    back.prev.next=back.next;
                    back.next.prev=back.prev;
                }
                return pElem;
            }
            front=front.next;
            back= back.prev;
        }
        return null;
        
    }

    @Override
    public T get(int rank) {
        
        int posAtual = 1; // Posicao atual
        Node<T> atual = header.next;  // variavel que vai percorrer o array
        while (atual != trailer && posAtual<=rank) { //enquanto a pos. atual for diferente da ultima pos. e a posicao atual for difernete do rank percore
            posAtual++; //posicao atual ++ ou seja anda para a frente
            atual = atual.next;  // mudam para a proxima posição
        }
        return atual.elem;

    }

    @Override
    public void set(int rank, T pElem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        int size = 0;
        Node<T> atual = header.next;
        while (atual != trailer) {
            size++;
            atual = atual.next;
        }
        return size;

    }

    @Override
    public boolean isEmpty() {
        
        return header.next == trailer;
    }

    @Override
    public T search(T pElem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String print() {

        String output="";
        Node<T> atual = header.next;
        while (atual != trailer) {
            output+=atual.elem+"\n";
            atual = atual.next;
        }
        return output;
    }
    
     @Override
     
     public T getElementAtRank(int rank){
         
         Node<T> nodeAtRank = nodeAtRank(rank);
        if (nodeAtRank == null) {
            return null;
        }
        return nodeAtRank.elem;
     }
     
     public Node<T> nodeAtRank(int rank) {
        if (header.next == trailer) {
            throw new IllegalArgumentException("Está vazio");
        }
        if (rank < 0 || rank > size() - 1) {
            return null;
        }
        int curRank = 0;
        Node<T> atual = header.next;
        while (atual != trailer) {
            if (curRank == rank) {
                return atual;
            }
            atual = atual.next;
            curRank++;
        }
        return atual;
    }
    

    public class Node<T> {

        public T elem;
        public Node<T> prev;
        public Node<T> next;

        public Node(T elem) {
            this.elem = elem;
            prev = null;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" + "elem=" + elem + ", prev=" + prev + ", next=" + next + '}';
        }
    }

}
