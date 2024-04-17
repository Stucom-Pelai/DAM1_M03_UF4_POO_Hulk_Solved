package model;

//Class SuperHeroe
public class Superhero {
	protected String name;
	protected int age;
	protected String[] powers;

	public Superhero(String name, int age) {
		this.name = name;
		this.age = age;
		this.powers = new String[4];
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getPowers() {
		return powers;
	}

	public void setPowers(String[] powers) {
		this.powers = powers;
	}

	public int calculatePotential() {
		return age * 10;
	}

	public void showPowers() {
		System.out.println("Poderes del superhéroe " + name + ":");
		for (String poder : powers) {
			if (poder != null) {
				System.out.println("- " + poder);
			}
		}
	}

	public void setPoder(String power, int position) {
		if (position >= 0 && position < 4) {
			powers[position] = power;
		} else {
			System.out.println("Posición de poder no válida.");
		}
	}
}
