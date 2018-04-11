package com.paperscissorsstonegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtComPlay, mTxtResult;
    private Button mBtnScissors, mBtnStone, mBtnPaper;
    private WhoWin win = new WhoWin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtComPlay = (TextView)findViewById(R.id.txtComPlay);
        mTxtResult = (TextView)findViewById(R.id.txtResult);
        mBtnScissors = (Button)findViewById(R.id.btnScissors);
        mBtnStone = (Button)findViewById(R.id.btnStone);
        mBtnPaper = (Button)findViewById(R.id.btnPaper);

        mBtnScissors.setOnClickListener(btnScissorsOnClick);
        mBtnStone.setOnClickListener(btnStoneOnClick);
        mBtnPaper.setOnClickListener(btnPaperOnClick);
    }
    private int SetComuter() {
        int iComPlay = (int) (Math.random() * 3 + 1);
        // 1 – 剪刀, 2 – 石頭, 3 – 布.
        switch (iComPlay) {
            case 1:
                mTxtComPlay.setText(R.string.play_scissors);
                break;
            case 2:
                mTxtComPlay.setText(R.string.play_stone);
                break;
            case 3:
                mTxtComPlay.setText(R.string.play_paper);
                break;
        }
        return iComPlay;
    }
    private View.OnClickListener btnScissorsOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            // 決定電腦出拳.
            // 1 – 剪刀, 2 – 石頭, 3 – 布.
            mTxtResult.setText(win.win(1, SetComuter()));
        }
    };


    private View.OnClickListener btnStoneOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            // 決定電腦出拳.
            // 1 – 剪刀, 2 – 石頭, 3 – 布.
            mTxtResult.setText(win.win(2, SetComuter()));
        }
    };

    private View.OnClickListener btnPaperOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            // 決定電腦出拳.
            // 1 – 剪刀, 2 – 石頭, 3 – 布.
            mTxtResult.setText(win.win(3, SetComuter()));
        }
    };
};
