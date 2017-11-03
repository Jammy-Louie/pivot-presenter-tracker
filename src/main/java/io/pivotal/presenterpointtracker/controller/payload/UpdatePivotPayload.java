package io.pivotal.presenterpointtracker.controller.payload;

public class UpdatePivotPayload {

    private long pivotId;
    private long activityId;

    public long getPivotId() {
        return pivotId;
    }

    public void setPivotId(long pivotId) {
        this.pivotId = pivotId;
    }

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }
}
