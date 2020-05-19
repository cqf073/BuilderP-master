package com.company;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/1915:04
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class KFCWaiter {
    private MealBuilder mb;

    public KFCWaiter(MealBuilder mb){
        this.mb = mb;
    }
    public Meal construct(){
        //准备食物
        mb.BuildFood();
        //准备饮料
        mb.BuildDrinks();
        //准备完毕，返回一个完整的套餐给客户
        return mb.getMeal();
    }

}
