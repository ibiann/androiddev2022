package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import android.os.Bundle;
import android.util.Log;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class WeatherActivity extends AppCompatActivity {
    public static final String tag = "WeatherActivity";
    private ViewPagerFragmentAdapter viewPagerFragmentAdapter;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "Program is created");

        viewPager2 = findViewById(R.id.view_pager);
        viewPagerFragmentAdapter = new ViewPagerFragmentAdapter(this);
        viewPager2.setAdapter(viewPagerFragmentAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText(getString(R.string.Tab0));
                    break;
                case 1:
                    tab.setText(getString(R.string.Tab1));
                    break;
                case 2:
                    tab.setText(getString(R.string.Tab2));
                    break;
            }
        }).attach();
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