package proxyPattern.javaInternalDynamicProxy.invocationHandlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import proxyPattern.javaInternalDynamicProxy.person.PersonBean;

public class NonOwnerInvocationHandler implements InvocationHandler {
	private PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
			try {
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			}else if(method.getName().contains("setHotOrNot")) {
				return method.invoke(person, args);
			}else if(method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
			} catch (IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		
		return null;
	}

}
