package com.billy.magictower.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.billy.magictower.GamePlayConstants;
import com.billy.magictower.R;
import com.billy.magictower.controller.FloorController;
import com.billy.magictower.controller.HeroController;
import com.billy.magictower.util.ApplicationUtil;
import com.billy.magictower.view.FloorView;
import com.billy.magictower.view.MainGameView;

public class GameActivity extends MTBaseActivity {


    private MainGameView mainGameView;

    private FloorView floorView;

    FloorController floorController;
    HeroController heroController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);

        floorController = new FloorController(this);
        heroController = new HeroController(this,floorController);

        floorView = new FloorView(this,floorController,heroController,dm.widthPixels);

        mainGameView = findViewById(R.id.gv_main);
        mainGameView.register(floorView);

        mainGameView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.performClick();
                    float x = event.getX();
                    float y = event.getY();

                    int widthIndex = (int) (x / floorView.getSpriteWidth());
                    int heightIndex = (int) (y / floorView.getSpriteWidth());

                    ApplicationUtil.log("wIndex", widthIndex);
                    ApplicationUtil.log("hIndex", heightIndex);

                    int value = heroController.goToTarget(widthIndex, heightIndex);
                    if (value == GamePlayConstants.MoveStatusCode.CANT_REACH)
                        ApplicationUtil.toast(GameActivity.this, "此乃无法到达之地");
                    else if (value == GamePlayConstants.MoveStatusCode.NO_YELLOW_KEY)
                        ApplicationUtil.toast(GameActivity.this, "黄钥匙不足");

                }


                return false;
            }
        });


    }

    @Override
    public void onExit() {
        mainGameView.exitGame();
    }
}
