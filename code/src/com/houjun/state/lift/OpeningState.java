package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:30
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setLifeState(Context.closingState);
        // 动作委托给CloseState
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
