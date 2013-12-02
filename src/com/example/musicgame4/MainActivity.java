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
	
	SoundPool BD, snare, hihat, open, clap, bassline, tom1, tom2,
			  BD2, snare2, ride, crash, perc, splash, SFX, triangle;
	
	int sound_id1, sound_id2, sound_id3, sound_id4, sound_id5, sound_id6,
		sound_id7, sound_id8, sound_id9, sound_id10, sound_id11, sound_id12,
		sound_id13, sound_id14, sound_id15, sound_id16;
	
	Button BD_button, snare_button, hihat_button, open_button,
		   clap_button, bassline_button, tom1_button, tom2_button,
		   BD2_button, snare2_button, ride_button, crash_button,
		   perc_button, splash_button, SFX_button, triangle_button;

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
        tom1 = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        tom2 = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        
        BD2 = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        snare2 = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        ride = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        crash = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        
        perc = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        splash = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        SFX = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        triangle = new SoundPool( 1, AudioManager.STREAM_MUSIC, 0 );
        
        
        sound_id1 = BD.load(this, R.raw.bd_01, 1 );
        sound_id2 = snare.load(this, R.raw.sn_01, 1 );
        sound_id3 = hihat.load(this, R.raw.hh_01, 1 );
        sound_id4 = open.load(this, R.raw.open_hh_01, 1 );
        
        sound_id5 = clap.load(this, R.raw.hanb_clap_01, 1 );
        sound_id6 = bassline.load(this, R.raw.bass_riff_01, 1 );
        sound_id7 = tom1.load(this, R.raw.tom_01, 1 );
        sound_id8 = tom2.load(this, R.raw.tom_02, 1 );
        
        sound_id9 = BD2.load(this, R.raw.kick_02, 1 );
        sound_id10 = snare2.load(this, R.raw.snare_02, 1 );
        sound_id11 = ride.load(this, R.raw.ride_01, 1 );
        sound_id12 = crash.load(this, R.raw.crash_01, 1 );
        
        sound_id13 = perc.load(this, R.raw.perc_01, 1 );
        sound_id14 = splash.load(this, R.raw.splash_01, 1 );
        sound_id15 = SFX.load(this, R.raw.sfx_01, 1 );
        sound_id16 = triangle.load(this, R.raw.triangle_01, 1 );
        
        
        BD_button = (Button) findViewById(R.id.button1);
        snare_button = (Button) findViewById(R.id.button2);
        hihat_button = (Button) findViewById(R.id.button3);
        open_button = (Button) findViewById(R.id.button4);
        
        clap_button = (Button) findViewById(R.id.button5);
        bassline_button = (Button) findViewById(R.id.button6);
        tom1_button = (Button) findViewById(R.id.button7);
        tom2_button = (Button) findViewById(R.id.button8);
        
        BD2_button = (Button) findViewById(R.id.button9);
        snare2_button = (Button) findViewById(R.id.button10);
        ride_button = (Button) findViewById(R.id.button11);
        crash_button = (Button) findViewById(R.id.button12);
        
        perc_button = (Button) findViewById(R.id.button13);
        splash_button = (Button) findViewById(R.id.button14);
        SFX_button = (Button) findViewById(R.id.button15);
        triangle_button = (Button) findViewById(R.id.button16);
        
        
        BD_button.setOnTouchListener(this);
        snare_button.setOnTouchListener(this);
        hihat_button.setOnTouchListener(this);
        open_button.setOnTouchListener(this);
        
        clap_button.setOnTouchListener(this);
        bassline_button.setOnTouchListener(this);
        tom1_button.setOnTouchListener(this);
        tom2_button.setOnTouchListener(this);
        
        BD2_button.setOnTouchListener(this);
        snare2_button.setOnTouchListener(this);
        ride_button.setOnTouchListener(this);
        crash_button.setOnTouchListener(this);
        
        perc_button.setOnTouchListener(this);
        splash_button.setOnTouchListener(this);
        SFX_button.setOnTouchListener(this);
        triangle_button.setOnTouchListener(this);
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
				hihat.play(sound_id3, 0.5F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button4:
				open.play(sound_id4, 0.5F, 1.0F, 0, 0, 1.0F);
				break;
				
			case R.id.button5:
				clap.play(sound_id5, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button6:
				bassline.play(sound_id6, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button7:
				tom1.play(sound_id7, 0.5F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button8:
				tom2.play(sound_id8, 0.5F, 1.0F, 0, 0, 1.0F);
				break;
				
			case R.id.button9:
				BD2.play(sound_id9, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button10:
				snare2.play(sound_id10, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button11:
				ride.play(sound_id11, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button12:
				crash.play(sound_id12, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
				
			case R.id.button13:
				perc.play(sound_id13, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button14:
				splash.play(sound_id14, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button15:
				SFX.play(sound_id15, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
			case R.id.button16:
				triangle.play(sound_id16, 1.0F, 1.0F, 0, 0, 1.0F);
				break;
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
			case R.id.button7:
				tom1.stop(sound_id7);
				break;
			case R.id.button8:
				tom2.stop(sound_id8);
				break;
				
			case R.id.button9:
				BD2.stop(sound_id9);
				break;
			case R.id.button10:
				snare2.stop(sound_id10);
				break;
			case R.id.button11:
				ride.stop(sound_id11);
				break;
			case R.id.button12:
				crash.stop(sound_id12);
				break;
				
			case R.id.button13:
				perc.stop(sound_id13);
				break;
			case R.id.button14:
				splash.stop(sound_id14);
				break;
			case R.id.button15:
				SFX.stop(sound_id15);
				break;
			case R.id.button16:
				triangle.stop(sound_id16);
				break;
			}
            return true;
        }
		return false;
	}
}

