package work.project.james.andelafirstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.myProfile);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             LoadProfile();
            }
        });


        Button btn2 = (Button)findViewById(R.id.aboutAlc);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadPage();
            }
        });
    }







    public void LoadProfile(){
        Intent intent1 = new Intent(this,ProfilePage.class);
        startActivity(intent1);
    }
    public void LoadPage(){
        Intent intent2 = new Intent(this,AboutALC.class);
        startActivity(intent2);
    }






}
