package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

public class testClient {
	public static void main(String[] args) {
		HandleRequestController h = HandleRequestController.getInstance();
		h.setHanlerChain("Li Wenjian", "Zhang Jinrong", "Wang Yue",
				"Liu Quanli");
		System.out.println(h.toString());
		PurchaseRequest r = new PurchaseRequest(100, "购买笔记本", 800);
		h.StartHandle(r);
		r = new PurchaseRequest(200, "购买办公用品", 1800);
		h.StartHandle(r);
		r = new PurchaseRequest(300, "参加会议和布置会展", 3500);
		h.StartHandle(r);
		r = new PurchaseRequest(400, "购买投影仪", 5000);
		h.StartHandle(r);
	}
}
