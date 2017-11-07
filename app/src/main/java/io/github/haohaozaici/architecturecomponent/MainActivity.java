package io.github.haohaozaici.architecturecomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MyObserver myObserver = new MyObserver(this, getLifecycle());
    myObserver.enable();
    getLifecycle().addObserver(myObserver);

  }
}
