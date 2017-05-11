/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Sabrina
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher{
	
	public String thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}
	@Override
	public String teachesFor()
	{
		return thoughtCourseTitle;
	}

	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "teacher";
	}

}
