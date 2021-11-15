package com.houjun.state.lift;

/**
 * @author HouJun
 * @date 2021-11-14 10:27
 */
public class Context {
    public final static OpeningState openingState = new OpeningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static Stopping stopping = new Stopping();
    private LiftState liftState;

    public LiftState getLifeState() {
        return liftState;
    }

    public void setLifeState(LiftState liftState) {
        this.liftState = liftState;
        // 把当前的环境同支到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
