package proxyPattern.proxy;

import java.rmi.RemoteException;

import statePattern.proxy.GumballMachineRemote;

public class GumballMonitor {
	GumballMachineRemote gumballMachine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.gumballMachine = machine;
	}
	public void report() {
		try {
			System.out.println("Gumball Machine: "+gumballMachine.getLocation());
			System.out.println("Gumball Machine inventory: "+gumballMachine.getCount());
			System.out.println("Gumball Machine State: "+gumballMachine.getState());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
	}

}
