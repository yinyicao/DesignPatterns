package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

class President extends PRHandler {
	public President(String name) {
		super(name);
		LIMIT = 4000;
	}

	public String toString() {
		return getName() + "-President";
	}
}
