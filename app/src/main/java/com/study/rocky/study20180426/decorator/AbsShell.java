package com.study.rocky.study20180426.decorator;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//抽象装饰者 要求 继承抽象组件，持有组件的对象
public abstract class AbsShell extends AbsPhone {
    private AbsPhone phone;

    public AbsShell(AbsPhone phone) {
        this.phone = phone;
    }

    @Override
    public void addShell() {
        //执行组件的动作
        phone.addShell();
    }
}
