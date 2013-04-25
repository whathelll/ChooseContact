package com.example.choosecontact;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;

public class ContactListCursorActivity extends ListActivity {

	@Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       String[] from = new String[] {ContactsContract.Contacts.DISPLAY_NAME,ContactsContract.Contacts.HAS_PHONE_NUMBER,ContactsContract.Contacts._ID};
       int[] to = new int[] {R.id.checkBox};
       
       ContactListCursorAdapter adapter = new ContactListCursorAdapter(getApplicationContext(), R.layout.listview,  null, from, to);
       setListAdapter(adapter);
    }
}
