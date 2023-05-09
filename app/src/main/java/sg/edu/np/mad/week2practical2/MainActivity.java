package sg.edu.np.mad.week2practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button follow = findViewById(R.id.follow);
        user user1 = new user();
        user1.followed = false;

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.followed == false){
                    follow.setText("UNFOLLOW");
                    user1.followed = true;
                }
                else {
                    follow.setText("FOLLOW");
                    user1.followed = false;
                }
            }
        });
    }
}