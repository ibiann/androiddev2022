package vn.edu.usth.weather;

package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {
    public ViewPagerFragmentAdapter(@NonNull FragmentManager fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new WeatherForecastFragment();
            case 1:
                return new WeatherForecastFragment();
            case 2:
                return new WeatherForecastFragment();
        }
        return new BlankFragment();
    }

    @Override
    public int getItemCount() {

        return 3;
    }
}