package 综合实例1_责任链模式_外观模式_单例模式_享元模式;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HandleRequestController {

	private static HandleRequestController _instance = new HandleRequestController();

	private HandleRequestController() {
	}

	public static HandleRequestController getInstance() {
		return _instance;

	}

	private PRHandler _BranchManager, _RegionalDirector, _VicePresident, _President;// 当前处理链

	// 部门经理
	public void set_BranchManager(String branchManagerName) {
		if (handlers.containsKey(branchManagerName)) {
			_BranchManager = handlers.get(branchManagerName);
		} else {
			_BranchManager = new BranchManager(branchManagerName);
			handlers.put(_BranchManager.getName(), _BranchManager);
		}
	}

	public PRHandler getBranchManager() {
		return _BranchManager;
	}

	// 区域经理
	public void set_RegionalDirector(String regionalManagerName) {
		if (handlers.containsKey(regionalManagerName)) {
			_RegionalDirector = handlers.get(regionalManagerName);
		} else {
			_RegionalDirector = new RegionalDirector(regionalManagerName);
			handlers.put(_RegionalDirector.getName(), _RegionalDirector);
		}
	}

	public PRHandler getRegionalDirector() {
		return _RegionalDirector;
	}

	// 副主席
	public void set_VicePresident(String vicePresidentName) {
		if (handlers.containsKey(vicePresidentName)) {
			_VicePresident = handlers.get(vicePresidentName);
		} else {
			_VicePresident = new VicePresident(vicePresidentName);
			handlers.put(_VicePresident.getName(), _VicePresident);
		}
	}

	public PRHandler getVicePresident() {
		return _VicePresident;
	}

	// 主席
	public void set_President(String presidentName) {
		if (handlers.containsKey(presidentName)) {
			_President = handlers.get(presidentName);
		} else {
			_President = new President(presidentName);
			handlers.put(_President.getName(), _President);
		}
	}

	public PRHandler getPresident() {
		return _President;
	}

	private Hashtable<String, PRHandler> handlers = new Hashtable<String, PRHandler>();// 对象池

	public Hashtable<String, PRHandler> getHandlers() {
		return handlers;
	}

	public String toString() {
		return handlers.values().toString().replaceAll(",", "\n");
	}

	public Iterator<Entry<String, PRHandler>> iterator() {
		return handlers.entrySet().iterator();
	}

	// 设置责任链
	public void setHanlerChain(String branchManagerName,
			String regionalDirectorName, String vicePresidentName,
			String presidentName) {
		set_BranchManager(branchManagerName);
		set_RegionalDirector(regionalDirectorName);
		set_VicePresident(vicePresidentName);
		set_President(presidentName);
		_BranchManager.setNextHandler(_RegionalDirector);
		_RegionalDirector.setNextHandler(_VicePresident);
		_VicePresident.setNextHandler(_President);
	}

	// 责任处理
	public void StartHandle(PurchaseRequest request) {
		_BranchManager.HandleRequest(request);
	}

}
