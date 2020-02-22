package proxyPattern.javaInternalDynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import proxyPattern.javaInternalDynamicProxy.invocationHandlers.NonOwnerInvocationHandler;
import proxyPattern.javaInternalDynamicProxy.invocationHandlers.OwnerInvocationHandler;
import proxyPattern.javaInternalDynamicProxy.person.PersonBean;
import proxyPattern.javaInternalDynamicProxy.person.PersonBeanImpl;

public class DynamicProxyTest {
	private Map<String, PersonBean> database = new HashMap<String, PersonBean>();

	public DynamicProxyTest() {
		initializeDatabase();
	}

	public static void main(String[] args) {
		DynamicProxyTest test = new DynamicProxyTest();
		test.drive();
	}

	private void drive() {
		PersonBean joe = getPersonFromDataBase("Joe");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is: "+ownerProxy.getName());
		ownerProxy.setInterests("Bowling, cricket");
		System.out.println("Interest set from owner proxy");
		
		try {
			ownerProxy.setHotOrNotRating(100);
		}catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		
		System.out.println("Rating is: " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is: " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("NONE");
		}catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		
		System.out.println("Intersts are: "+nonOwnerProxy.getInterests());
		
		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is: "+ nonOwnerProxy.getHotOrNotRating());
	}

	private PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}

	private PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}

	private PersonBean getPersonFromDataBase(String name) {
		return database.get(name);
	}
	
	private void initializeDatabase() {
		database.put("Joe", new PersonBeanImpl("Joe west", "M"));
	}

}
