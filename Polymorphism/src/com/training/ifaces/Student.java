package com.training.ifaces;

public class Student implements Conditional {
	
	private int markScored;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		
		String strBranch = (String)value;
		
		boolean result = false;
		
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ECE")) {
			
			result = true;
		}
		
		return result;
		
	}

}
