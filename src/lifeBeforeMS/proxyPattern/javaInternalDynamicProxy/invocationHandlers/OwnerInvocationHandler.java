package lifeBeforeMS.proxyPattern.javaInternalDynamicProxy.invocationHandlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lifeBeforeMS.proxyPattern.javaInternalDynamicProxy.person.PersonBean;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean person;

	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			}else if(method.getName().contains("setHotOrNot")) {
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
			
		} catch (IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
