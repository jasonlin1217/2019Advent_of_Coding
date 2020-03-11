import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day2p2 {

	/*
	Not sure what proper input is so I'm assuming input is an string
	*/

	private static Integer[] computer(Integer[] iCode){
		for (int j = 0; j < iCode.length; j++) {
			if (iCode[j] == 1) {
				iCode[iCode[j+3]] = iCode[iCode[j+1]] + iCode[iCode[j+2]];
				j = j + 3; 
			} else if (iCode[j] == 2) {
				iCode[iCode[j+3]] = iCode[iCode[j+1]] * iCode[iCode[j+2]];
				j = j + 3; 
			} else if (iCode[j] == 99) {
				return  iCode;
			}
		}
		return iCode;
	}
	
	private static Integer[] convert(String code) {
		String[] sCode = code.split(",");
		Integer[] intCode = new Integer[sCode.length];
		//convert string array to int arraylist
		for (int i = 0; i < sCode.length; i++){
			intCode[i] = Integer.parseInt(sCode[i]);
		}
		return intCode;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("day2input.txt");
		Scanner sc = new Scanner(input);
		String s = sc.nextLine();
		sc.close();
        Integer[] iArray = convert(s);
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray.length; j++) {
                iArray = convert(s);
                iArray[1] = i;
                iArray[2] = j;
                int calc = computer(iArray)[0];
                if (calc == 19690720) {
                    System.out.println(100 * i + j);
                }
            }
        }
		
	}
	
}