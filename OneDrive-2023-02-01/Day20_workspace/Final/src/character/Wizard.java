package character;

public class Wizard extends Playable{
	private int mp;
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	public void attack(Playable that) {
		that.hp -= 20;
		this.mp -= 10;
		super.attack(that);
	}
	public void status() {
		System.out.printf("%s - (%d, %d)\n", name, hp, mp);
	}
	public void meditation() {
		mp += 30;
		System.out.println("∏ÌªÛ¡ﬂ...");
	}
}