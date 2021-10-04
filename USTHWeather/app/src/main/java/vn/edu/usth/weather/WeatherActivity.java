package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Forecast", "Create is called")
        ForecastFragment ff = ForecastFragment.newInstance("", "");
        getSupportFragment().beginTransaction().add(R.id.container, ff).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Forecast", "Starting is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Forecast", "Stop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Forecast", "Destroy is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Forecast", "Pause is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Forecast", "Resume is called");
    }

}
