package model;

import main.Mutable;

//Class Hulk
public class Hulk extends Superhero implements Mutable {
	private boolean furia;

	public Hulk() {
		super("Hulk", 25);
		this.furia = false;
		this.powers[0] = "fuerte";
		this.powers[1] = "alto";
		this.powers[2] = "resistente";
		this.powers[3] = "irascible";
	}	

	public boolean isFuria() {
		return furia;
	}



	public void setFuria(boolean furia) {
		this.furia = furia;
	}



	@Override
	public int calculatePotential() {
		int potencial = super.calculatePotential();
		if (furia) {
			potencial *= 2;
		}
		return potencial;
	}

	@Override
	public void transform() {
		furia = true;
		System.out.println("¡Hulk ha entrado en furia!");
	}

	@Override
	public void restaure() {
		furia = false;
		System.out.println("¡Hulk ha vuelto a la normalidad!");
	}
}
