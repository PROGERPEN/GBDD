package recepty.paragraph.com.gbdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
public class IntoActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addSlide(SampleSlide.newInstance(R.layout.slide_sample));

        addSlide(AppIntroFragment.newInstance(
                "GBDD",
                "push",
                R.drawable.wt_push_pad,
                R.drawable.wt_background));

        addSlide(AppIntroFragment.newInstance(
                "GBDD",
                "push",
                R.drawable.wt_push_pad,
                R.drawable.wt_background));

        addSlide(AppIntroFragment.newInstance(
                "GBDD",
                "push",
                R.drawable.wt_push_pad,
                R.drawable.wt_background));

        addSlide(AppIntroFragment.newInstance(
                "GBDD",
                "push",
                R.drawable.wt_push_pad,
                R.drawable.wt_background));

        addSlide(AppIntroFragment.newInstance(
                "GBDD",
                "push",
                R.drawable.wt_push_pad,
                R.drawable.wt_background));

    }
}
