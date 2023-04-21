package com.example.mvcbasemodel;

import android.app.Application;
import android.content.Context;

import com.example.mvcbasemodel.model.Model;

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        //初始化模型层
        Model.getModel().init(mContext);
    }

    /**
     * 获取全局上下文
     * @return 返回全局上下文
     */
    public static Context getGlobalApplication() {
        return mContext;
    }
}
