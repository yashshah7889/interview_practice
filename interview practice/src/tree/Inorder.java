package tree;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
	ArrayList<Integer> lst =new ArrayList();
public List<Integer> inorderTraversal(TreeNode root) {
	
	
	lst=(ArrayList<Integer>) inOrder(root);
	return lst;
        
    }

private List<Integer> inOrder(TreeNode root) {
	
	if(root==null) {
		return lst;
	}
	if(root.left==null ) {
		lst.add(root.val);
		return lst;
	}
	if(root.right==null ) {
		return lst;
	}
	inOrder(root.left);
	inOrder(root.right);
	
	return lst;
	
	
	
}
}
