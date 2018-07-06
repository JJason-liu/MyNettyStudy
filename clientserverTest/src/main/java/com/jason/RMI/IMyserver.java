package com.jason.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Author:有泪的北极星
 * Date:2018/7/6
 * Time:17:28
 */
public interface IMyserver extends Remote{
    public void test(int msg) throws RemoteException;
}
