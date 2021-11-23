package actual_task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
    	System.out.println("START");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "{Level 1 {Level 2-2{Level 3-1{Level 4-1}}{Level 3-2{Level 4-2}Level 3-3{Level 4-3}Level 3-4}}{Level 2-2{Level 3-5}}}::3";
        String[] tokens = input.split("::");
        String content = tokens[0];
        int level = Integer.parseInt(tokens[1]);
        
        
        List<String> lines = Extractor.extractData(content.replace("\\n", "\n"), level);
        List<String> finalLines = new ArrayList<>(); 
        for(String line: lines) {
            finalLines.add(line.trim());
        }
                                              
        System.out.print(finalLines);
    }
}
