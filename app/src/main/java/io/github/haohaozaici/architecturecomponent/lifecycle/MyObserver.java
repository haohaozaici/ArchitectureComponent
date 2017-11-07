package io.github.haohaozaici.architecturecomponent.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;

/**
 * Created by haohao on 2017/11/7.
 */

public class MyObserver implements LifecycleObserver {

  private boolean enabled = false;
  private Lifecycle mLifcycle;

  public MyObserver(Context context, Lifecycle lifecycle) {
    this.mLifcycle = lifecycle;

  }

  @OnLifecycleEvent(Event.ON_START)
  private void onStart() {
    if (enabled) {
      //connect
    }

  }

  public void enable() {
    enabled = true;
    if (mLifcycle.getCurrentState().isAtLeast(State.STARTED)) {
      //connect if not connect
    }
  }

  @OnLifecycleEvent(Event.ON_STOP)
  private void onStop() {
    //disconnect if connect
  }
}
