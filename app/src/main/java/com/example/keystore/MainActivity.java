package com.example.keystore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Timber.plant(new Timber.DebugTree());

    String value = "Password/Token to be encrypted"; // "Password/Token to be encrypted"

    String encryptedValue = EncryptionUtils.encrypt(this, value);
    Timber.d(" Encrypted Value :" + encryptedValue); // DwMVRTJ_4gSSPv39CXsw_dolsLNPYB7kQk1f4i4JuEGHM-3mC-h2ofiFhZ6JGQ==

    String decryptedValue = EncryptionUtils.decrypt(this, encryptedValue);
    Timber.d(" Decrypted Value :" + decryptedValue);
  }
}

// "Password/Token to be encrypted" DwMVRTJ_4gSSPv39CXsw_dolsLNPYB7kQk1f4i4JuEGHM-3mC-h2ofiFhZ6JGQ==
// "Password/Token to be encrypted" DwMVRTJ_4gSSPv39CXsw_dolsLNPYB7kQk1f4i4JuEGHM-3mC-h2ofiFhZ6JGQ==
// Pippozzo DwsWRipq6g9amwLNQKc_V5TSSbxHUc0Z
