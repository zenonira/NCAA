import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ReadNCAA {

	public static void main(String[] args)  throws FileNotFoundException {
		ArrayList<String> all = new ArrayList<String>();
		ArrayList<String> region = new ArrayList<String>();
		Scanner reader = new Scanner(new File("ncaa2014.csv"));

		while (reader.hasNextLine()) {
			String next = reader.nextLine();
			String[] values = next.split("    ");

			for (String s : values) {
				//System.out.print(s + " ");
				all.add(s + " ");
			}

			
		}
		for (int i=0; i<all.size(); i++) {
			if(all.get(i).contains(",") || all.get(i).contains("South") || all.get(i).contains("East") || all.get(i).contains("West") || all.get(i).contains("North")) {
				region.add(all.get(i));
			}
		}
		//System.out.println(region);
		Region south = new Region("South ", region);
		Region east = new Region("East ", region);
		Region west = new Region("West ", region);
		Region midWest = new Region("MidWest ", region);

	}

}