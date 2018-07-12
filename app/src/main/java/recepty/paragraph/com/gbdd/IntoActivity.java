package recepty.paragraph.com.gbdd;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
public class IntoActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addSlide(SampleSlide.newInstance(R.layout.slide_sample));
        addSlide(SampleSlide.newInstance(R.layout.slide_sample2));
        addSlide(SampleSlide.newInstance(R.layout.slide_sample3));
        addSlide(SampleSlide.newInstance(R.layout.slide_sample4));
        addSlide(SampleSlide.newInstance(R.layout.slide_sample5));
        addSlide(SampleSlide.newInstance(R.layout.slide_sample6));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
}
