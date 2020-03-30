import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Day6p1 {
    
    private static List<String> convert(List<String> input) {
        Map<String, ArrayList<String>> tree = new HashMap<>();
        List<String> isChild = new ArrayList<>();
        
        for (int i = 0; i < input.size(); i++) {
            String[] sOrbit = input.get(i).split(")");
            if (tree.containsKey(sOrbit[0]) == false) {
                ArrayList<String> children = new ArrayList<>();
                children.add(sOrbit[1]);
                isChild.add(sOrbit[1]);
                tree.put(sOrbit[0],children); 
            } else {
                tree.get(sOrbit[0]).add(sOrbit[1]);
            }
        }
        

        return isChild;
    }
    public static void main(String[] args) throws FileNotFoundException {
		List<String> dFile = new ArrayList<>();
        File input = new File("day6input.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNext()) {
            dFile.add(sc.nextLine());
        }
        sc.close();
        List<Integer> values = convert(dFile);

        System.out.println(values);
    }
}