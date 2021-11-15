package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 11:03
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLifeState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
