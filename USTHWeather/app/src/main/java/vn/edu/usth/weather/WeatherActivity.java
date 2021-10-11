package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    public static final String tag = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


    }

    //ForecastFragment forecastFragment = new ForecastFragment();
    //getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "On Starting");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag,"On Resuming");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag,"On Stopping");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag,"On Pausing");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag,"On Destroying");
    }

}