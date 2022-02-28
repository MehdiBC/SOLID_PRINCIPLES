package com.directi.training.dip.solution_exercice;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyNetworkReader implements IReader {
    private final String _protocol;
    private final String _host;
    private final String _file;

    public MyNetworkReader(String protocol, String host, String file) {
        this._protocol = protocol;
        this._host = host;
        this._file = file;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(_protocol, _host, _file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }
}
