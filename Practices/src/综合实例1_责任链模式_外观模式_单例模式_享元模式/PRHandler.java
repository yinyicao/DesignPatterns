package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

abstract class PRHandler {
	private PRHandler nextHandler = null;
	private String handlerName;
	protected double LIMIT;

	public PRHandler(String name) {
		handlerName = name;
	}

	public String getName() {
		return handlerName;
	}

	public abstract String toString();

	public PRHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(PRHandler handler) {
		nextHandler = handler;
	}

	public boolean HandleRequest(PurchaseRequest request) {
		if (request.getAmount() <= LIMIT) {
			System.out.println(request.toString());
			System.out.println(" handled by:" + toString());
			return true;
		}
		if (getNextHandler() != null)
			getNextHandler().HandleRequest(request);
		else {
			System.out.println(request.toString());
			System.out.println("    not  handled");
		}
		return false;
	}

}
