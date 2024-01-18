package excercise;

class Sports {

	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}

	// Write your overridden getNumberOfTeamMembers method here

	void getNumberOfTeamMembers() {

		System.out.println("Each team has 11 players in Soccer Class");

	}

}

public class MethodOverridingExp {

	public static void main(String[] args) {

		Sports c1 = new Sports();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();

		Soccer c2 = new Soccer();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();

	}

}
