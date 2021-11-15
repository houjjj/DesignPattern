package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:42
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯开始运行。。");
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stopping);
        super.context.stop();
    }
}
