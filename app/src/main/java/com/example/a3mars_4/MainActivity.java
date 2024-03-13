package com.example.a3mars_4;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        ArrayList<DataRow> dataRows = new ArrayList<>();
        dataRows.add(new DataRow("Company Name", "QuantumTech Solutions"));
        dataRows.add(new DataRow("Background", "QuantumTech Solutions is a cutting-edge technology company specializing in advanced quantum computing solutions. Founded in 2018 by a team of visionary scientists and engineers, our mission is to harness the power of quantum mechanics to revolutionize industries and solve some of the world's most complex problems."));
        dataRows.add(new DataRow("Customers", "Fortune 500 companies, leading research institutions, government agencies"));
        dataRows.add(new DataRow("Social Media", "Facebook, Instagram, Twitter, Linkedin, Pinterest"));
        dataRows.add(new DataRow("Technology", "As pioneers in the field of quantum computing, we envision a future where quantum technology transforms industries, accelerates scientific discovery, and drives positive change worldwide. Through relentless innovation and a steadfast commitment to excellence, we are leading the charge towards a quantum-powered tomorrow. Join us on this exciting journey as we shape the future of computing together."));
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row_data, dataRows);
        listView.setAdapter(adapter);
    }
}
