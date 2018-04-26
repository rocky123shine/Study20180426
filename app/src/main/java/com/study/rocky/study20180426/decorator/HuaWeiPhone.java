package com.study.rocky.study20180426.decorator;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//具体组件--继承抽象组件
public class HuaWeiPhone extends AbsPhone {
    @Override
    public void addShell() {
        Log.d("decorator", "手机加壳");
    }
}
