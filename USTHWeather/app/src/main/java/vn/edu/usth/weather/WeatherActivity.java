package vn.edu.usth.weather;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class WeatherActivity extends AppCompatActivity {
    public static final String tag = "WeatherActivity";
    private static final String TAG = tag ;
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
            switch (position) {
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

        });
        //ForecastFragment forecastFragment = new ForecastFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "On Starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "On Resuming");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "On Stopping");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "On Pausing");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "On Destroying");
    }

}
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i( "Weather", "onCreate() called");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu mainu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==R.id.search){
            Log.i("Weather", "Menu search clicked");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

public class HomeFragmentPagerAdapter extends ViewPagerFragmentAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Vietnam", "Paris", "Lounge" };
    public HomeFragmentPagerAdapter(FragmentManager fm) { super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0:
                return new WeatherForecastFragment();
            case 1:
                return new WeatherForecastFragment();
            case 2:
                return new WeatherForecastFragment();
        }
        return new Fragment();
    }

    @Override
    public CharSequence getPageTitle ( int page){
        return titles[page];
    }
}

}