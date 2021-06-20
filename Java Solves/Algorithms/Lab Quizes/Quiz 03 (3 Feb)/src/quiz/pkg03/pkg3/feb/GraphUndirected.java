package quiz.pkg03.pkg3.feb;
/**
 *
 * @author 17201019 & 17201105
 */
import java.util.*;

class GraphUndirected {
    private int V; //no of vertices
    private ArrayList adj[]; 
    public int [] color;
    public int [] predec; static int ite = 0;
    public int [] dis;
    public int [] length;
    GraphUndirected(int v) {
        V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new ArrayList();
        }
        color = new int [V];
        predec = new int [V];
        dis = new int [V];
        length = new int [V];
    }
    
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        ite = s;
        dis = new int [V];
        
        while (queue.size() != 0) {
            s = queue.poll();
            
            //System.out.print(s + " ");

            int j = 0; int size = adj[s].size();
            
//            if (color[s] == 0) {
//                color[s] = 1;
//                System.out.println(s + " Has Been Found (Making Grey) (" + color[s] + ")");
//            }
            
            
            while (j < size) {
                int n = (int)adj[s].get(j);
                j++;
                if (!visited[n]) {
                    dis [n] = dis[s] +1;
                    length [ite] = length [ite] + dis [n]; 
                    visited[n] = true;
                    queue.add(n);
                }
            }
            
//            if (color[s] == 1){
//            color[s] = 2;
//            System.out.println (s + " Is Finished Processing (Making Black) (" + color[s] + ")");
//            }
        }
        
//        for (int i = 2; i <= predec.length; i++) {
//            System.out.println (predec [i-1] + " 's parent is " + predec [(i/2)-1]);
//        }
//        
//        System.out.println ();
//        for (int i = 0; i < dis.length; i++) {
//            System.out.println (i + " Vertex's " + "Distance is " + dis [i]);
//        }
//       System.out.println (length [ite]);
    
}
}