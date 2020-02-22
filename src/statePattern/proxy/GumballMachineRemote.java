package statePattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

import statePattern.withStatePattern.states.State;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
