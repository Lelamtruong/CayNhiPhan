/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.vidu;

/**
 *
 * @author Administrator
 */
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage, String description) {
        super(beverage, description);
    }

    @Override
    public int cost() {
        return 5+beverage.cost();
    }
    
}
