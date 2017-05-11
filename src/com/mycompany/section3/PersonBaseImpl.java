/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Sabrina
 *
 */
public abstract class PersonBaseImpl implements Person {
	protected String name;
	
	PersonBaseImpl(String _name)
	{
		name = _name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	
}
