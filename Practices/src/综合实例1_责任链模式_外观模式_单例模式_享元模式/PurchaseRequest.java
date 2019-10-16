package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

class PurchaseRequest {
	private int ID;
	private String description;
	private double amount;

	public PurchaseRequest(int id, String description, double amount) {
		ID = id;
		this.description = description;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		return "订单信息：ID=" + ID + ", 金额=" + getAmount() + "元,备注=" + description;
	}
}
