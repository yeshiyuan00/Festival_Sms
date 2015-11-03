package com.ysy.ysy_festival_sms.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.ysy.ysy_festival_sms.R;
import com.ysy.ysy_festival_sms.bean.FestivalLab;
import com.ysy.ysy_festival_sms.bean.Msg;
import com.ysy.ysy_festival_sms.fragment.FestivalCateGoryFragment;

public class ChooseActivity extends AppCompatActivity {
    private ListView lv_choose;
    private FloatingActionButton fb_tosend;
    private ArrayAdapter<Msg> mAdapter;
    private LayoutInflater mLayoutInflater;
    private int FestivalId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        FestivalId = getIntent().getExtras().getInt(FestivalCateGoryFragment.FESTIVAL_ID);
        Log.e("test:", "FestivalId=" + FestivalId);
        setTitle(FestivalLab.getInstance().getFestivalById(FestivalId).getName());
        mLayoutInflater = LayoutInflater.from(this);
        initView();

    }

    private void initView() {
        lv_choose = (ListView) findViewById(R.id.id_lv_choose);
        fb_tosend = (FloatingActionButton) findViewById(R.id.id_fb_tosend);

        lv_choose.setAdapter(mAdapter = new ArrayAdapter<Msg>(this, -1, FestivalLab.getInstance().getMsgByFestivalId(FestivalId)) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = mLayoutInflater.inflate(R.layout.item_choose_list, parent, false);
                }
                TextView tv_content = (TextView) convertView.findViewById(R.id.id_tv_content);
                Button btn_send = (Button) convertView.findViewById(R.id.id_btn_send);

                tv_content.setText("  " + getItem(position).getContent());
                btn_send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO
                    }
                });
                return convertView;
            }

        });

        fb_tosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });
    }
}
