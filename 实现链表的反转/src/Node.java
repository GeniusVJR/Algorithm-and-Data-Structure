
/**
 * 定义一个单链表
 * @author dream
 *
 */
public class Node {

	//变量
	private int record;
	//指向下一个对象
	private Node nextNode;
	
	public Node(int record) {
		super();
		this.record = record;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
