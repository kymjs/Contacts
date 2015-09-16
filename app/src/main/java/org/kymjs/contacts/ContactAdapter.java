package org.kymjs.contacts;

import android.widget.AbsListView;

import org.kymjs.contacts.bean.Contact;
import org.kymjs.kjframe.KJBitmap;
import org.kymjs.kjframe.widget.AdapterHolder;
import org.kymjs.kjframe.widget.KJAdapter;

import java.util.Collection;

/**
 * @author kymjs (http://www.kymjs.com/) on 9/16/15.
 */
public class ContactAdapter extends KJAdapter<Contact> {

    private KJBitmap kjb = new KJBitmap();
    
    public ContactAdapter(AbsListView view, Collection<Contact> mDatas) {
        super(view, mDatas, R.layout.item_list_contact);
    }

    @Override
    public void convert(AdapterHolder holder, Contact item, boolean isScrolling) {
        holder.setText(R.id.contact_title, item.getName());
        holder.setImageByUrl(kjb, R.id.contact_head, item.getUrl());
    }
}
