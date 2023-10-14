package character;

public class Playable {
	protected String name;
	protected int hp;
	public Playable(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void status() {
		System.out.printf("%s - (%d)\n", name, hp);
	}
	public void attack(Playable that) {
		that.hp -= 5;
		System.out.printf("%s이(/가) %s을(/를) 공격\n", this.name, that.name);
	}
}
