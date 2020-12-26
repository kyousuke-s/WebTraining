package model;
import java.io.Serializable;

public class Hero implements Serializable {
	private String name;
	private int[] status;
	private int[] maxArr= {100,100,50,50,50};
	String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
	String[] races={"人間","ハイエルフ","トロル","ノーム"};
	String[] classes={"戦士","盗賊","僧侶","魔術師"};
	int[][] raceMatrix={
		{10,10,10,10,10},
		{0,20,0,10,20},
		{30,0,20,0,0},
		{10,0,0,25,20},
	};
	double[][] classMatrix={
		{1.6,1,1.4,1,1},
		{1.1,1,1.2,1.3,1.3},
		{1.3,1.5,1.1,1,1},
		{1,1.9,1,1,1.1},
	};

	public int[] getMaxArr() {
		return maxArr;
	}
	public void setMaxArr(int[] maxArr) {
		this.maxArr = maxArr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getStatus() {
		return status;
	}
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}
	public String[] getRaces() {
		return races;
	}
	public void setRaces(String[] races) {
		this.races = races;
	}
	public String[] getClasses() {
		return classes;
	}
	public void setClasses(String[] classes) {
		this.classes = classes;
	}
	public int[][] getRaceMatrix() {
		return raceMatrix;
	}
	public void setRaceMatrix(int[][] raceMatrix) {
		this.raceMatrix = raceMatrix;
	}
	public double[][] getClassMatrix() {
		return classMatrix;
	}
	public void setClassMatrix(double[][] classMatrix) {
		this.classMatrix = classMatrix;
	}
	public void setStatus(int[] status) {
		this.status = status;
	}
}
