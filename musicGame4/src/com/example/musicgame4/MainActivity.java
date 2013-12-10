//http://blog.oukasoft.com/%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%A0/%E3%80%90android%E3%80%91soundpool%E3%82%AF%E3%83%A9%E3%82%B9%E3%82%92%E4%BD%BF%E3%81%A3%E3%81%A6wav%E5%BD%A2%E5%BC%8F%E3%80%81ogg%E5%BD%A2%E5%BC%8F%E3%81%AE%E5%8A%B9%E6%9E%9C%E9%9F%B3%EF%BC%88se/
//http://noopy.net/2013/02/ontouch%E3%81%A8onclick%E3%81%AE%E9%81%95%E3%81%84%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6/
//http://techbooster.jpn.org/andriod/application/715/
//http://wiki.livedoor.jp/moonlight_aska/d/%A5%DC%A5%BF%A5%F3%A4%AC%B2%A1%A4%B5%A4%EC%A4%EB%A4%C8....
package com.example.musicgame4;

//import com.example.musicgame3.R;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnTouchListener{
	
	SoundPool BD;
	SoundPool snare;
	SoundPool hihat;
	SoundPool open;
	SoundPool clap;
	SoundPool bassline;
	int sound_id1;
	int sound_id2;
	int sound_id3;
	int sound_id4;
	int sound_id5;
	int sound_id6;
	
	Button BD_button;
    Button snare_button;
    Button hihat_button;
    Button open_button;
    Button clap_button;
    Button bassline_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        BD = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        snare = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        hihat = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        open = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        clap = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        bassline = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        sound_id1 = BD.load(this, R.raw.bd_01, 1 );
        sound_id2 = snare.load(this, R.raw.sn_01, 1 );
        sound_id3 = hihat.load(this, R.raw.hh_01, 1 );
        sound_id4 = open.load(this, R.raw.open_hh_01, 1 );
        sound_id5 = clap.load(this, R.raw.hanb_clap_01, 1 );
        sound_id6 = bassline.load(this, R.raw.bass_riff_01, 1 );
        
        BD_button = (Button) findViewById(R.id.button1);
        snare_button = (Button) findViewById(R.id.button2);
        hihat_button = (Button) findViewById(R.id.button3);
        open_button = (Button) findViewById(R.id.button4);
        clap_button = (Button) findViewById(R.id.button5);
        bassline_button = (Button) findViewById(R.id.button6);
        BD_button.setOnTouchListener(this);
        snare_button.setOnTouchListener(this);
        hihat_button.setOnTouchListener(this);
        open_button.setOnTouchListener(this);
        clap_button.setOnTouchListener(this);
        bassline_button.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction() == MotionEvent.ACTION_DOWN) {
			switch (v.getId()) {
			case R.id.button1:
				BD.play(sound_id1, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button2:
				snare.play(sound_id2, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button3:
				hihat.play(sound_id3, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button4:
				open.play(sound_id4, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button5:
				clap.play(sound_id5, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button6:
				bassline.play(sound_id6, 1.0F, 1.0F, 0, 0, 1.0F);
			}
			return true;
		}else if(event.getAction() == MotionEvent.ACTION_UP) {
			switch (v.getId()) {
			case R.id.button1:
				BD.stop(sound_id1);
				break;
			case R.id.button2:
				snare.stop(sound_id2);
				break;
			case R.id.button3:
				hihat.stop(sound_id3);
				break;
			case R.id.button4:
				open.stop(sound_id4);
				break;
			case R.id.button5:
				clap.stop(sound_id5);
				break;
			case R.id.button6:
				bassline.stop(sound_id6);
			break;
			}
            return true;
        }
		return false;
	}
}

