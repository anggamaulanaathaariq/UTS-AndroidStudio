package id.ac.polinema.myapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import id.ac.polinema.myapp.R;

public class ActionActivity extends AppCompatActivity {
    ImageButton playBtn;
    SeekBar positionB;
    SeekBar volumebar;
    TextView elapsedTime;
    TextView remainingTime;
    MediaPlayer mp;
    int totalTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        playBtn = (ImageButton) findViewById(R.id.playBtn);
        elapsedTime = (TextView) findViewById(R.id.elapsedTime);
        remainingTime = (TextView) findViewById(R.id.remainingTime);

        // MediaPlayer
        mp = MediaPlayer.create(this, R.raw.nosleep);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totalTime = mp.getDuration();

        // PositionBar
        positionB = (SeekBar) findViewById(R.id.positionB);
        positionB.setMax(totalTime);

        // VolumeBar
        volumebar = (SeekBar) findViewById(R.id.volumebar);

    }
    public void playBtnClick(View view) {
        if (!mp.isPlaying()) {
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);
        }else{
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }
    }
}
