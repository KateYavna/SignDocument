package com.example.signdocument;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Document document = new Document("Main news", "Today we have a strange news");
        document.print();
        SignedDocument signedDocument = new SignedDocument("Main news", "Today we have a strange news","Observer");
        signedDocument.print();
        DataDocument dataDocument = new DataDocument("Main news", "Today we have a strange news","ninth of June");
        dataDocument.print();
        DataSignedDocument dataSignedDocument = new DataSignedDocument("Main news", "Today we have a strange news","Observer","ninth of June" );
        dataSignedDocument.print();
        document.save();
        signedDocument.save();
        dataDocument.save();
        dataSignedDocument.save();
        Human human = new Human("Peter", "Parker");
        Worker worker = new Worker("Peter", "Parker");
        String signature = worker.creatingSignature();
        SignedDocument newsignedDocument = new SignedDocument("Main news", "Today we have a strange news",signature);
        newsignedDocument.print();
        DataSignedDocument newdataSignedDocument = new DataSignedDocument("Main news", "Today we have a strange news",signature,"ninth of June" );
        newdataSignedDocument.print();
    }
}