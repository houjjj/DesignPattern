package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:42
 */
public class Stopping extends LiftState {
    @Override
    public void open() {
        super.context.setLifeState(Context.openingState);
        super.context.open();
    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
