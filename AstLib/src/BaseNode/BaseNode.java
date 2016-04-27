package BaseNode;

public abstract class BaseNode {
	public int nodeId;
	public BaseNode parentNode;
	public String nodeType;
	public String nodeContent ;

	public BaseNode getParent() {
		return this.parentNode;
	}

	public int getNodeId() {
		return this.nodeId;
	}
	public String getNodeType(){
		return this.nodeType;
	}
	public String getNodeContent(){
		return this.nodeContent;
	}
}
