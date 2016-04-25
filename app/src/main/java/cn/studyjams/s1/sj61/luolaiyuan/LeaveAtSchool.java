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
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.LeaveAtSchool.java
 * @author: yyxyz
 * @date: 2016-04-25 13:03
 */
public class LeaveAtSchool extends BaseActivity {
    private static final String TAG = "LeaveAtSchool";
    @Bind(R.id.su_she)
    TextView mSuShe;
    @Bind(R.id.xi_nan_shi_su_she)
    TextView mXiNanShiSuShe;
    @Bind(R.id.xing_li_question)
    TextView mXingLiQuestion;
    @Bind(R.id.jia_ding_xiao_qu_jian_jie)
    TextView mJiaDingXiaoQuJianJie;
    @Bind(R.id.ben_bu_zhou_bian_bin_guan)
    TextView mBenBuZhouBianBinGuan;
    @Bind(R.id.kao_sheng_ding_jiu_dian_can_kao)
    TextView mKaoShengDingJiuDianCanKao;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        mSuShe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/3257675692"));
                startActivity(intent);
            }
        });
        mXiNanShiSuShe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2567622181"));
                startActivity(intent);
            }
        });
        mXingLiQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/1799584583"));
                startActivity(intent);
            }
        });
        mJiaDingXiaoQuJianJie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2328856982"));
                startActivity(intent);
            }
        });
        mBenBuZhouBianBinGuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/3018321593"));
                startActivity(intent);
            }
        });
        mKaoShengDingJiuDianCanKao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tieba.baidu.com/p/2469647169"));
                startActivity(intent);
            }
        });

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, LeaveAtSchool.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
