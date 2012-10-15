import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Navigator {
	private Node position;
	
	public Navigator(Node root){
		position = root;
	}
	
	public void up(){
		if(position.getParentNode() != null)
			position = position.getParentNode();
	}
	
	public void child(int n){
		NodeList children = position.getChildNodes();
		if(n < children.getLength() || n >= 0){
			position = children.item(n);
			
		}
	}
	
	public String show(){
		//TODO: add names and types of children
		String result = "Type: " + position.getNodeType() + "\nName: "+ position.getNodeName() + "\nContent: " +position.getTextContent(); 
		return result;
	}
	
	public String attributes(){
		
		return "attributes not implemented";
	}
	
}
