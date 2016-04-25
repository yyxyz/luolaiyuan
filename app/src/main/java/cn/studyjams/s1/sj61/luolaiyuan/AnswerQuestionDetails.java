package cn.studyjams.s1.sj61.luolaiyuan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: cn.studyjams.s1.sj61.luolaiyuan.AnswerQuestionDetails.java
 * @author: yyxyz
 * @date: 2016-04-25 12:04
 */
public class AnswerQuestionDetails extends BaseActivity {
    private static final String TAG = "AnswerQuestionDetails";
    @Bind(R.id.help_detail_title)
    TextView mHelpDetailTitle;
    @Bind(R.id.help_detail_context)
    TextView mHelpDetailContext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_detail);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        Intent intent = getIntent();
        switch (intent.getStringExtra("param1")){
            case "yiKaTong":
                mHelpDetailTitle.setText(getText(R.string.yi_ka_tong_question));
                mHelpDetailContext.setText(getText(R.string.yi_ka_tong_answer_text));
                break;
            case "kongTiao":
                mHelpDetailTitle.setText(getText(R.string.kong_tiao_question));
                mHelpDetailContext.setText(getText(R.string.kong_tiao_answer_text));
                break;
            case "kuanDai":
                mHelpDetailTitle.setText(getText(R.string.kuan_dai_question));
                mHelpDetailContext.setText(getText(R.string.kuan_dai_answer_text));
                break;
            default:
                break;
        }

    }

    public static void actionStart(Context context, String data1) {
        Intent intent = new Intent(context, AnswerQuestionDetails.class);
        intent.putExtra("param1", data1);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
