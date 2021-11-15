package com.houjun.state.sellmachine;

/**
 * @author HouJun
 * @date 2021-11-14 11:12
 */
public class Machine {
    public final static NoMoneyState noMoneyState = new NoMoneyState();
    public final static HasMoneyState hasMoneyState = new HasMoneyState();
    public final static SellState sellState = new SellState();
    public final static SoldState soldState = new SoldState();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void insert() {
        this.setState(hasMoneyState);
        this.state.insert();
    }

    public void returnm() {

    }

    public void turn() {

    }

    public void dispense() {

    }
}
