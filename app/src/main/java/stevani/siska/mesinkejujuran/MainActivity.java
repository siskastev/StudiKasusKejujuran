package stevani.siska.mesinkejujuran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menempelkan fragment
        FragmentManager fm = getSupportFragmentManager();

        //buka  fragmentnya
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame1, new FragmentSatu());
        ft.add(R.id.frame2, new FragmentDua());
        //laksanakan
        ft.commit();
    }
}
