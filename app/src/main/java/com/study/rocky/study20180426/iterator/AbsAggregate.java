package com.study.rocky.study20180426.iterator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//抽象的容器
public  abstract class AbsAggregate<T> implements Aggregate<T>{
    private ArrayList<T> arrayList = new ArrayList<>();
    //容器可以添加元素
    public void addElement(T element){
        this.arrayList.add(element);
    }
    @Override
    public Iterator<T> iterator() {
        return new AbsIterator<>(arrayList);
    }
}
