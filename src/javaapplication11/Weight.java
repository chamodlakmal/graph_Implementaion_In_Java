package javaapplication11;

import java.util.LinkedList;
import java.util.List;

public class Weight {
    class Edge {
       int v,w;
       public Edge(int v,int w){
           this.v=v;
           this.w=w;
       }
       @Override
       public String toString(){
           return "{"+v+","+w+"}";
       }
    }
    List<Edge> G[];
    public Weight(int n){
        G=new LinkedList[n];
        for(int i=0;i<G.length;i++)
            G[i]=new LinkedList<Edge>();
    }
    void addEdge(int u,int v,int w){
        G[u].add(0,new Edge(v, w));
    }
    @Override
    public String toString(){
        String result="";
        for(int i=0;i<G.length;i++)
            result+=i+"=>"+G[i]+"\n";
        return result;
    }
}
