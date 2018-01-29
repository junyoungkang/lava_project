package modacom.co.kr.androidprogramming;

import android.app.Activity;
import android.os.Bundle;

public class CheatActivity extends Activity {

    private static final String EXTRA_ANSWER_IS_TRUE = "modacom.co.kr.androidprogramming.answer_is_true";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
    }
}
