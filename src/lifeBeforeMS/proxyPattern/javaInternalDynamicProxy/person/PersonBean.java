package lifeBeforeMS.proxyPattern.javaInternalDynamicProxy.person;

public interface PersonBean {
	public String getName();
	public String getGender();
	public String getInterests();
	public int getHotOrNotRating();
	
	public void setName(String name);
	public void setGender(String gender);
	public void setInterests(String interest);
	public void setHotOrNotRating(int rating);
}
