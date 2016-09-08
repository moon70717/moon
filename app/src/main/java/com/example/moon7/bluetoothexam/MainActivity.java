package com.example.moon7.bluetoothexam;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter mBlueAdapter;//블루투스도 아댑터 설정을 해줘야됨
    TextView text;
    //관련작업이 아뎁터를 통해서 이루어짐
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        mBlueAdapter=BluetoothAdapter.getDefaultAdapter();//블루트스아뎁터를 얻기위해 정적합수를 사용함
        text=(TextView)findViewById(R.id.Get_fare);
        switch (v.getId()){
            case R.id.On_Bt:
                CheckBlueTooth();
                break;
        }
    }

    public void FindDevice(){
        
    }

    public void CheckBlueTooth(){//블루투스 체크
        //getDefaultAdapter는 블루투스 아뎁터를 반환하며 장치가 블루투스지원을 않하면 null 을 반환하게됨
        if(mBlueAdapter==null){
            Toast.makeText(MainActivity.this,"장치가 블루투스를 지원하지않습니다",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"장치가 블루투스를 지원합니다",Toast.LENGTH_SHORT).show();
            if(!mBlueAdapter.isEnabled()){//블루투스가 활성되지 않았을떄
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent, RESULT_OK);
            }
        }
    }

}

