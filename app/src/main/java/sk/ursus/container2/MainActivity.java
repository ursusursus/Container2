package sk.ursus.container2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sk.ursus.library.Foo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Foo.foo();
    }
}
