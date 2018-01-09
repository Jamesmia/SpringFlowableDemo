package com.example.common;

import org.flowable.engine.common.api.delegate.event.FlowableEvent;
import org.flowable.engine.common.api.delegate.event.FlowableEventListener;

public class MyEventListener implements FlowableEventListener {

    @Override
    public void onEvent(FlowableEvent event) {
        System.out.println(event.getType() + " : " + event.toString());
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}
