package com.example.keystore;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Timber.plant(new Timber.DebugTree());

    String value = "pippozzo"; // "Password/Token to be encrypted"

    String encryptedValue = EncryptionUtils.encrypt(this, value);
    Timber.d(" Encrypted Value :" + encryptedValue);

    String decryptedValue = EncryptionUtils.decrypt(this, encryptedValue);
    Timber.d(" Decrypted Value :" + decryptedValue);

    Toast.makeText(this, "IN: "+value+"\n\nCript: "+encryptedValue+"Decript: "+decryptedValue, Toast.LENGTH_LONG).show();

    TextView textView = (TextView) findViewById(R.id.textView);
    textView.setText("Stringa in ingresso: "+value+"\nStringa Criptata: "+encryptedValue+"\nStringa Decriptata: "+decryptedValue);
  }
}

// risultati
// "Password/Token to be encrypted" DwMVRTJ_4gSSPv39CXsw_dolsLNPYB7kQk1f4i4JuEGHM-3mC-h2ofiFhZ6JGQ==
// Pippozzo DwsWRipq6g9amwLNQKc_V5TSSbxHUc0Z
// pippozzo LwsWRipq6g_-2O62-GEOb4F6ysuElns7
