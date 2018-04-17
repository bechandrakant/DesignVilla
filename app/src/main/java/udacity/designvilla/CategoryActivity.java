package udacity.designvilla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CategoryActivity extends AppCompatActivity {
    private LinearLayout singleScreenAppActivity;
    private LinearLayout justJavaAppActivity;
    private LinearLayout courtCounterAppActivity;
    private LinearLayout justJavaAppWithLocalizationActivity;
    private LinearLayout quizAppActivity;
    private LinearLayout miscellaneousActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        singleScreenAppActivity = findViewById(R.id.single_screen_apps);
        justJavaAppActivity = findViewById(R.id.just_java_apps);
        courtCounterAppActivity = findViewById(R.id.court_counter_apps);
        justJavaAppWithLocalizationActivity = findViewById(R.id.just_java_apps_with_localization);
        quizAppActivity = findViewById(R.id.quiz_apps);
        miscellaneousActivity = findViewById(R.id.miscellaneous);

        singleScreenAppActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.single_screen_apps);
                startActivity(intent);
            }
        });

        justJavaAppActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.just_java_apps);
                startActivity(intent);
            }
        });

        courtCounterAppActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.court_counter_apps);
                startActivity(intent);
            }
        });

        justJavaAppWithLocalizationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.just_java_apps_with_localization);
                startActivity(intent);
            }
        });

        quizAppActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.quiz_apps);
                startActivity(intent);
            }
        });

        miscellaneousActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, AppShowcaseActivity.class);
                intent.putExtra("id", R.id.miscellaneous);
                startActivity(intent);
            }
        });
    }
}
