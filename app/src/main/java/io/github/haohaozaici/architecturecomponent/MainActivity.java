package io.github.haohaozaici.architecturecomponent;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import io.github.haohaozaici.architecturecomponent.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MainActivityViewModel viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

    viewModel.getLiveData().observe(this, new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        // TODO: 2017/11/7 onChanged
      }
    });

    viewModel.getLiveData().setValue("11");
    viewModel.getLiveData().postValue("11");

    MyObserver myObserver = new MyObserver(this, getLifecycle());
    myObserver.enable();

//    getLifecycle().addObserver(myObserver);

  }
}
