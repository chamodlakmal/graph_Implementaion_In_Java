/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Graph g=new Graph(5);
       g.addEdge(0, 2);
       g.addEdge(0, 1);
       g.addEdge(0, 3);
       g.addEdge(1, 0);
       g.addEdge(1, 1);
       g.addEdge(1, 2);
       g.addEdge(2, 4);
       g.addEdge(2, 2);
       
       g.BFS(0);
       System.out.println("");
       g.DFS(0);
       System.out.println("");
       
    }
    
}
