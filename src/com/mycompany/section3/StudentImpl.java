/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Sabrina
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student {

	public String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "student";
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Student#studiesFor()
	 */
	@Override
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}

}
