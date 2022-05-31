package com.projectseries;
import java.util.*;
class Main {


    private LinkedList<Integer> adj[];
    private boolean visited[];

    Main(int V){
        adj = new LinkedList[V];
        visited= new boolean[V];

        for (int i=0;i<V;i++)
            adj[i]= new LinkedList<Integer>();
    }
    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }
    void DFS(int vertex){
        visited[vertex] =true;
        System.out.print(vertex+" ");

        Iterator<Integer>it=adj[vertex].listIterator();
        while (it.hasNext()){
            int n= it.next();
            if(!visited[n])
                DFS(n);
        }
    }

//    @SuperWarnings("unchecked") Main(int v){
//        V=v;
//        adj = new LinkedList[v];
//        for (int i=0; i<v;i++)
//            adj[i] =new LinkedList();
//    }
//    void addEdge(int v, int w){
//        adj[v].ads(w);
//    }
//    void DFS(int v,boolean visited[]){
//        visited[v] =true;
//        System.out.print(v+" ");
//
//        Iterator<Integer> i= adj[v].listIterator();
//        while (it.hasNext()){
//            int n=it.next();
//            if (!visited[n])
//                DFS(n ,visited);
//        }
//
//    }
    public static void main(String[] args){

        Main= new Main(8);
        graph.insertEdge(0,1);
        graph.insertEdge(0,2);
        graph.insertEdge(0,3);
        graph.insertEdge(1,3);
        graph.insertEdge(2,4);
        graph.insertEdge(3,5);
        graph.insertEdge(3,6);
        graph.insertEdge(4,7);
        graph.insertEdge(4,5);
        graph.insertEdge(5,2);
        System.out.println("DFS");
        graph.DFS(0);

    }
}

