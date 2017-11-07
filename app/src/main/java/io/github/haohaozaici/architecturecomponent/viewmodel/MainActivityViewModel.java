package io.github.haohaozaici.architecturecomponent.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by haohao on 2017/11/7.
 */

public class MainActivityViewModel extends ViewModel {

  private MutableLiveData<String> mLiveData;

  public MutableLiveData<String> getLiveData() {
    if (mLiveData == null) {
      mLiveData = new MutableLiveData<String>();
    }

    return mLiveData;
  }

}
