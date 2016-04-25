package cn.studyjams.s1.sj61.luolaiyuan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Bind(R.id.navigation_button)
    Button mNavigationButton;
    @Bind(R.id.eating_in_school_button)
    Button mEatingInSchoolButton;
    @Bind(R.id.leaving_in_school_button)
    Button mLeavingInSchoolButton;
    @Bind(R.id.study_in_school_button)
    Button mStudyInSchoolButton;
    @Bind(R.id.official_website_button)
    Button mOfficialWebsiteButton;
    @Bind(R.id.question_button)
    Button mQuestionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);

        mNavigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigatieToSchool.actionStart(MainActivity.this, "");
            }
        });

        mEatingInSchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EatingAtSchool.actionStart(MainActivity.this, "");
            }
        });

        mLeavingInSchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeaveAtSchool.actionStart(MainActivity.this, "");
            }
        });

        mStudyInSchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LearningAtSchool.actionStart(MainActivity.this, "");
            }
        });

        mOfficialWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OfficialWebSite.actionStart(MainActivity.this, "");
            }
        });

        mQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerQuestion.actionStart(MainActivity.this, "");
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    public void onBackPressed(){
        super.onBackPressed();
        ActivityCollector.finishAll();
    }
}
