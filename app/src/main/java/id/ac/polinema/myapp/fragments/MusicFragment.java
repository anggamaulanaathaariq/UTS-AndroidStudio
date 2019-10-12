package id.ac.polinema.myapp.fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import id.ac.polinema.myapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {

    ImageButton playBtn;
    MediaPlayer mp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        playBtn = (ImageButton) rootView.findViewById(R.id.playBtn);

        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.wiz);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.setLooping(true);
                sound.pause();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
    public void playBtnClick(View view) {
        if (!mp.isPlaying()) {
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);
        } else {
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }
    }
}

