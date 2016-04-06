package Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import ListViewAdapter.ListViewAdapter;
import sk.com.kcart.R;
import sk.com.kcart.Utill;

/**
 * Created by karthikeyan on 06-Apr-16.
 */
public class GenralFragment extends Fragment {

    private ListViewAdapter madapter;
    String tittle ;
    public GenralFragment(String tittle) {
        this.tittle=tittle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.clist_view,container,false);
        ListView mListView = (ListView) mView.findViewById(R.id.lview);
        switch (tittle.toLowerCase()) {
            case "bike":
                madapter = new ListViewAdapter(getActivity(), Utill.bikeImageList, Utill.bikeNameList);
                mListView.setAdapter(madapter);
                break;
            case "car":
                madapter = new ListViewAdapter(getActivity(), Utill.carImageList, Utill.carNameList);
                mListView.setAdapter(madapter);
                break;
            case "fruit":
                madapter = new ListViewAdapter(getActivity(), Utill.fruitImageList, Utill.fruitNameList);
                mListView.setAdapter(madapter);
                break;
            case "mobile":
                madapter = new ListViewAdapter(getActivity(), Utill.mobileImageList, Utill.mobileNameList);
                mListView.setAdapter(madapter);
                break;
            case "dress":
                madapter = new ListViewAdapter(getActivity(), Utill.dressImageList, Utill.dressNameList);
                mListView.setAdapter(madapter);
                break;
        }

        return mView;
    }
}
