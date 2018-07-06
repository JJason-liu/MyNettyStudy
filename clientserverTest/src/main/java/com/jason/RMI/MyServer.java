package com.jason.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Author:有泪的北极星
 * Date:2018/7/6
 * Time:17:29
 */
public class MyServer extends UnicastRemoteObject implements IMyserver {
    private static final long serialVersionUID = 1L;
    //必须要构造函数，做反射用
    public MyServer() throws RemoteException {
    }
    public void test(int msg) {
        System.out.println("收到信息:"+msg);
    }
}
