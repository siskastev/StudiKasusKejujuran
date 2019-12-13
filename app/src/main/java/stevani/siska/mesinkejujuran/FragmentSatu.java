package stevani.siska.mesinkejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.Inflater;

public class FragmentSatu extends Fragment {

    View tampilan;
    EditText input;
    TextView hasil;
    Button sumbit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tampilan = inflater.inflate(R.layout.activity_fragment_satu,container,false);
        input = tampilan.findViewById(R.id.input1);
        hasil = tampilan.findViewById(R.id.text1);
        sumbit = tampilan.findViewById(R.id.btn1);

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tampunginput = input.getText().toString();
                String[] arrayTampungan = tampunginput.split(" ");
                String hasilinput = "";
                for (int i =arrayTampungan.length-1; i > 0 ; i--)
                {
                    if (arrayTampungan[i].equals("Bohong"))// jika nilai bohong dia harus mengubah nilai sebelumny menjadi kebalikannya, tapi jika jujur nilainya tetap
                    {
                        if (arrayTampungan[i-1].equals("Bohong"))
                        {
                            arrayTampungan[i-1]="Jujur";
                        }
                        else  if (arrayTampungan[i-1].equals("Jujur"))
                        {
                            arrayTampungan[i-1]="Bohong";
                        }
                    }
                }
                hasilinput = arrayTampungan[0];
                hasil.setText(hasilinput);
            }
        });
        return tampilan;
    }
}
