package com.yulu.myapplication;


import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;


public class MainActivity extends AppCompatActivity{

    Button bu;
    PopupWindow pw;
    ImageView iv;
    private int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         bu= (Button) findViewById(R.id.btnUserInfo);


        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpopupwindow();
            }


        });



    }
    int size;
    View view;
    private void showpopupwindow() {


        if (pw == null) {
//            LayoutInflater layoutinflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
             view = LayoutInflater.from(this).inflate(R.layout.layout, null);
            height = getResources().getDisplayMetrics().heightPixels;
             size =   getResources().getDisplayMetrics().widthPixels;
            // 1 。popupWindow 要显示的布局文件
            pw = new PopupWindow(view,size, size/2);
            // 设置焦点在弹窗上
            pw.setFocusable(true);
            // 设置允许在外点击消失
            pw.setOutsideTouchable(true);
            // 设置弹窗消失事件监听
           /* pw.setOnDismissListener(new PopupWindow.OnDismissListener() {
                public void onDismiss() {
                    // TODO Auto-generated method stub
                }
            });*/
//            pw.setAnimationStyle(R.style.);
            // 这个是为了点击“返回Back”也能使其消失，并且并不会影响你的背景
            pw.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_launcher));//设置背



        }

        pw.showAsDropDown(bu,0,height/2);



    }

}
