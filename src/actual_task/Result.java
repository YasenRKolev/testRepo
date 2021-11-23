package actual_task;

import java.util.LinkedList;
import java.util.List;

class Result {

    /*
     * Complete the 'extractData()' function below.
     *
     * The function is expected to return a List<String>
     */
    public static List<String> extractData(String hierarchicalData, int level) {
    	List<String> linesOfDesiredLevel = new LinkedList<>();
        char[] charrArray = hierarchicalData.toCharArray();       
        
        int currentLevel = 0;
        String currentLineString = "";
        for (int i=0;i<charrArray.length;i++) {
        	switch (charrArray[i]) {
	    		case '{':
	    			addLineToResultIfLevelMatches(currentLineString, linesOfDesiredLevel, currentLevel, level);
	    			currentLineString = "";
	    			currentLevel++;
	    			break;
	    		case '}':
	    			addLineToResultIfLevelMatches(currentLineString, linesOfDesiredLevel, currentLevel, level);
	    			currentLineString = "";
	    			currentLevel--;
	    			break;
				default:
					currentLineString += String.valueOf(charrArray[i]);
	    	}
        }
        return linesOfDesiredLevel;
    }
    
	private static void addLineToResultIfLevelMatches(String currentLine, List<String> linesOfDesiredLevel, int currentLevel, int desiredLevel) {
		if (currentLine.isBlank()) {
			return;
		}
		
		if (currentLevel == desiredLevel) {
			linesOfDesiredLevel.add(currentLine);
		}
	}
}


