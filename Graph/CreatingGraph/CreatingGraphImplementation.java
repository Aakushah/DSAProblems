import java.util.*;

public class CreatingGraphImplementation {

    static class Edges{
        int src;
        int dest;
        int weight;

        Edges(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.dest=w;
        }

    }
    public static void createGraph(ArrayList<Edges> Graph[]){

        for(int i=0;i<Graph.length;i++){
            Graph[i]=new ArrayList<Edges>();
        }

        Graph[0].add(new Edges(0, 2,2));

        Graph[1].add(new Edges(1, 2,10));
        Graph[1].add(new Edges(1, 3,0));

        Graph[2].add(new Edges(2, 0,2));
        Graph[2].add(new Edges(2, 1,10));
        Graph[2].add(new Edges(2, 3,-1));


        Graph[3].add(new Edges(3, 1,0));
        Graph[3].add(new Edges(3, 2,-1));
       

        // System.out.println("check");


    }


    public static void bfs(ArrayList<Edges> Graph[],boolean visited[],int s){

        Queue<Integer> q=new LinkedList<>();
        
        q.add(s);

        while(!q.isEmpty()){

            int curr=q.remove();
            if(visited[curr] == false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<Graph[curr].size();i++){
                    Edges e= Graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }


    public static void main(String[] args) {
        int v=4;

        ArrayList<Edges> Graph[]=new ArrayList[v];

        createGraph(Graph);

        boolean visited[] =new boolean[v];


        for(int i=0;i<v;i++){
            if(!visited[i]){
                bfs(Graph,visited,i);
            }

        }
        
    }
    
}
