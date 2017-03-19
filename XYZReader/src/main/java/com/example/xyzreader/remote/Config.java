package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            // TODO: Temporary json. Must find a new one.
            // TODO: Must fix error when using old https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json
            url = new URL("https://raw.githubusercontent.com/Protino/dump/master/Lego/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
