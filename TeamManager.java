public class TeamManager {

	private Olympian[] olympians;
	private Olympian extra = new Olympian();

	public TeamManager(Olympian[] olympians) {
		this.olympians = olympians;

	}

	public void getTeams() {

		Olympian[] femaleOlympians = new Olympian[16];
		Olympian[] maleOlympians = new Olympian[16];

		int femaleCount = 0;
		int maleCount = 0;

		for (int i = 0; i < olympians.length; i++) {

			if (olympians[i].getSex().equals(Sex.Female)) {
				femaleOlympians[maleCount] = olympians[i];
				femaleCount++;

			} else if (olympians[i].getSex().equals(Sex.Male)) {
				maleOlympians[femaleCount] = olympians[i];
				maleCount++;

			}
		}
	}
}
