package com.houjun.state.sellmachine;

/**
 * @author HouJun
 * @date 2021-11-14 11:12
 */
public interface State {
    
    Machine mahine = null;
    
    void insert();

    void returnm();

    void turn();

    void dispense();
}
