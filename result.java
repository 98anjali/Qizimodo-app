package rcew.khelo_or_jeeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static rcew.khelo_or_jeeto.terms_user.s1;
import static rcew.khelo_or_jeeto.user_test.count;
import static rcew.khelo_or_jeeto.user_test.count1;
import static rcew.khelo_or_jeeto.user_test.count2;
import static rcew.khelo_or_jeeto.user_test.p;
import static rcew.khelo_or_jeeto.user_test.x;
import static rcew.khelo_or_jeeto.user_test.y;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
      TextView  t1=(TextView)findViewById(R.id.textView14);
        TextView  t2=(TextView)findViewById(R.id.textView15);
        TextView  t3=(TextView)findViewById(R.id.textView16);
        TextView  t4=(TextView)findViewById(R.id.textView7);
        TextView  t5=(TextView)findViewById(R.id.textView8);
        TextView  t6=(TextView)findViewById(R.id.textView9);
        TextView  t7=(TextView)findViewById(R.id.textView12);

        if(s1.equals("Java")){
            String f = String.valueOf(p -1);
            t1.setText(f);
            t2.setText(""+count);
            double j= (double)(p-1);
            double g = (count/j)*100;
            t3.setText(""+g+"%");
            g=0;
            p=1;
            count=0;
        }
        else if(s1.equals("C")){
            String f = String.valueOf(x-1);
            t1.setText(f);
            t2.setText(""+count1);
            double j= (double)(x-1);
            double g = (count1/j)*100;
            t3.setText(""+g+"%");
            g=0;
            x=1;
            count1=0;
        }
        else
        {

            String f = String.valueOf(y-1);
            t1.setText(f);
            t2.setText(""+count2);
            double j= (double)(y-1);
            double g = (count2/j)*100;
            t3.setText(""+g+"%");
            g=0;
            y=1;
            count2=0;
        }
    }
}
