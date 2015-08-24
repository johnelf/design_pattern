package model.ps;

import model.infrastructure.*;

public class PS4 extends GamingBox {
    private SonyBox box;
    private Handle handle;
    private Kinect kinect;
    private Wrapper wrapper;
    private PowerLine powerLine;

    public PS4(SonyBox box, Handle handle, Kinect kinect, Wrapper wrapper, PowerLine powerLine) {
        this.box = box;
        this.handle = handle;
        this.kinect = kinect;
        this.wrapper = wrapper;
        this.powerLine = powerLine;
    }

    @Override
    public void start() {
        System.out.println("Booting " + box.getName());
    }

    public SonyBox getBox() {
        return box;
    }

    public void setBox(SonyBox box) {
        this.box = box;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public Kinect getKinect() {
        return kinect;
    }

    public void setKinect(Kinect kinect) {
        this.kinect = kinect;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public PowerLine getPowerLine() {
        return powerLine;
    }

    public void setPowerLine(PowerLine powerLine) {
        this.powerLine = powerLine;
    }
}
