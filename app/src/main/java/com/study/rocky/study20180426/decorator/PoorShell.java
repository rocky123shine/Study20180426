package com.study.rocky.study20180426.decorator;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

public class PoorShell extends AbsShell {
    public PoorShell(AbsPhone phone) {
        super(phone);
    }
    public void wearproof(){
        Log.i("decorator", "888888耐磨功能");
    }
}
