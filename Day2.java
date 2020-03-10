import java.util.* ; 

public class Day2 {

	/*
	Not sure what proper input is so I'm assuming input is an string
	*/

	private static Integer[] computer(Integer[] iCode){
		for (int j = 0; j < iCode.length(); i++) {
			if (iCode[j] == 1) {
				iCode[[icode[j+3]]] = iCode[[iCode[j+1]]] + iCode[iCode[j+2]]
				j = j + 3; 
			} else if (iCode[j] == 2) {
				iCode[[icode[j+3]]] = iCode[[iCode[j+1]]] * iCode[iCode[j+2]]
				j = j + 3; 
			} else if (iCode[j] == 99) {
				return  iCode;
			}
		}
		return iCode;
	}
	
	private static Integer[] covert(String code) {
		String [] sCode = code.split(",");
		Integer [] iCode = new Integer[sCode.length()];
		//convert string array to int arraylist
		for (int i = 0; i < sCode.length(); i++){
			iCode[i] = Integer.parseInt(sCode[i]);
		}
		return iCode;
	}
	
}