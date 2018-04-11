package com.paperscissorsstonegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhoWin {
    public String win(int player , int computer){
        // 1 – 剪刀, 2 – 石頭, 3 – 布.
        if(player == computer){
            return "雙方平手！";
        }
        else if(player == 1 && computer == 2){
            return "很可惜，你輸了！";
        }
        else if(player == 1 && computer == 3){
            return "恭喜，你贏了！";
        }
        else if(player == 2 && computer == 1){
            return "恭喜，你贏了！";
        }
        else if(player == 2 && computer == 3) {
            return "很可惜，你輸了！";
        }
        else if(player == 3 && computer == 1) {
            return "很可惜，你輸了！";
        }
        else if(player == 3 && computer == 2) {
            return "恭喜，你贏了！";
        }
        return null;
    }
}
