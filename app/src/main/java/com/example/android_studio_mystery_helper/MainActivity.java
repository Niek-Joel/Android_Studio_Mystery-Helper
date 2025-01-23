package com.example.android_studio_mystery_helper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.android_studio_mystery_helper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] stringArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        stringArray = getResources().getStringArray(R.array.string_array);
    }

    public void onClickButton(View view){
        Random rand = new Random();
        int arrayIndex = rand.nextInt(stringArray.length);
        binding.plotFragmentView.setText(stringArray[arrayIndex]);
    }
}