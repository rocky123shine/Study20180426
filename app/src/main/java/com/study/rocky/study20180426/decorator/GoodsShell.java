package com.study.rocky.study20180426.decorator;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//具体的装饰者1
public class GoodsShell extends AbsShell {

    public GoodsShell(AbsPhone phone) {
        super(phone);
    }
    public void wearproof(){
        Log.i("decorator", "耐磨功能");
    }

    public void waterproof(){
        Log.i("decorator", "防水功能");
    }

    public void dustproof(){
        Log.i("decorator", "防尘功能");
    }
}
