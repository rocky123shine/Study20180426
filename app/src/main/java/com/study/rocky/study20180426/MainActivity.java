package com.study.rocky.study20180426;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.study.rocky.study20180426.bean.AlibabaBean;
import com.study.rocky.study20180426.decorator.GoodsShell;
import com.study.rocky.study20180426.decorator.HuaWeiPhone;
import com.study.rocky.study20180426.decorator.PoorShell;
import com.study.rocky.study20180426.iterator.Aggregate;
import com.study.rocky.study20180426.iterator.AlibabaAggregate;
import com.study.rocky.study20180426.iterator.Iterator;
import com.study.rocky.study20180426.strategy.BanckLiCai;
import com.study.rocky.study20180426.strategy.ContextLiCai;
import com.study.rocky.study20180426.strategy.ILiCai;
import com.study.rocky.study20180426.strategy.ZFBLiCai;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试 decorator

        HuaWeiPhone phone = new HuaWeiPhone();
        GoodsShell shell = new GoodsShell(phone);
        shell.addShell();
        shell.wearproof();
        shell.waterproof();
        shell.dustproof();
        PoorShell poorShell = new PoorShell(phone);
        poorShell.addShell();
       poorShell.wearproof();

        //测试 策略模式  这里没用Context
        ILiCai licai = new ZFBLiCai();
        licai.liCai(90000, 12);
       //如果使用Context
        ILiCai banckLiCai = new BanckLiCai();
        ContextLiCai contextLiCai = new ContextLiCai(banckLiCai);
        contextLiCai.liCai(8000,12);

        //测试 迭代器
        Aggregate<AlibabaBean> aggregate = new AlibabaAggregate();
        iterator(aggregate);
    }

    //打印通用的方法，如果你要获取某一个属性，那么需要重新进行遍历
    public void iterator(Aggregate aggregate){
        Iterator itrerator = aggregate.iterator();
        while (itrerator.hasNext()){
            Log.d("iterator", itrerator.next().toString());
        }
    }
}
