package net.canking.plane;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * ����ĿΪͨ�õ���Ϸ��ܣ�Ϊ�򵥵�canvas�����ṩ�˹�����
 * 
 * @author changxing
 */
public class MainActivity extends Activity {
    public static MainActivity instance;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        // ����ȫ��
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // ��ʾ�Զ����SurfaceView��ͼ
        setContentView(new MySurfaceView(this));
    }
}
