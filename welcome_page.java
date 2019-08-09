package rcew.khelo_or_jeeto;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class welcome_page extends AppCompatActivity {
    SharedPreferences s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

      TextView  tv = (TextView)findViewById(R.id.textView3);
       TextView  tv1 = (TextView)findViewById(R.id.textView);
       TextView tv2 = (TextView)findViewById(R.id.textView2);


        s=getSharedPreferences("sp",0);
        final String user=s.getString("k1",null);
        final String password=s.getString("k2",null);

        tv1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(user!=null && password!=null) {
                            Intent obj = new Intent(welcome_page.this, condition_admin.class);
                            startActivity(obj);
                        }
                        else
                        {
                            Intent obj = new Intent(welcome_page.this,admin_login.class);
                            startActivity(obj);
                        }
                    }
                }
        );

        tv2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent kk = new Intent(welcome_page.this,user_login.class);
                        startActivity(kk);

                    }
                }
        );
    }
}
