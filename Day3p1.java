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
    private static dirToArray(ArrayList<String> directions) {
        int cX, cY = 0; 
        List<int> path = new ArrayList<>();
        for (int i = 0; i < directions.size(); i++) {

        } 
    }
   
    //convert string to an arraylist of strings
    private static ArrayList<String> convert(String code) {
        String[] sCode = code.split(",");
        List<String> directions = new ArrayList<>();
        //convert string array to string arraylist
        int cX, cY = 0; 
		for (int i = 0; i < sCode.length; i++){
            Char[] f = sCode.toCharArray();
            String s; 
            for (int j = 1;  j < sCode.length; j++) {
                s = s + f[j];
            }
            int distance = Integer.parseInt(s);
			if (sCode[i].charAt(0) == "U") {
                cY = 1; 
            } else if (sCode[i].charAt(0) == "D") {
                cY = -1;
            } else if (sCode[i].charAt(0) == "L") {
                cX = -1;
            } else if (sCode[i].charAt(0) == "R") {
                cX = 1;
            }
            Integer.parseInt(sCode.split())

		}
		return directions;
	}

    public static void main(String[] args)  {
        List<String> dFile = new ArrayList<>();
        File input = new File("day3input.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNext()){
           dFile.add(sc.nextLine();)
        }
        sc.close();
        for (String s : dFile) {
            convert(s):
        }
    }
}