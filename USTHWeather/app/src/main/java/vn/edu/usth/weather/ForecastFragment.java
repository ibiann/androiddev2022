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

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        LinearLayout Forecast = new LinearLayout(getActivity());
//        Forecast.setBackgroundColor(0xFFC1C1C1);
//        Forecast.setOrientation(LinearLayout.VERTICAL);
//
//        TextView Saturday = new TextView(getActivity());
//        Saturday.setText("Saturday");
//        ImageView sun = new ImageView(getActivity());
//        sun.setImageResource(R.drawable.Sun);
//
//        TextView Sunday = new TextView(getActivity());
//        Sunday.setText("Sunday");
//        ImageView rain = new ImageView(getActivity());
//        rain.setImageResource(R.drawable.Rain);
//
//        TextView Monday = new TextView(getActivity());
//        Monday.setText("Sunday");
//        ImageView thunder = new ImageView(getActivity());
//        thunder.setImageResource(R.drawable.Thunder);
//
//        return Forecast;
//    }
//}