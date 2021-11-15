package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:27
 */
public abstract class LiftState {
    // 定义一个环境角色，封装状态变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 首先是电梯门开启动作
    public abstract void open();

    // 电梯门关闭
    public abstract void close();

    // 电梯运行
    public abstract void run();

    // 电梯停止
    public abstract void  stop();
}
