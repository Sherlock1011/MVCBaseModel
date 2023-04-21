package com.example.mvcbasemodel.model;

import android.content.Context;

public class Model {
    private Context context;

    private static Model model;

    private Model(){}

    /**
     * 初始化Controller层数据
     * @param context
     */
    public synchronized void init(Context context) {
        this.context = context;
    }

    /**
     * 返回Controller单例
     * @return
     */
    public static synchronized Model getModel() {
        if(model == null){
            model = new Model();
        }
        return model;
    }
}
