package com.training.model;

public class Student implements Comparable<Student>{
	

	private int rollNomber;
	
	private String firstName;
	
	private double markScored;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNomber, String firstName, double markScored) {
		super();
		this.rollNomber = rollNomber;
		this.firstName = firstName;
		this.markScored = markScored;
	}

	public int getRollNomber() {
		return rollNomber;
	}

	public void setRollNomber(int rollNomber) {
		this.rollNomber = rollNomber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	@Override
	public String toString() {
		return "Student [rollNomber=" + rollNomber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(markScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNomber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (Double.doubleToLongBits(markScored) != Double.doubleToLongBits(other.markScored))
			return false;
		if (rollNomber != other.rollNomber)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student otherObj) {
		
		// TODO Auto-generated method stub
		
		return this.firstName.compareTo(otherObj.firstName);
		
	}
	
	
	
}
