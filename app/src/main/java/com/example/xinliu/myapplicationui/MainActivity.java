package com.example.xinliu.myapplicationui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        //圆形进度条，点击消失，再点击出现
                        //if(progressBar.getVisibility() == View.GONE){
                        //    progressBar.setVisibility(View.VISIBLE);
                        //}else{
                        //    progressBar.setVisibility(View.GONE);

                        //水平进度条，每点一次增长10
                        //int progress = progressBar.getProgress();
                        //progress = progress + 10;
                        //progressBar.setProgress(progress);

                        //添加一个alert提示框
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is a Dialog");
                        dialog.setMessage("oh its very important!");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
