package com.example.apppracme3;


import android.content.Context;import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {
    final public static String TAG = FirstFragment.class.getSimpleName();

    public FirstFragment(){

    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }


    private EditText nickname;
    private EditText fname;
    private EditText sname;
    private EditText email;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.activity_main_frament, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nickname = (EditText) view.findViewById(R.id.nickname);
        fname = (EditText) view.findViewById(R.id.name);
        sname = (EditText) view.findViewById(R.id.surname);
        email = (EditText) view.findViewById(R.id.email);

        if(getArguments() != null){
            Bundle dataFromSecond = getArguments();
            nickname.setText(dataFromSecond.get("Nickname").toString());
            fname.setText(dataFromSecond.get("FName").toString());
            sname.setText(dataFromSecond.get("SName").toString());
            email.setText(dataFromSecond.get("Email").toString());
        }

        TextView loadTitle = (TextView) view.findViewById(R.id.regscrn);
        loadTitle.setText(R.string.title);
        ImageView loadPicture = (ImageView) view.findViewById(R.id.catgif);
        loadPicture.setImageResource(R.drawable.catgif);
        Button btnReg = (Button) view.findViewById(R.id.btnreg);

        btnReg.setOnClickListener(vie -> {
            Bundle userData = new Bundle();
            userData.putString("Nickname", nickname.getText().toString());
            userData.putString("FName", fname.getText().toString());
            userData.putString("SName", sname.getText().toString());
            userData.putString("Email", email.getText().toString());
            SecondFragment secondFragment = SecondFragment.newInstance();
            secondFragment.setArguments(userData);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, secondFragment)
                    .addToBackStack(TAG)
                    .commit();


            Log.i(TAG, "Data transferred");
        });
        Log.i(TAG, "onViewCreated");
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "Attached");
        Toast.makeText(getContext(), "Attached", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Created");
        Toast.makeText(getContext(), "Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "Started");
        Toast.makeText(getContext(), "Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "Paused");
        Toast.makeText(getContext(), "Paused", Toast.LENGTH_SHORT).show();
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

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");
        Toast.makeText(getContext(), "onDetach", Toast.LENGTH_SHORT).show();
    }
}
