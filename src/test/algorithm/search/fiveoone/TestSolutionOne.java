package test.algorithm.search.fiveoone;

import com.cris.algorithm.search.fiveoone.SolutionOne;
import node.TreeNode;
import util.operation.tree.BST;

/**
 * Created by owen on 2017/4/13.
 */
public class TestSolutionOne {
    public static void main(String[] args) {
        int nums[] = {2,3,3,3,3,3,4,4,4,4,4,5,5};
        TreeNode x = BST.buildBST(nums);
        SolutionOne solution = new SolutionOne();
        int result[] = solution.findMode(x);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
