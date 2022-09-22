package co.springcore.Expl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.lang.*;
@Component("demo")
public class DemoExpl {
	
	public DemoExpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Value("#{44+32}")
	private int x;
	
    @Value("#{55+93}")
	private int y;
    
	/*
	 * public double getE() { return e; } public void setE(double e) { this.e = e; }
	 * public double getPi() { return pi; } public void setPi(double pi) { this.pi =
	 * pi; }
	 */
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    
	/*
	 * @Value("#{T(java.lang.Math).E}") private double e;
	 * 
	 * @Value("#{{T(java.lang.Math).PI}") private double pi;
	 */	
    @Value("#{8-2>3}")
     public boolean isActive;
     
      
    public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public DemoExpl(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	@Override
	public String toString() {
		return "DemoExpl [x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + "]";
	}
	public void setZ(double z) {
		this.z = z;
	}
	

}
