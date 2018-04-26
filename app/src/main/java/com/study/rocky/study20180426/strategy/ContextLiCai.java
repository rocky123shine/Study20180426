package com.study.rocky.study20180426.strategy;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//定义上下文
public class ContextLiCai {
    //持有抽象策略对象
    private ILiCai liCai;

    public ContextLiCai(ILiCai licai){
        this.liCai = licai;
    }

    //执行策略方法
    public void liCai(float money, int month){
        Log.d("ContextLiCai", "this.liCai.liCai(money, month):" + this.liCai.liCai(money, month));
    }

    //可以定义些公共功能属性等


}
