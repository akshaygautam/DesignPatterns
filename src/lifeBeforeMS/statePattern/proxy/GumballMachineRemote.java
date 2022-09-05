package lifeBeforeMS.statePattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

import lifeBeforeMS.statePattern.withStatePattern.states.State;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
