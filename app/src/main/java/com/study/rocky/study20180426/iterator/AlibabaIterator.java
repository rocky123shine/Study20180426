package com.study.rocky.study20180426.iterator;

import com.study.rocky.study20180426.bean.AlibabaBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//具体的迭代器
public class AlibabaIterator extends AbsIterator<AlibabaBean> {
    public AlibabaIterator(ArrayList<AlibabaBean> arrayList) {
        super(arrayList);
    }
}
