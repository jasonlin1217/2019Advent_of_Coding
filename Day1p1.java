import java.io.*;
import java.util.* ; 

public class Day1p1 {
	/*
	Not sure what proper input is so I'm just gonna use
	an arraylist of modules.
	*/

	private static int fuelCalc(int mass){
		int value = mass/3 - 2;
		return value;
	}

    private static Integer totalFuel(List<Integer> modules){
		int sum = 0;
		for (int i = 0; i < modules.size(); i++) {
			sum = sum + fuelCalc(modules.get(i));
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


