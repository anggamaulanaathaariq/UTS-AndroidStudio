package id.ac.polinema.myapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;

import id.ac.polinema.myapp.R;
import id.ac.polinema.myapp.fragments.AlbumFragment;

public class ActionActivity extends AppCompatActivity {

    private AlbumFragment albumFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_album);
        albumFragment = new AlbumFragment();
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.action_album,albumFragment).commit();

    }

}