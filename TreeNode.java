import java.util.*;

public class TreeNode<T> {
    public T data;
    public TreeNode<T> parent;
    public List<TreeNode<T>> child;
    public List<TreeNode<T>> index;
    
    public boolean isRoot() {
		return parent == null;
	}
    /**
     * Checks if node is a leaf
     * @return if node is a leaf
     */
	public boolean isLeaf() {
		return child.size() == 0;
    }
    
    public TreeNode(T data) {
        this.data = data;
        this.parent = null;
        this.child = new LinkedList<TreeNode<T>>();
        this.index = new LinkedList<TreeNode<T>>();
        this.index.add(this);
    }
    /**
     * Get the data in this node.
     *
     * @return data in this node
     */
    public T getData() {
        return data;
    }

    /**
     * Set the data in this node.
     *
     * @param data data to store in this node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Get the child node.
     *
     * @return child node.
     */
    public List<TreeNode<T>> getChild() {
        return child;
    }

    /**
     * Set the child node
     *
     * @param child new child node.
     */
    public TreeNode<T> setChild(T data) {
        TreeNode<T> childNode = new TreeNode<T>(data);
		childNode.parent = this;
		this.child.add(childNode);
		return childNode;
    }


}