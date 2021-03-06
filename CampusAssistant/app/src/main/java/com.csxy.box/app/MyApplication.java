package com.csxy.box.app;

import android.content.Context;
import com.csxy.box.utils.L;
import com.lib.mylibrary.utils.SpUtils;
import org.litepal.LitePalApplication;

public class MyApplication extends LitePalApplication {

    public final static String TAG = "__CSXY.";

    private static MyApplication instance;
    private static Context context;

    public static MyApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        L.life("Application", "onCreate");
        instance = this;
        context = this;
        SpUtils.init("sp", this);
    }
}
