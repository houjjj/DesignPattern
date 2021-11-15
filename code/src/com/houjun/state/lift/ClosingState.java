package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:41
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLifeState(Context.openingState);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭。。。");
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stopping);
        super.context.stop();
    }
}
