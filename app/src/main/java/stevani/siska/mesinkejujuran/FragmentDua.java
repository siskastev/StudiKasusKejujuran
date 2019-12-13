package stevani.siska.mesinkejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentDua extends Fragment {

    View iklan;
    Button gotoiklan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        iklan = inflater.inflate(R.layout.activity_fragment_dua,container,false);
        gotoiklan = iklan.findViewById(R.id.btnIklan);
        gotoiklan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intentimplisit = menghubungkan dengan aplikasi lain
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.traveloka.com/en/"));
                startActivity(i);
            }
        });
        return iklan;
    }
}
