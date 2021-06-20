package quiz.pkg04.pkg10.feb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Quiz0410Feb {
    public static void main(String[] args) throws Exception {
        try {
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab Quizes\\Quiz 04 (10 Feb)\\src\\quiz\\pkg04\\pkg10\\feb\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String n = br.readLine();
            int node = Integer.parseInt(n);
            DFSGraph g = new DFSGraph(node);
            String st;
            while ((st = br.readLine()) != null) {

                String[] s = st.split(",");
                int p = Integer.parseInt(s[0]);
                int q = Integer.parseInt(s[1]);
                g.addEdge(p, q);
            }
            
            System.out.println ("From Source: ");
            g.DFS(1); 
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException(".........");
        }
    }
}