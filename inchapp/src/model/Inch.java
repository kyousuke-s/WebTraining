package model;
import java.io.Serializable;
public class Inch implements Serializable{
	private final double CM = 2.54;
	private double inch;
	private double cm;

	public Inch() {}
	public Inch(int inch,double cm) {
		this.inch=inch;
		this.cm=cm;
	}
	public double getInch() {
		return inch;
	}
	public void setInch(double inch) {
		this.inch = inch;
	}
	public double getCm() {
		return cm;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public double getCM() {
		return CM;
	}


}
