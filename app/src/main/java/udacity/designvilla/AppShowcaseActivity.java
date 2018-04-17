package udacity.designvilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

public class AppShowcaseActivity extends AppCompatActivity {

    private LinearLayout flipLayout1;
    private LinearLayout flipLayout2;

    private ScaleAnimation sato0 = new ScaleAnimation(1, 0, 1, 1,
            Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT,
            0.5f);
    private ScaleAnimation sato1 = new ScaleAnimation(0, 1, 1, 1,
            Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT,
            0.5f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        int id = extras.getInt("id");

        switch (id) {
            case R.id.single_screen_apps:
                setTitle(R.string.single_screen_apps);
                break;
            case R.id.just_java_apps:
                setTitle(R.string.just_java_apps);
                break;
            case R.id.court_counter_apps:
                setTitle(R.string.court_counter_apps);
                break;
            case R.id.just_java_apps_with_localization:
                setTitle(R.string.just_java_apps_with_localization);
                break;
            case R.id.quiz_apps:
                setTitle(R.string.quiz_apps);
                break;
            case R.id.miscellaneous:
                setTitle(R.string.miscellaneous);
                break;
            default:
                setTitle("App Showcase Activity");
                break;
        }

        setContentView(R.layout.activity_app_showcase);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initView();
        findViewById(R.id.root).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flipLayout1.getVisibility() == View.VISIBLE) {
                    flipLayout1.startAnimation(sato0);
                }else{
                    flipLayout2.startAnimation(sato0);
                }
            }
        });
    }

    private void showFlipLayout1(){
        flipLayout1.setVisibility(View.VISIBLE);
        flipLayout2.setVisibility(View.INVISIBLE);
    }

    private void showFlipLayout2(){
        flipLayout1.setVisibility(View.INVISIBLE);
        flipLayout2.setVisibility(View.VISIBLE);
    }

    private void initView(){
        flipLayout1 = findViewById(R.id.flip_hello_android_1);
        flipLayout2 = findViewById(R.id.flip_hello_android_2);
        showFlipLayout1();
        sato0.setDuration(300);
        sato1.setDuration(300);

        sato0.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (flipLayout1.getVisibility() == View.VISIBLE) {
                    flipLayout1.setAnimation(null);
                    showFlipLayout2();
                    flipLayout2.startAnimation(sato1);
                }else{
                    flipLayout2.setAnimation(null);
                    showFlipLayout1();
                    flipLayout1.startAnimation(sato1);
                }
            }
        });
    }
}
