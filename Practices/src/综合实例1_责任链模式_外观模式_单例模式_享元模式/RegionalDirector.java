package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

class RegionalDirector extends PRHandler {
	public RegionalDirector(String name) {
		super(name);
		LIMIT = 2000;
	}

	public String toString() {
		return getName() + "-RegionalDirector";
	}
}// End of class
