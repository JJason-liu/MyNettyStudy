package com.jason.RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Author:有泪的北极星
 * Date:2018/7/6
 * Time:17:39
 */
public class ClientTest {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",8900);
            IMyserver server = (IMyserver) registry.lookup("server");
            server.test(9527);
            System.out.println("发送消息！！！");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
