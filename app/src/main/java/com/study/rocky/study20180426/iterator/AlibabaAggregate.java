package com.study.rocky.study20180426.iterator;

import com.study.rocky.study20180426.bean.AlibabaBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//具体的容器
public class AlibabaAggregate extends AbsAggregate<AlibabaBean>{
    private ArrayList<AlibabaBean> userBeans = new ArrayList<AlibabaBean>();

    public AlibabaAggregate(){
        userBeans.add(new AlibabaBean("A", "男"));
        userBeans.add(new AlibabaBean("B", "男"));
        userBeans.add(new AlibabaBean("C", "男"));
        userBeans.add(new AlibabaBean("F", "男"));
        userBeans.add(new AlibabaBean("M", "女"));
    }
    @Override
    public Iterator<AlibabaBean> iterator() {
        return new AlibabaIterator(userBeans);
    }
}
