package com.ssro.tie.aclient;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

/**
 * Created by vingo on 2016-01-07.
 */
public class SocketManager {
    private static Socket mSocket = null;

    public static Socket getSocket() {
        if (null == mSocket) {
            try {
                mSocket = IO.socket(Constants.CHAT_SERVER_URL);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
        return mSocket;
    }
}
