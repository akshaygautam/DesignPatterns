package proxyPattern;

import java.rmi.Naming;

import proxyPattern.proxy.GumballMonitor;
import statePattern.proxy.GumballMachineRemote;

public class ProxyTest {

	public static void main(String[] args) {
		String[] location = {};
		GumballMonitor[] monitors = new GumballMonitor[location.length];
		
		for(int i=0;i<location.length;i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitors[i] = new GumballMonitor(machine);
				System.out.println(monitors[i]);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<monitors.length;i++) {
			monitors[i].report();
		}
	}

}
