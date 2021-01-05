package model;

import java.util.ArrayList;
import java.util.List;

public class NumLogic {
	public void numSet(Num num) {
		List<Integer> nums=new ArrayList<>();
		String[] set=num.getWord().split(",",0);
		for(String n:set) {
			nums.add(Integer.parseInt(n));
		}
		num.setNums(nums);

		int max=0;
		int min=0;
		int sum=0;

		for(int i=0;i<nums.size();i++) {
			max=Math.max(max, nums.get(i));
			min=Math.min(min, nums.get(i));
			sum+=nums.get(i);
		}
		num.setMaxNum(max);
		num.setMinNum(min);
		num.setSumNum(sum);
	}
}
