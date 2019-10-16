package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

class BranchManager extends PRHandler {
	public BranchManager(String name) {
		super(name);
		LIMIT = 1000;
	}

	public String toString() {
		return getName() + "-Branch Manager";
	}
}// End of class
