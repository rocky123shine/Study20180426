package com.study.rocky.study20180426.strategy;

/**
 * Created by Administrator on 2018/4/26 0026.
 */

//具体的理财策略
public class BanckLiCai implements ILiCai{
    @Override
    public float liCai(float money, int month) {
        if (month == 6){
            money = money + money * 0.03f / 12 * 6;
        } else if (month == 12) {
            money = money + money * 0.04f / 12 * 12;
        } else if (month == 24) {
            money = money + money * 0.045f / 12 * 24;
        } else {
            throw new SecurityException("没有月份");
        }
        return money;
    }
}
