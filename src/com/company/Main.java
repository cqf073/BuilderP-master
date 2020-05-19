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
public class Main {

    public static void main(String[] args) {
        // 套餐A
        SubMealBuilderA a = new SubMealBuilderA();

        //套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);

        //获得套餐
        Meal mealA = waiter.construct();
        System.out.print("A套餐有：");
        System.out.println("食物："+mealA.getFood()+"；   "+"饮品："+mealA.getDrinks());

        SubMealBuilderB B = new SubMealBuilderB();
        KFCWaiter waiter1 = new KFCWaiter(B);
        Meal mealB = waiter1.construct();
        System.out.print("B套餐有：");
        System.out.println("食物："+mealB.getFood()+"；   "+"饮品："+mealB.getDrinks());

    }
}
