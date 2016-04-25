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
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.NavigatieToSchool.java
 * @author: yyxyz
 * @date: 2016-04-25 13:04
 */
public class NavigatieToSchool extends BaseActivity {
    private static final String TAG = "NavigatieToSchool";
    @Bind(R.id.xin_sheng_kai_xue_tips)
    TextView mXinShengKaiXueTips;
    @Bind(R.id.xin_sheng_dao_xiang_web)
    TextView mXinShengDaoXiangWeb;
    @Bind(R.id.network_in_school)
    TextView mNetworkInSchool;
    @Bind(R.id.bei_fang_tong_xue_tips)
    TextView mBeiFangTongXueTips;
    @Bind(R.id.TJ_sheng_huo_gai_kuang)
    TextView mTJShengHuoGaiKuang;
    @Bind(R.id.need_to_know_in_TJ)
    TextView mNeedToKnowInTJ;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        mXinShengKaiXueTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1829347558"));
                startActivity(intent);
            }
        });

        mXinShengDaoXiangWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1822586282"));
                startActivity(intent);
            }
        });
        mNetworkInSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1772735658"));
                startActivity(intent);
            }
        });
        mBeiFangTongXueTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/445441327"));
                startActivity(intent);
            }
        });
        mTJShengHuoGaiKuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1673011250"));
                startActivity(intent);
            }
        });
        mNeedToKnowInTJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2503111760"));
                startActivity(intent);
            }
        });

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, NavigatieToSchool.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

}
