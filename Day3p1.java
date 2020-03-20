import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day3p1 {
     /*To keep track of what im trying to do and I dont forget tomorrow
    what I want to do is create a long ass string with all the points the directions go through
    1. convert file to a string (the path described by the list of instructions)
    2. split string into individual instructions
    3. add each point the directions pass through as a value pair (x,y) in a hashmap so from 
    4. compare the hashmaps of both paths to see if any values match, if so those are my intersections
    5. make a list out of the intersections, 
    6. go through the list and figure out which one is the shortest from 0,0
    */

    /*
    biggest gimmick i need to figure out is how the fuck do i add each point properly to a hashmap, 
    e.g. keys = Y coordinate , values = X coordinate, 
    so if U100, R100, D100 i need to figure out how to add a point at every key from 0 to 100 with teh value 0. 
    then i gotta add values 0-100 at key 100 then i gotta add value 100 at every key 0-100;
    
    */
    //convert string to an arraylist of strings
    private static List<Integer> convert(List<String> code) {
        List<List<Integer>> keysList = new ArrayList<>();
        List<Integer> cross = new ArrayList<>();
        HashMap<Integer, Integer> grid = new HashMap<>();
        //convert string array to string arraylist
        for (int i = 0; i < code.size(); i++) {
            List<Integer> dKeys = new ArrayList<>();
            String[] sCode = code.get(i).split(",");
            int cX = 0, cY = 0; 
            for (int j = 0; j < sCode.length; j++) {
                char[] f = sCode[i].toCharArray();
                String first = "" + f[0];
                String s =""; 
                for (int k = 1;  k < sCode.length; k++) {
                    s = s + f[k];
                }
                int distance = Integer.parseInt(s);
                if (first == "U") {
                    int travel = cY + 1 * distance; 
                    dKeys.add(travel);
                    for (int w = 0; w < travel; w++) {
                        grid.put(w, cX);
                    }
                } else if (first == "D") {
                    int travel = cY + -1 * distance;
                    dKeys.add(travel);
                    for (int w = 0; w < travel; w++) {
                        grid.put(w, cX);
                    }
                } else if (first == "L") {
                    int travel = cX + -1 * distance;
                    for (int w = 0; w < travel; w++) {
                        grid.put(cY, w);
                    }
                } else if (first == "R") {
                    int travel = cX + 1 * distance;
                    for (int w = 0; w < travel; w++) {0
                        grid.put(cY, w);
                    }
                }
            }
            keysList.add(dKeys);
        }
		return cross;
	}

    public static void main(String[] args) throws FileNotFoundException {
        List<String> dFile = new ArrayList<>();
        File input = new File("day3input.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNext()){
           dFile.add(sc.nextLine());
        }
        sc.close();
        List<Integer> xSections = convert(dFile); 
    }
}