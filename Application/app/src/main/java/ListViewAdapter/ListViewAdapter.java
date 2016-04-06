package ListViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import sk.com.kcart.R;

/**
 * Created by karthikeyan on 05-Apr-16.
 */
public class ListViewAdapter extends BaseAdapter {
    //LayoutInflater inflate;
    Context cxt;
    int [] imageList;
    String[] nameList;
    public ListViewAdapter(Context cxt,int[] imageList,String[] nameList){
        this.cxt=cxt;
        this.imageList=imageList;
        this.nameList=nameList;
    }
    @Override
    public int getCount() {
        return imageList.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View mview = LayoutInflater.from(cxt).inflate(R.layout.custom_iteam, parent, false);
        ImageView mImageView = (ImageView) mview.findViewById(R.id.custom_image);
        TextView mTextView = (TextView) mview.findViewById(R.id.custom_text);
        mImageView.setImageResource(imageList[position]);
        mTextView.setText(nameList[position]);
        return mview;
    }
}
