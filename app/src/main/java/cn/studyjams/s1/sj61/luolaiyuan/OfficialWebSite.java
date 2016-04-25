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
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.OfficialWebSite.java
 * @author: yyxyz
 * @date: 2016-04-25 13:04
 */
public class OfficialWebSite extends BaseActivity {
    private static final String TAG = "OfficialWebSite";
    @Bind(R.id.index_of_TJ)
    TextView mIndexOfTJ;
    @Bind(R.id.ben_ke_zhao_sheng_web)
    TextView mBenKeZhaoShengWeb;
    @Bind(R.id.ben_yan_yi_ti_hua)
    TextView mBenYanYiTiHua;
    @Bind(R.id.jiao_wu_xin_xi_guan_li)
    TextView mJiaoWuXinXiGuanLi;
    @Bind(R.id.jiao_wu_chu_web)
    TextView mJiaoWuChuWeb;
    @Bind(R.id.hou_qing_web)
    TextView mHouQingWeb;
    @Bind(R.id.email_web)
    TextView mEmailWeb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official_website);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        mIndexOfTJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mBenKeZhaoShengWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://bkzs.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mBenYanYiTiHua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://4m3.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mJiaoWuXinXiGuanLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://xuanke.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mJiaoWuChuWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("heep://jwc.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mHouQingWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://hq.tongji.edu.cn"));
                startActivity(intent);
            }
        });
        mEmailWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://mail.tongji.edu.cn"));
                startActivity(intent);
            }
        });

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, OfficialWebSite.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
