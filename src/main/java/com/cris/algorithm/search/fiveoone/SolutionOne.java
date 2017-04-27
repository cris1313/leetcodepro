package com.cris.algorithm.search.fiveoone;

import node.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by owen on 2017/4/13.
 */
public class SolutionOne {

    int max=0;
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        List<Integer> list = new LinkedList<>();
        for(int key:map.keySet()){
            if(max == map.get(key)) list.add(key);
        }
        int nums[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
    private void inOrder(TreeNode x){
        if(x.left != null) inOrder(x.left);
        map.put(x.val,map.getOrDefault(x.val,0)+1);
        max = Math.max(max,map.get(x.val));
        if(x.right != null) inOrder(x.right);
    }

}
