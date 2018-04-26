package com.study.rocky.study20180426.iterator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/26 0026.
 */
//封装通用方法
public  class AbsIterator<T> implements Iterator<T> {
    private ArrayList<T> arrayList;//通用的数据列表
    private int index=0;//内部数据遍历的索引
    public AbsIterator(ArrayList<T> arrayList){
        //传入要遍历的数据列表
        this.arrayList = arrayList;
    }
    @Override
    public boolean hasNext() {
        if (arrayList == null) {
            return false;
        }
        return index<arrayList.size();
    }

    @Override
    public T next() {
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(index++);
    }

    @Override
    public void remove() {
        //这里没处理
    }
}
