import java.util.ArrayList;

public class Region {
	public Region(String keyWord, ArrayList<String> allTeams) {
		int start = allTeams.indexOf(keyWord);
		ArrayList<String> division = putIn(start, allTeams);
		ArrayList<Team> teams = sortIntoTeams(division);
	}


	public ArrayList<String> putIn(int begin, ArrayList<String> teams) {
		ArrayList<String> part = new ArrayList<String>();
		for (int i=begin; i<begin + 16; i++) {
			part.add(teams.get(i+1));
			//System.out.println(teams.get(i+1));
		}
		return part;
	}

	public ArrayList<Team> sortIntoTeams(ArrayList<String> strings) {
		ArrayList<Team> region = new ArrayList<Team>();
		for (String a : strings) {
			ArrayList<String> change = strings.split(",");
			//String name = change.get(0);
			//int seed = Integer.parseInt(change.get(1));
			//double wp = Double.parseDouble(change.get(2));
			//Team newTeam = new Team(name, seed, wp);
			//region.add(newTeam);
			System.out.println(change);
		}
		return region;
	}
}