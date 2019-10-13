package id.ac.polinema.myapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import id.ac.polinema.myapp.R;
import id.ac.polinema.myapp.activities.ActionActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album, container, false);

    }
    public void btnToast(View view){
        Toast.makeText(getActivity(),"", Toast.LENGTH_LONG).show();
    }
}
