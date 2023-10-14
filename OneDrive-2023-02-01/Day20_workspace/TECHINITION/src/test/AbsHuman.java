package test;

public abstract class AbsHuman {
	protected String name;
	public AbsHuman(String name) {
		this.name = name;
	}
	public abstract void introduce();
	public abstract void report();
}
