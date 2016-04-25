package cn.studyjams.s1.sj61.luolaiyuan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.AnswerQuestion.java
 * @author: yyxyz
 * @date: 2016-04-25 11:51
 */
public class AnswerQuestion extends BaseActivity {
    private static final String TAG = "AnswerQuestion";
    private static final String YKT_TAG = "YiKaTong";
    private static final String KTT_TAG = "KongTiaoText";
    private static final String KDT_TAG = "KuanDaiText";

    @Bind(R.id.yi_ka_tong_text_view)
    TextView mYiKaTongTextView;
    @Bind(R.id.kong_tiao_text_view)
    TextView mKongTiaoTextView;
    @Bind(R.id.kuan_dai_text_view)
    TextView mKuanDaiTextView;


    private boolean isYikaTongReaded;
    private boolean isKongTiaoTextReaded;
    private boolean isKuanDaiTextReaded;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);
        if (savedInstanceState != null) {
            isYikaTongReaded = savedInstanceState.getBoolean(YKT_TAG);
            isKongTiaoTextReaded = savedInstanceState.getBoolean(KTT_TAG);
            isKuanDaiTextReaded = savedInstanceState.getBoolean(KDT_TAG);
        } else {
            isYikaTongReaded = false;
            isKongTiaoTextReaded = false;
            isKuanDaiTextReaded = false;
        }

        if (isYikaTongReaded) {
            setTitleGray(mYiKaTongTextView);
        }
        if (isKongTiaoTextReaded) {
            setTitleGray(mKongTiaoTextView);
        }
        if (isKuanDaiTextReaded) {
            setTitleGray(mKuanDaiTextView);
        }

        mYiKaTongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isYikaTongReaded = true;
                AnswerQuestionDetails.actionStart(AnswerQuestion.this, "yiKaTong");
            }
        });

        mKongTiaoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isKongTiaoTextReaded = true;
                AnswerQuestionDetails.actionStart(AnswerQuestion.this, "kongTiao");
            }
        });

        mKuanDaiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isKuanDaiTextReaded = true;
                AnswerQuestionDetails.actionStart(AnswerQuestion.this, "kuanDai");
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean(YKT_TAG, isYikaTongReaded);
        savedInstanceState.putBoolean(KTT_TAG, isKongTiaoTextReaded);
        savedInstanceState.putBoolean(KDT_TAG, isKuanDaiTextReaded);

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, AnswerQuestion.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
