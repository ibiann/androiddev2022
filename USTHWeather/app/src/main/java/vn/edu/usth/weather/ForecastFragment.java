package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment<Saturday> extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }


    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
}

//        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT,1f);
//        LinearLayout layout = new LinearLayout(getActivity());
//        layout.setBackgroundColor(Color.parseColor("#20FF0000"));
//        layout.setOrientation(LinearLayout.VERTICAL);
//        layout.setLayoutParams(lparams);

//        TextView thursday = new TextView(getActivity());
//        thursday.setLayoutParams(lparams);
//        thursday.setText("Thursday");
//        layout.addView(thursday);
//
//        ImageView ThursdayWeather = new ImageView(getActivity());
//        ThursdayWeather.setLayoutParams(lparams);
//        ThursdayWeather.setImageResource(R.drawable.weather_icon1);
//        layout.addView(ThursdayWeather);
//
//        TextView friday = new TextView(getActivity());
//        friday.setLayoutParams(lparams);
//        friday.setText("Friday");
//        layout.addView(friday);
//
//        ImageView FridayWeather = new ImageView(getActivity());
//        FridayWeather.setLayoutParams(lparams);
//        FridayWeather.setImageResource(R.drawable.weather_icon2);
//        layout.addView(FridayWeather);

//        return layout;
