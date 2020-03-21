import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day5p1 {

    private static Integer[] computer(Integer[] iCode){
		for (int j = 0; j < iCode.length; j++) {
			if (iCode[j] == 1) {
				iCode[iCode[j+3]] = iCode[iCode[j+1]] + iCode[iCode[j+2]];
				j = j + 3; 
			} else if (iCode[j] == 2) {
				iCode[iCode[j+3]] = iCode[iCode[j+1]] * iCode[iCode[j+2]];
				j = j + 3; 
            } else if (iCode[j] == 3) {
                iCode[iCode[j+1]] = iCode[iCode[j+2]];
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
		iArray[1] = 12;
		iArray[2] = 2;
		Integer[] fArray = computer(iArray);
		System.out.println(fArray[0]);
	}
}