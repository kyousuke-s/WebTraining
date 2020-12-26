package model;
import java.util.Random;

public class HeroStatus {

	static int calcSeed(String name){
		int seed=0;
		for(int i=0;i<name.length();i++){
			seed+=name.charAt(i);
		}
		return seed;
	}

	static int[] makeStatus(int seed,int[] maxArr){
		int[] vals=new int[maxArr.length];
		Random rand=new Random(seed);
		for(int i=0;i<vals.length;i++){
			vals[i]=rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}

	public void firstStatus(Hero hero) {
		int seed = calcSeed(hero.getName());
		int[] vals = makeStatus(seed,hero.getMaxArr());
		hero.setStatus(vals);
	}
}
