package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

class VicePresident extends PRHandler {
	public VicePresident(String name) {
		super(name);
		LIMIT = 3000;
	}

	public String toString() {
		return getName() + "-VicePresident";
	}
}// End of class
