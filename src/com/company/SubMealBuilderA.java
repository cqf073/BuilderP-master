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
public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("Hambagar");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("kole" );
    }

}
