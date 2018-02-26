package com.example.notandi.inclasscontentprovider;

import android.app.ListActivity;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class ContactsActivity extends ListActivity {

    private Cursor mCursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_contacts);

        mCursor = this.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,
                null, null, null, null);

        ListAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.two_line_list_item,
                mCursor,
                new String[]{ContactsContract.Contacts._ID,
                             ContactsContract.Contacts.DISPLAY_NAME},
                new int[]{ android.R.id.text1, android.R.id.text2});

        setListAdapter(adapter);
    }
}
