package net.canking.plane;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * 此项目为通用的游戏框架，为简单的canvas动画提供了管理方案
 * 
 * @author changxing
 */
public class MainActivity extends Activity {
    public static MainActivity instance;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        // 设置全屏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 显示自定义的SurfaceView视图
        setContentView(new MySurfaceView(this));
    }
}
