package com.study.rocky.study20180426.iterator;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//容器接口
public interface Aggregate<T> {
    //这里提供获得迭代器的方法
    Iterator<T> iterator();
}
