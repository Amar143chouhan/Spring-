package com.springg.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *in prototype scope bean gives new obj every time 
 *in singleton scope bean gives same obj every time
 * @author Amar chouhan
 *Indicates that an annotated class is a "component".
 *Such classes are considered as candidates for auto-detection
 *when using annotation-based configuration and classpath scanning. 
 */
@Component
@Scope("prototype")
public class Student {
	
	
	/**
	 * {@value} is used to declear single attribute value
	 */
	@Value("amar chouhan")
	private String Stname;
   
	@Value("indore")
	private String StCity;
    
	
    /**
     * (#{@value}) is used to declear values which are collection type
     */
    @Value("#{temp}")
    private List<String> Address;
 
	public List<String> getAddress() {
		return Address;
	}

	public void setAddress(List<String> address) {
		Address = address;
	}

	
	@Override
	public String toString() {
		return "Student [Stname=" + Stname + ", StCity=" + StCity + "]";
	}

	public String getStname() {
		return Stname;
	}

	public void setStname(String stname) {
		Stname = stname;
	}

	public String getStCity() {
		return StCity;
	}

	public void setStCity(String stCity) {
		StCity = stCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
