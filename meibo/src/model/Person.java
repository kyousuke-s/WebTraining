package model;
import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String kana;
	private String gender;
	private String bloodType;

	public Person() {}
	public Person(String name,String kana,String gender,String bloodType) {
		this.name=name;
		this.kana=kana;
		this.gender=gender;
		this.bloodType=bloodType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

}
