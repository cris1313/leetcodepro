package com.cris.algorithm.search.oneoeight;

/**
 * Created by owen on 2017/4/12.
 */
public class RecursiveSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = sortedArrayToBST(nums,0,nums.length);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums,int lo,int hi) {
        if(lo > hi) return null;
        int mid = lo + (lo + hi)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums,lo,mid-1);
        node.right = sortedArrayToBST(nums,mid+1,hi);
        return node;
    }
}
