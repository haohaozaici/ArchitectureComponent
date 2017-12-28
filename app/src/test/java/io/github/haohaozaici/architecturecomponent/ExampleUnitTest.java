package io.github.haohaozaici.architecturecomponent;

import android.util.Log;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

  private static final String TAG = "ExampleUnitTest";

  @Test
  public void addition_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }

  @Test
  public void mapTest() {

    Map<Integer, Integer> map = new HashMap<>();
    map.put(100, 100);
    map.put(100, 100);
    map.put(100, 100);
    map.put(100, 100);

    map.keySet().iterator().forEachRemaining(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {

      }
    });
    MyObj obj = new MyObj("666", map);

    String mapJson = new Gson().toJson(obj);

    MyObj obj1 = new Gson().fromJson(mapJson, MyObj.class);
    Log.d(TAG, "mapTest: obj1");

  }

  public class MyObj {

    private String name;
    private Map<Integer, Integer> map;

    public MyObj(String name, Map<Integer, Integer> map) {
      this.name = name;
      this.map = map;
    }


  }
}