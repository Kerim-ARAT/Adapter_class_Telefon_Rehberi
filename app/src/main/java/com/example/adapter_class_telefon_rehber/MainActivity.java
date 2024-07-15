package com.example.adapter_class_telefon_rehber;

import static com.example.adapter_class_telefon_rehber.R.id.mrecyclerView;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<data> dataModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recyclerView = findViewById(R.id.mrecyclerView);
        setUpDAtaModel();
        Data_Adapter adapter = new Data_Adapter(this, dataModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpDAtaModel() {
        String[] dataAciName = getResources().getStringArray(R.array.isimler);
        String[] dataAciDurum = getResources().getStringArray(R.array.durumlar);
        for (int i = 0; i < dataAciName.length; i++) {
          dataModel.add(new data(dataAciName[i],dataAciDurum[i]));
        }

    }
}