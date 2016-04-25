package cn.studyjams.s1.sj61.luolaiyuan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.EatingAtSchool.java
 * @author: yyxyz
 * @date: 2016-04-25 12:33
 */
public class EatingAtSchool extends BaseActivity {
    private static final String TAG = "EatingAtSchool";
    private static final String TJFCSL_TAG = "TJFanCaiShiLu";
    private static final String TJBBMS_TAG = "TJBenBuMeiShi";
    private static final String HAQJ_TAG = "HeiAnQuanJi";
    private static final String WMDP_TAG = "WaiMaiDianPing";

    @Bind(R.id.TJ_fan_cai_shi_lu)
    TextView mTJFanCaiShiLu;
    @Bind(R.id.TJ_ben_bu_mei_shi)
    TextView mTJBenBuMeiShi;
    @Bind(R.id.hei_an_quan_ji)
    TextView mHeiAnQuanJi;
    @Bind(R.id.wai_mai_dian_ping)
    TextView mWaiMaiDianPing;

    private boolean isTJFanCaiShiLuReaded;
    private boolean isTJBenBuMeiShiReaded;
    private boolean isHeiAnQuanJiReaded;
    private boolean isWaiMaiDianPingReaded;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        if (savedInstanceState != null) {
            isTJFanCaiShiLuReaded = savedInstanceState.getBoolean(TJFCSL_TAG);
            isTJBenBuMeiShiReaded = savedInstanceState.getBoolean(TJBBMS_TAG);
            isHeiAnQuanJiReaded = savedInstanceState.getBoolean(HAQJ_TAG);
            isWaiMaiDianPingReaded = savedInstanceState.getBoolean(WMDP_TAG);
        } else {
            isTJFanCaiShiLuReaded = false;
            isTJBenBuMeiShiReaded = false;
            isHeiAnQuanJiReaded = false;
            isWaiMaiDianPingReaded = false;
        }

        if (isTJFanCaiShiLuReaded) {
            setTitleGray(mTJFanCaiShiLu);
        }
        if (isTJBenBuMeiShiReaded) {
            setTitleGray(mTJBenBuMeiShi);
        }
        if (isHeiAnQuanJiReaded) {
            setTitleGray(mHeiAnQuanJi);
        }
        if (isWaiMaiDianPingReaded) {
            setTitleGray(mWaiMaiDianPing);
        }

        mTJFanCaiShiLu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTJFanCaiShiLuReaded = true;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2652978110"));
                startActivity(intent);
            }
        });

        mTJBenBuMeiShi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTJBenBuMeiShiReaded = true;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2514217755"));
                startActivity(intent);
            }
        });
        mHeiAnQuanJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHeiAnQuanJiReaded = true;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1951065953"));
                startActivity(intent);
            }
        });
        mWaiMaiDianPing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isWaiMaiDianPingReaded = true;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1742190716"));
                startActivity(intent);
            }
        });
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean(TJFCSL_TAG, isTJFanCaiShiLuReaded);
        savedInstanceState.putBoolean(TJBBMS_TAG, isTJBenBuMeiShiReaded);
        savedInstanceState.putBoolean(HAQJ_TAG, isHeiAnQuanJiReaded);
        savedInstanceState.putBoolean(WMDP_TAG, isWaiMaiDianPingReaded);

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, EatingAtSchool.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
