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
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.LearningAtSchool.java
 * @author: yyxyz
 * @date: 2016-04-25 13:02
 */
public class LearningAtSchool extends BaseActivity {
    private static final String TAG = "LearningAtSchool";
    @Bind(R.id.xue_zhang_kan_zhuan_ye)
    TextView mXueZhangKanZhuanYe;
    @Bind(R.id.english_mian_xiu)
    TextView mEnglishMianXiu;
    @Bind(R.id.fu_xiu_ke_cheng)
    TextView mFuXiuKeCheng;
    @Bind(R.id.bao_yan_jiang_xue_jing)
    TextView mBaoYanJiangXueJing;
    @Bind(R.id.tu_shu_guan)
    TextView mTuShuGuan;
    @Bind(R.id.ji_dian_xuan_xiu)
    TextView mJiDianXuanXiu;
    @Bind(R.id.xuan_xiu_ke_ping_jia)
    TextView mXuanXiuKePingJia;
    @Bind(R.id.gong_gong_ke_tui_jian)
    TextView mGongGongKeTuiJian;
    @Bind(R.id.hao_lao_shi)
    TextView mHaoLaoShi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        mXueZhangKanZhuanYe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/3816091211"));
                startActivity(intent);
            }
        });
        mEnglishMianXiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2499247313"));
                startActivity(intent);
            }
        });
        mFuXiuKeCheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2332740934"));
                startActivity(intent);
            }
        });
        mBaoYanJiangXueJing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2813944389"));
                startActivity(intent);
            }
        });
        mTuShuGuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2595293205"));
                startActivity(intent);
            }
        });
        mJiDianXuanXiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2792933655"));
                startActivity(intent);
            }
        });
        mXuanXiuKePingJia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1672904995"));
                startActivity(intent);
            }
        });
        mGongGongKeTuiJian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/3742258576"));
                startActivity(intent);
            }
        });
        mHaoLaoShi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/3521339380"));
                startActivity(intent);
            }
        });

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, LearningAtSchool.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
