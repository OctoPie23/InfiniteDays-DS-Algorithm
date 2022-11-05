package DataSructures.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder {
    // time complexity; O(n)
    // space complexity; O(2n)
    // or we can also use array and reverse it, to get the ans.
    public List<Integer> postorderTraversalUsing2Stacks(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if (root == null) return ans;
        st1.push(root);
        while (!st1.isEmpty()) {
            TreeNode node = st1.peek();
            st2.push(node);
            st1.pop();
            if (node.left != null) st1.push(node.left); 
            if (node.right != null) st1.push(node.right);
        }

        while(!st2.isEmpty()) {
            ans.add(st2.pop().val);
        }
        return ans;
    }
}
