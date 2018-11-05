/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.LinkedList;
import java.util.ListIterator;


/**
 *
 * @author CHAMOD LAKMAL
 */
public class Graph {
    int V;
    LinkedList<Integer> adj[];
    
    Graph(int s)
    {
        V=s;
        adj=new LinkedList[s];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    
    void BFS(int s)
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(s);
        visited[s]=true;
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.print(s+" ");            
            ListIterator<Integer> i=adj[s].listIterator();
            while(i.hasNext())
                {
                 s=i.next();
                    while(!visited[s])
                        {
                    visited[s]=true;
                    queue.add(s);
                    }
        }
        }
        
        
        
    }
    
    void DFS(int s)
    {
        boolean visisted[]=new boolean[V];
        DFSUtil(s,visisted);
    }

     void DFSUtil(int s, boolean[] visisted) {
        visisted[s]=true;
        System.out.print(s+" ");
        ListIterator<Integer> i=adj[s].listIterator();
        while(i.hasNext())
        {
            s=i.next();
            while(!visisted[s])
            {
                visisted[s]=true;
                DFSUtil(s, visisted);
            }
        }
    }
     
}