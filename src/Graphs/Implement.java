package Graphs;

import java.util.ArrayList;

public class Implement {
   static class Edge{
       int src;
       int dest;
       int wht;

   public Edge(int s,int d,int w){
       this.src=s;
       this.dest=d;
       this.wht=w;
   }
   }

   public static void createGraph(ArrayList<Edge>graph[]) {
       for (int i = 0; i < graph.length; i++) {
           graph[i]=new ArrayList<Edge>(); // we have donr this to remove null initially , whe have to create empty list so that we can add new items,
       }
       graph[0].add(new Edge(0,1,1));
       graph[0].add(new Edge(0,2,2));
       graph[1].add(new Edge(1,0,3));
       graph[1].add(new Edge(1,3,3));
       graph[2].add(new Edge(2,0,4));
       graph[2].add(new Edge(2,4,5));


       graph[3].add(new Edge(3,1,7));
       graph[3].add(new Edge(3,4,8));
       graph[3].add(new Edge(3,5,8));

       graph[4].add(new Edge(4,2,8));
       graph[4].add(new Edge(4,3,8));
       graph[4].add(new Edge(4,5,8));

       graph[5].add(new Edge(5,3,8));
       graph[5].add(new Edge(5,4,8));
       graph[5].add(new Edge(5,6,8));
       graph[5].add(new Edge(6,5,8));
   }

   static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,int target,String Path){

       if(curr==target){
           System.out.println(Path);
           return;
       }

       for (int i = 0; i <graph[curr].size() ; i++) {
           Edge e = graph[curr].get(i);
           if (!vis[e.dest]) {
               vis[curr] = true;
               printAllPath(graph, vis, e.dest, target, Path + e.dest);
               vis[curr] = false;
           }
       }
   }

    public static void main(String[] args) {
    int v=7;//size of list of list 0,1,2,3=4size

          /*
          1 --- 3
         /      | \
        0       |   5 -- 6
        \       |  /
          2 --- 4
          */


        ArrayList<Edge> graph[]=new ArrayList[v]; // Intialize the  list of list of size 4;
        boolean vis[]=new boolean[v];
        //printing neigbous of 2's
        createGraph(graph);
        //for (int i = 0; i <graph[2].size() ; i++) {
           // Edge e=graph[2].get(i);
            //System.out.println(e.src+"-->"+e.dest+" , "+e.wht);
        printAllPath(graph,new boolean[v],0,5,"0");
        }

    }

