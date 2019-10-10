package id.ac.polinema.myapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.myapp.R;
import id.ac.polinema.myapp.fragments.AlbumFragment;
import id.ac.polinema.myapp.fragments.MusicFragment;
import id.ac.polinema.myapp.fragments.BioFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new BioFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
        private boolean loadFragment (Fragment fragment){
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }
        @Override
        public boolean onNavigationItemSelected (@NonNull MenuItem menuItem){

        Fragment fragment = null;
            switch (menuItem.getItemId()) {
            case R.id.action_bio:
                fragment = new BioFragment();
                break;
            case R.id.action_music:
                fragment = new MusicFragment();
                break;
            case R.id.action_album:
                fragment = new AlbumFragment();
                break;
        }
        return loadFragment(fragment);
    }

        @Override
        public void onPointerCaptureChanged ( boolean hasCapture) {
        }
    }

