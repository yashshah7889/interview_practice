package tree;



public class LongestCommonSequence {
	public int longestCommonSequence(TreeNode root){
		int[] max=new int[1];
		findlongestCommonSequence(root,0,0,max);
		//findlongestCommonSequence(node,count,target,max); target can be arbitary.
		
		return max[0];
		
	}

	private void findlongestCommonSequence(TreeNode root, int count, int target, int[] max) {
		if(root==null) {
			return;
		}else if(root.val==target) {
			count++;
		}else {count=1;}
		
		max[0]=Math.max(max[0], count);
		findlongestCommonSequence(root.left,count,root.val+1,max);
		findlongestCommonSequence(root.right,count,root.val+1,max);
	}
	
}
