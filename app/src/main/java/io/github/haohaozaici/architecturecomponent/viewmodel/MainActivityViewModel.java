package io.github.haohaozaici.architecturecomponent.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

/**
 * Created by haohao on 2017/11/7.
 */

public class MainActivityViewModel extends AndroidViewModel {

  private MutableLiveData<String> mLiveData1;
  private MutableLiveData<String> mLiveData2;
  private MediatorLiveData<String> mMediatorLiveData;

  public MainActivityViewModel(
      @NonNull Application application) {
    super(application);
  }


  public MutableLiveData<String> getLiveData() {
    if (mLiveData1 == null) {
      mLiveData1 = new MutableLiveData<>();
      loadData();
    }
    return mLiveData1;
  }

  private void loadData() {
    //fetch data

  }

}
