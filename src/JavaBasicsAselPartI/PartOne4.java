package JavaBasicsAselPartI;

public class PartOne4 {

	public static void main(String[] args) {
		
		int numOfCountries=0;
		
		String[][] countries = {
				{"United States", "Canada", "Mexico"},
				{"Columbia", "Brazil", "Peru", "El Salvador"},
				{"Germany", "France", "Greece", "Spain"},
				{"China", "Japan", "Ukraine",},
				{"Egypt", "Uganda"},
		};
		for(int a=0; a<countries.length; a++) {
			for (int b=0; b<countries[a].length; b++) {
				numOfCountries++;
				System.out.println(countries[a][b] + " ");
			}
		}
		System.out.println("Total number of Countries is " + numOfCountries );
	}

}
