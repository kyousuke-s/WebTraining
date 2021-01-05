package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Num implements Serializable{

	private List<Integer> nums=new ArrayList<>();
	private int maxNum;
	private int minNum;
	private int sumNum;
	private String word;
	private int len;


	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public List<Integer> getNums() {
		return nums;
	}
	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getMinNum() {
		return minNum;
	}
	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}
