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
public abstract class MealBuilder {
    Meal meal = new Meal();

    public abstract void BuildFood();

    public abstract void BuildDrinks();

    public Meal getMeal(){
        return meal;
    }
}
