package com.example.harris_hawk.owlpiano;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainui);
        final Button btn0=findViewById(R.id.btn0);
        final Button btn1=findViewById(R.id.btn1);
        final Button btn2=findViewById(R.id.btn2);
        final Button btn3=findViewById(R.id.btn3);
        final Button btn4=findViewById(R.id.btn4);
        final Button btn5=findViewById(R.id.btn5);
        final Button btn6=findViewById(R.id.btn6);
        final Button btn7=findViewById(R.id.btn7);
        final Button btn8=findViewById(R.id.btn8);
        final Button playbtn=findViewById(R.id.playbtn);
        final Button delbtn=findViewById(R.id.delbtn);
        final Button clearbtn=findViewById(R.id.clearbtn);
        final EditText intnum=findViewById(R.id.intnum);
        final EditText delay=findViewById(R.id.delay);
        final MediaPlayer mp1=new MediaPlayer().create(this, R.raw.music1);
        final MediaPlayer mp2=new MediaPlayer().create(this, R.raw.music2);
        final MediaPlayer mp3=new MediaPlayer().create(this, R.raw.music3);
        final MediaPlayer mp4=new MediaPlayer().create(this, R.raw.music4);
        final MediaPlayer mp5=new MediaPlayer().create(this, R.raw.music5);
        final MediaPlayer mp6=new MediaPlayer().create(this, R.raw.music6);
        final MediaPlayer mp7=new MediaPlayer().create(this, R.raw.music7);
        final MediaPlayer mp8=new MediaPlayer().create(this, R.raw.music8);





        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intnum.setText(intnum.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp1.start();
                intnum.setText(intnum.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp2.start();
                intnum.setText(intnum.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp3.start();
                intnum.setText(intnum.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();
                intnum.setText(intnum.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp5.start();
                intnum.setText(intnum.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp6.start();
                intnum.setText(intnum.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp7.start();
                intnum.setText(intnum.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp8.start();
                intnum.setText(intnum.getText()+"8");
            }
        });

        playbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                for(int i=0;i<intnum.length();i++){
                    int temp=Integer.valueOf(intnum.getText().toString().substring(i,i+1));
                    int delaynum=Integer.valueOf(delay.getText().toString());
                    switch (temp){
                        case 1:mp1.start();break;
                        case 2:mp2.start();break;
                        case 3:mp3.start();break;
                        case 4:mp4.start();break;
                        case 5:mp5.start();break;
                        case 6:mp6.start();break;
                        case 7:mp7.start();break;
                        case 8:mp8.start();break;

                    }
                    try{
                        Thread.sleep(delaynum);
                    }catch(InterruptedException e){
                        e.printStackTrace();;
                    }
                }
            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                intnum.setText("");
            }
        });

        delbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                intnum.setText(intnum.getText().toString().substring(0,intnum.length()-1));
            }
        });

    }


}
