/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import javaapplication11.GFG.Graph1;
import static javaapplication11.GFG.addEdge;
import static javaapplication11.GFG.printGraph;

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
       g.addEdge(2, 2);
       g.addEdge(2, 3);
       g.addEdge(2, 4); 
        g.addEdge(3, 3); 
        g.addEdge(3, 4); 
        g.addEdge(4, 3); 
       g.BFS(0);
       System.out.println("");
       g.DFS(0);
       System.out.println("");
       
       int V = 5; 
        Graph1 graph = new Graph1(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph);
       
    }
    
}
