// import java.util.*;
// public class graph{
//     static class Edge{
//         int scr;
//         int dest;
//         int Wt;

//         public Edge(int s,int d,int w){
//             this.scr=s;
//             this.dest=d;
//             this.Wt=w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0,2,2));

//         graph[1].add(new Edge(1,2,10));
//         graph[1].add(new Edge(1,3,0));

//         graph[2].add(new Edge(2,0,2));
//         graph[2].add(new Edge(2,3,-1));
//         graph[2].add(new Edge(2,1,10));

//         graph[3].add(new Edge(3,2,-1));
//         graph[3].add(new Edge(3,1,0));

//     }
//     public static void main(String[] args){
//        // System.out.println("Hello new data structure graph");
//        int V=4;
//        @SuppressWarnings("unchecked")
//        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];


//       //  ArrayList<Edge>[] graph=new ArrayList[V];
//        createGraph(graph);

//        for(int i=0;i<graph[0].size();i++){
//         Edge e=graph[0].get(i);
//         System.out.print(e.dest+" "+e.Wt+" ");
//        }
//        System.out.println();
//         for(int i=0;i<graph[1].size();i++){
//         Edge e=graph[1].get(i);
//         System.out.print(e.dest+" "+e.Wt+" ");
//        }
//        System.out.println();
//         for(int i=0;i<graph[2].size();i++){
//         Edge e=graph[2].get(i);
//         System.out.print(e.dest+" "+e.Wt+" ");
//        }
//        System.out.println();
//         for(int i=0;i<graph[3].size();i++){
//         Edge e=graph[3].get(i);
//         System.out.print(e.dest+" "+e.Wt+" ");
//        }
//     }
// }

// BFS.//////////////////////////////////////////////////////// 
// import java.util.*;
// public class graph{
//     static class Edge{
//         int scr;
//         int dest;
//         //int Wt;

//         public Edge(int s,int d){
//             this.scr=s;
//             this.dest=d;
//            // this.Wt=w;
//         }
//     }
//      public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0,1));
//         graph[0].add(new Edge(0,2));


//         graph[1].add(new Edge(1,3));
//         graph[1].add(new Edge(1,0));
        

//         graph[2].add(new Edge(2,0));
//         graph[2].add(new Edge(2,4));
       

//         graph[3].add(new Edge(3,1));
//         graph[3].add(new Edge(3,4));
//         graph[3].add(new Edge(3,5));

//         graph[4].add(new Edge(4,2));
//         graph[4].add(new Edge(4,3));
//         graph[4].add(new Edge(4,5));

//         graph[5].add(new Edge(5,3));
//         graph[5].add(new Edge(5,4));
//         graph[5].add(new Edge(5,6));

//         graph[6].add(new Edge(6,5));

//     }
//     /// BFS
//     public static void bfs(ArrayList<Edge> graph[],int V){
//         Queue<Integer> q=new LinkedList<>();
//         boolean vis[]=new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()){
//             int curr=q.remove();
//             if(vis[curr]==false){
//                 System.out.print(curr+" ");
//                 vis[curr]=true;
//                 for(int i=0;i<graph[curr].size();i++){
//                     Edge e=graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     // DFS.////////////
//     public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
//         System.out.print(curr+" ");
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(vis[e.dest]==false)
//             dfs(graph,e.dest,vis); 
//         }
//     }
//     public static void main(String[] args) {
//         int V=7;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         boolean vis[]=new boolean[V];
//         dfs(graph,0,vis);
//         // bfs(graph,V);
//         System.out.println();
//     }
// }

// Qustion- all paths form source to target.///////////
// import java.util.*;
// public class graph{
//     static class Edge{
//         int scr;
//         int dest;
//         //int Wt;

//         public Edge(int s,int d){
//             this.scr=s;
//             this.dest=d;
//            // this.Wt=w;
//         }
//     }
//      public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0,1));
//         graph[0].add(new Edge(0,2));


//         graph[1].add(new Edge(1,3));
//         graph[1].add(new Edge(1,0));
        

//         graph[2].add(new Edge(2,0));
//         graph[2].add(new Edge(2,4));
       

//         graph[3].add(new Edge(3,1));
//         graph[3].add(new Edge(3,4));
//         graph[3].add(new Edge(3,5));

//         graph[4].add(new Edge(4,2));
//         graph[4].add(new Edge(4,3));
//         graph[4].add(new Edge(4,5));

//         graph[5].add(new Edge(5,3));
//         graph[5].add(new Edge(5,4));
//         graph[5].add(new Edge(5,6));

//         graph[6].add(new Edge(6,5));

//     }
//     /// BFS
//     public static void bfs(ArrayList<Edge> graph[],int V){
//         Queue<Integer> q=new LinkedList<>();
//         boolean vis[]=new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()){
//             int curr=q.remove();
//             if(vis[curr]==false){
//                 System.out.print(curr+" ");
//                 vis[curr]=true;
//                 for(int i=0;i<graph[curr].size();i++){
//                     Edge e=graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     // DFS.
//     public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
//         System.out.print(curr+" ");
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(vis[e.dest]==false) 
//             dfs(graph,e.dest,vis); 
//         }
//     }
//     public static void allPath(ArrayList<Edge> graph[],boolean vis[],int src,int tar,String path){
//         if(src==tar){
//             System.out.println(path+tar);
//             return;
//         }
//         vis[src]=true;
//         for(int i=0;i<graph[src].size();i++){
//             Edge e=graph[src].get(i);
//             if(!vis[e.dest]){
//                 allPath(graph, vis,e.dest, tar, path+"->"+e.dest);
//             } 
//         }
//          vis[src]=false;
//     }
//     public static void main(String[] args) {
//         int V=7;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         int src=0,tar=5;
//         allPath(graph, new boolean[V], src, tar, "0");
//         // boolean vis[]=new boolean[V];
//         // dfs(graph,0,vis);
//         // bfs(graph,V);
//        // System.out.println();
//     }
// }

// cycle detection.////////////
// import java.util.*;
// public class graph{
//     static class Edge{
//         int src;
//         int dest;

//         public Edge(int s,int d){
//             this.src=s;
//             this.dest=d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[0].add(new Edge(0,2));
       
//         graph[1].add(new Edge(1,0));

//         graph[2].add(new Edge(2,3));

//         graph[3].add(new Edge(3,0));

//     }
//     public static boolean iscycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
//         vis[curr]=true;
//         rec[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(rec[e.dest]){
//                 return true;
//             }else if(!vis[e.dest]){
//                if(iscycle(graph,vis,e.dest,rec)){
//                 return true;
//                }
//             }
//         }
//         rec[curr]=false;
//         return false;
        
//     }
//     public static void main(String[] args) {
//         int V=4;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         System.out.println(iscycle(graph,new boolean[V],0,new boolean[V]));
//     }
// }

// import java.util.*;
// public class graph{
//     static class Edge{
//         int src;
//         int dest;
//         public Edge(int s,int d){
//             this.src=s;
//             this.dest=d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//         graph[2].add(new Edge(2,3));
//         graph[3].add(new Edge(3,1));
//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));
//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));
//     }

//     // Topological sort.
//     public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer>stack){
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(!vis[e.dest]){
//                 topSortUtil(graph,e.dest,vis,stack);
//             }
//         }
//         stack.push(curr);
//     }
//     public static void topSort(ArrayList<Edge> graph[],int V){
//         boolean vis[]=new boolean[V];
//         Stack<Integer>stack=new Stack<>();
//         for(int i=0;i<V;i++){
//             if(!vis[i]){
//                 topSortUtil(graph,i,vis,stack);
//             }
//         }
//         while(!stack.isEmpty()){
//             System.out.print(stack.pop()+" ");
//         }
//     }
//     public static void main(String[] args){
//         int V=6;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);

//         topSort(graph,V);
        
//     }
// }
//cycle detection in undirected graph.///////////
// import java.util.*;
// public class graph{
//     static class Edge{
//         int src;
//         int dest;
//         public Edge(int s,int d){
//             this.src=s;
//             this.dest=d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }
//     graph[0].add(new Edge(0,1));
//     graph[0].add(new Edge(0,4));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,2));
//     graph[1].add(new Edge(1,4));

//      graph[2].add(new Edge(2,1));
//     graph[2].add(new Edge(2,3));

//      graph[3].add(new Edge(3,2));

//       graph[4].add(new Edge(4,0));
//        graph[4].add(new Edge(4,1));
//         graph[4].add(new Edge(4,5));

//          graph[5].add(new Edge(5,4));

//     }
//     public static boolean iscycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr,int parent){
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(vis[e.dest] && e.dest!=parent){
//                 return true;
//             }
//             else if(!vis[e.dest]){
//                 if(iscycleUndirected(graph,vis,e.dest,curr)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//      public static void main(String[] args){
//         int V=6;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         System.out.println(iscycleUndirected(graph,new boolean[V],0,-1));
    
//     }
// }

// import java.util.*

// public class graph {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String s = sc.nextLine().toLowerCase();  // convert to lowercase

//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }

//         System.out.println("Number of vowels in the string: " + count);

//         sc.close();
//     }
// }

/*
Bipartite Graph
A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge
(u, v) either connects a vertex from U to V or a vertex from V to U. In other words, for every edge (u, v), either u
belongs to U and v to V, or u belongs to V and v to U. We can also say that there is no edge that connects vertices of
same set. */

import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[], int V) {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) { 
                if (!bfsCheck(graph, i, color)) {
                    return false; 
                }
            }
        }
        return true; // Bipartite
    }

    private static boolean bfsCheck(ArrayList<Edge> graph[], int start, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0; 

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (Edge e : graph[curr]) {
                if (color[e.dest] == -1) {
                    color[e.dest] = 1 - color[curr];
                    queue.add(e.dest);
                } else if (color[e.dest] == color[curr]) {
                    return false; 
                }   
            }
        }
        return true; // Bipartite
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBipartite(graph, V));
    }
}
