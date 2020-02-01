package com.example.francescoandreuzzi.sandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import jackpal.androidterm.emulatorview.EmulatorView;
import jackpal.androidterm.emulatorview.TermSession;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout root = (LinearLayout) findViewById(R.id.main);

        TermSession session = new TermSession(false);
        InputStream in = new InputStream() {

            String cmd = "echo merda\n";
            int index = 0;

            @Override
            public int read() throws IOException {
                if(index < cmd.length()) {
                    return cmd.charAt(index++);
                } return -1;
            }

            @Override
            public int available() throws IOException {
                return cmd.length() - index;
            }
        };
        session.setTermIn(in);

        session.setTermOut(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                Log.e("andre", (char) b + "");
            }
        });

        EmulatorView emulatorView = new EmulatorView(this, session, getResources().getDisplayMetrics());

        root.addView(emulatorView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
