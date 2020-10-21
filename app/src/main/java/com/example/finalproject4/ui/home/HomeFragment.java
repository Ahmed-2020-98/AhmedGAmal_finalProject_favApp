package com.example.finalproject4.ui.home;

import android.graphics.Movie;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject4.MovieAdapter;
import com.example.finalproject4.MovieItem;
import com.example.finalproject4.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ArrayList<MovieItem> movieItems = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MovieAdapter(movieItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        movieItems.add(new MovieItem(R.drawable.one, "one","0","0"));
        movieItems.add(new MovieItem(R.drawable.two, "two","1","0"));
        movieItems.add(new MovieItem(R.drawable.three, "three","2","0"));
        movieItems.add(new MovieItem(R.drawable.four, "four","3","0"));
        movieItems.add(new MovieItem(R.drawable.five, "five","4","0"));
        movieItems.add(new MovieItem(R.drawable.six, "six","5","0"));





        return root;
    }
}