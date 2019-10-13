package id.ac.polinema.myapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import id.ac.polinema.myapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.myapp.albumactivities.Album1;
import id.ac.polinema.myapp.albumactivities.Album2;
import id.ac.polinema.myapp.albumactivities.Album3;
import id.ac.polinema.myapp.albumactivities.Album4;
import id.ac.polinema.myapp.albumactivities.Album5;
import id.ac.polinema.myapp.albumactivities.Album6;
import id.ac.polinema.myapp.fragments.AlbumFragment;
import id.ac.polinema.myapp.fragments.MusicFragment;
import id.ac.polinema.myapp.fragments.BioFragment;


public class NavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

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
    public void btnToast(View view) {
        Intent intent = new Intent(this, Album1.class);
        startActivity(intent);
    }
    public void btnToast2(View view) {
        Intent intent = new Intent(this, Album2.class);
        startActivity(intent);
    }
    public void btnToast3(View view) {
        Intent intent = new Intent(this, Album3.class);
        startActivity(intent);
    }
    public void btnToast4(View view) {
        Intent intent = new Intent(this, Album4.class);
        startActivity(intent);
    }
    public void btnToast5(View view) {
        Intent intent = new Intent(this, Album5.class);
        startActivity(intent);
    }
    public void btnToast6(View view) {
        Intent intent = new Intent(this, Album6.class);
        startActivity(intent);
    }
    @Override
    public void onPointerCaptureChanged ( boolean hasCapture) {
    }
}
