package cn.cmy.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* private Button mBtnAdd;
    private boolean mBound;
    private ICarManager mManager;
    private final ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mBound = true;
            mManager = ICarManager.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mBound = false;
            mManager = null;
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initView();
    }

    /*private void initView() {
        mBtnAdd = findViewById(R.id.btn_add);

        mBtnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                if (null == mManager) {
                    bind();
                    Toast.makeText(this, "binding.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Car car1 = new Car();
                car1.name = "雷诺1";
                car1.price = 8001;
                Car car2 = new Car();
                car2.name = "雷诺2";
                car2.price = 8002;
                Car car3 = new Car();
                car3.name = "雷诺3";
                car3.price = 8003;
                try {
                    Car car4 = mManager.addCarIn(car1);
                    Car car5 = mManager.addCarOut(car2);
                    Car car6 = mManager.addCarInOut(car3);
                    Log.i("###########", "onClick: car1:" + car1.toString());
                    Log.i("###########", "onClick: car2:" + car2.toString());
                    Log.i("###########", "onClick: car3:" + car3.toString());

                } catch (RemoteException e) {
                    Log.i("$$$$$$$$$4", "onClick: " + e.getMessage());
                }
                break;
        }
    }

    private void bind() {
        Intent intent = new Intent();
        intent.setPackage("cn.cmy.view");
        intent.setAction("cn.intent.action.CARSERVICE");
        bindService(intent, conn, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mBound) {
            unbindService(conn);
        }
    }*/
}