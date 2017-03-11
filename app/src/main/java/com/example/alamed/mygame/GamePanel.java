package com.example.alamed.mygame;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Nicolás on 11-03-2017.
 */

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback
{
    public GamePanel(Context context)
    {
        super(context);

        // add the callback to the SurfaceHolder to intercepts events
        getHolder().addCallback(this);
    }

  @Override
  public  void  surfaceChanged(SurfaceHolder holder,int format, int width, int height){}

  @Override
  public void  surfaceDestroyed(SurfaceHolder holder){}

  @Override
   public  void surfaceCreated(SurfaceHolder holder){}

}
