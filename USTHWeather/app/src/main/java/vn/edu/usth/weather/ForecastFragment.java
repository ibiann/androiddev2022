package vn.edu.usth.weather;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
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

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n", "RtlHardcoded"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_forecast, container, false);

        return view;
    }

    private LinearLayout setUpLinearV(FrameLayout view) {
        LinearLayout linearV = new LinearLayout(view.getContext());
        linearV.setOrientation(LinearLayout.VERTICAL);
        linearV.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return linearV;
    }

    @NonNull
    private LinearLayout setUpLinearH(@NonNull FrameLayout view) {
        LinearLayout linearH = new LinearLayout(view.getContext());
        linearH.setOrientation(LinearLayout.HORIZONTAL);
        linearH.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return linearH;
    }

    private TextView setUpTvThursday(FrameLayout view) {
        TextView tvThursday = new TextView(view.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 200);
        layoutParams.gravity = Gravity.TOP;
        layoutParams.setMargins(20, 0, 0, 0);
        tvThursday.setText("Thursday");
        tvThursday.setTextSize(30);
        tvThursday.setLayoutParams(layoutParams);
        return tvThursday;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private ImageView setUpIvWeather(FrameLayout view) {
        ImageView ivWeatherIcon = new ImageView(view.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(150, 120);
        layoutParams.gravity = Gravity.TOP;
        layoutParams.setMargins(0, 0, 0, 0);
        ivWeatherIcon.setImageDrawable(getResources().getDrawable(R.drawable.weather_icon_21));
        ivWeatherIcon.setLayoutParams(layoutParams);
        return ivWeatherIcon;
    }


}