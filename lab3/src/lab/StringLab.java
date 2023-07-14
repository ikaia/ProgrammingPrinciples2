package lab;

public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str1 = new String ("Georgia Southern CS");
		System.out.println(str1);
	
		str1.replace( "CS" , "Computing");
		System.out.println(str1);
		
		String str3 = str1.replace ("CS" , "Computing"); 
		System.out.println(str3);
		
		String str4 = "Peas@Porrige@Hot";
		String [] splitString = str4.split("@");
		for (int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
		}
		
		String str5 = "Peas Porrige Hot";
		String str6 = str5.substring(5);
		System.out.println(str6);
		
		String str7 = str5.substring(5, 12);
		System.out.println(str7);
		

	}

}
