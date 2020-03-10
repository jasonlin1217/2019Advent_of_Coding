import java.io.*;
import java.util.* ; 

public class Day1p2 {
	
	private static int fuelCalc(int mass){
        int value = mass/3 - 2;
        if (value <= 0) {
            return 0;
        }
        return value;
	}

    private static Integer totalFuel(List<Integer> modules){
		int sum = 0;
		for (int i = 0; i < modules.size(); i++) {
            int x = modules.get(i);
            while (fuelCalc(x) != 0) {
                sum = sum + fuelCalc(x);
                x = fuelCalc(x);
            }
		}
		return sum;

	}

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> iFile = new ArrayList<>();
		File input = new File("day1input.txt");
		Scanner sc = new Scanner(input);
		while(sc.hasNext()){
			iFile.add(sc.nextInt());
		}
		System.out.println(totalFuel(iFile));
	}

}


