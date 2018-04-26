package com.study.rocky.study20180426.iterator;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//迭代器接口 这里使用泛型提供数据
public interface Iterator<T> {
    //提供通用的方法

    //是否有下一个元素
    boolean hasNext();

    //下一个元素
    T next();

    //删除元素
    void remove();

}
