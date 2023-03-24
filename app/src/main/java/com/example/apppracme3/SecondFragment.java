package com.example.apppracme3;

import android.content.Context;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {
    final public static String TAG = SecondFragment.class.getSimpleName();

    public SecondFragment() {

    }

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }


    private TextView Nick;
    private TextView Names;
    private TextView Surnames;
    private TextView Emails;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_data_reciever_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Nick = (TextView) view.findViewById(R.id.getNick);
        Names = (TextView) view.findViewById(R.id.getName);
        Surnames = (TextView) view.findViewById(R.id.getSurname);
        Emails = (TextView) view.findViewById(R.id.getEmail);


        Button logButton = view.findViewById(R.id.btnReciever);
        logButton.setOnClickListener(view1 -> {
            //empty logic

        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}
