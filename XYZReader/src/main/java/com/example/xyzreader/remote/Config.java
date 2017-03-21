package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            // TODO: Udacity link is down. Adding own json and own images
            // TODO: Old Udacity link:  https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json
            url = new URL("https://raw.githubusercontent.com/henriquenfaria/make-your-app-material/master/data/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
