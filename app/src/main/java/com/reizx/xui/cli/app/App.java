package com.reizx.xui.cli.app;


import androidx.multidex.MultiDexApplication;

public class App extends MultiDexApplication {
    public static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
