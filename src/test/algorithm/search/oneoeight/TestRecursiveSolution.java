package test.algorithm.search.oneoeight;

import com.cris.algorithm.search.oneoeight.RecursiveSolution;
import node.TreeNode;
import util.operation.tree.BST;

/**
 * Created by owen on 2017/4/12.
 */
public class TestRecursiveSolution {
    public static void main(String[] args) {
        int []nums = {1,4,6,7,8,9};
        RecursiveSolution recursiveSolution = new RecursiveSolution();
        TreeNode root = recursiveSolution.sortedArrayToBST(nums);
        BST.postOrder(root);
        BST.postOrderNonRecursive(root);
    }
}
