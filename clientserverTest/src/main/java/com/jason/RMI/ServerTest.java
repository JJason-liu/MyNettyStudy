package com.jason.RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Author:有泪的北极星
 * Date:2018/7/6
 * Time:17:33
 */
public class ServerTest {
    private static Registry registry = null;

    public static Registry getInstance() throws RemoteException {
            return registry == null?(registry = LocateRegistry.createRegistry(8900)):registry;
    }

    public ServerTest() {
    }

    public static void main(String[] args) {
        try {
            MyServer server = new MyServer();
            ServerTest.getInstance().bind("server",server);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
        System.out.println("监听开始！！！");
    }
}
