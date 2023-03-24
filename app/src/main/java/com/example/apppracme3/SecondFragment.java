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
        Log.i(TAG, "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.activity_data_reciever_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Nick = (TextView) view.findViewById(R.id.getNick);
        Names = (TextView) view.findViewById(R.id.getName);
        Surnames = (TextView) view.findViewById(R.id.getSurname);
        Emails = (TextView) view.findViewById(R.id.getEmail);

        if (getArguments() != null) {
            Bundle bundle = getArguments();
            Nick.setText(bundle.get("Nickname").toString());
            Names.setText(bundle.get("FName").toString());
            Surnames.setText(bundle.get("SName").toString());
            Emails.setText(bundle.get("Email").toString());
            Log.i(TAG, "Data Received");
        }
        Button logButton = view.findViewById(R.id.btnReciever);
        logButton.setOnClickListener(view1 -> {
            Bundle backTransferData = new Bundle();
            backTransferData.putString("Nickname", Nick.getText().toString());
            backTransferData.putString("FName", Names.getText().toString());
            backTransferData.putString("SName", Surnames.getText().toString());
            backTransferData.putString("Email", Emails.getText().toString());
            FirstFragment firstFragment = (FirstFragment) requireActivity().getSupportFragmentManager().findFragmentByTag(FirstFragment.TAG);
            if (firstFragment != null) {
                firstFragment.setArguments(backTransferData);
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container_view, firstFragment)
                        .addToBackStack(TAG).commit();
            }


        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Created");
        Toast.makeText(getContext(), "Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "Started");
        Toast.makeText(getContext(), "Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "Paused");
        Toast.makeText(getContext(), "Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach");
        Toast.makeText(getContext(), "onAttach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");
        Toast.makeText(getContext(), "onDetach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "Stopped");
        Toast.makeText(getContext(), "Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Destroyed");
        Toast.makeText(getContext(), "Destroyed", Toast.LENGTH_SHORT).show();
    }


}
