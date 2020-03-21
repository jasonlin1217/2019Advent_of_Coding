import java.util.*;

public class Day4p2 {
    private static List<Integer> inputParse(String s) {
        String[] nums = s.split("-");
        List<Integer> numList = new ArrayList<>();
        numList.add(Integer.parseInt(nums[0]));
        numList.add(Integer.parseInt(nums[1]));
        return numList;
    }

    private static Integer passwordCount(List<Integer> parameters) {
        List<Integer> fits = new ArrayList<>();
        for (int i = parameters.get(0); i <= parameters.get(1); i++) {
            int j = i;
            Queue<Integer> number = new LinkedList<>();
            Map<Integer, Integer> dupes = new HashMap<>();
            Boolean copyCheck = false;
            Boolean sizeCheck = false;    
            Boolean end = false;
            while (j > 0) {
                number.add(j % 10);
                j = j/10;
            }
            while (number.size() > 1 && !end) {
                int last = number.poll();
                int sLast = number.peek();
                if (last == sLast) {
                    copyCheck = true;
                    sizeCheck = true;
                    if (dupes.containsKey(last)) {
                        int sum = dupes.get(last) + 1;
                        dupes.put(last, sum);
                    } else {
                        dupes.put(last, 1);
                    }
                } else if (last > sLast) {
                    sizeCheck = true;
                } else {
                    sizeCheck = false;
                    end = true;
                }
            }
            if (copyCheck && sizeCheck) {
                List<Integer> q = new ArrayList<>();
                for (int m : dupes.keySet()){
                    if (dupes.get(m) > 1) {
                        q.add(m);
                    }
                }
                for (int o = 0; o < q.size(); o ++) {
                    dupes.remove(q.get(o));
                }
                if (!dupes.keySet().isEmpty()) {
                    fits.add(i);
                }
            }
            
        }
        return fits.size();
    }

    public static void main(String[] args) {
        String s = "172930-683082";
        int solution = passwordCount(inputParse(s));
        System.out.println(solution);
    }
}