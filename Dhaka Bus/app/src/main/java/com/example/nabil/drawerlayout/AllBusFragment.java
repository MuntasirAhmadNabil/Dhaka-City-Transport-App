package com.example.nabil.drawerlayout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AllBusFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AllBusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllBusFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AllBusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllBusFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AllBusFragment newInstance(String param1, String param2) {
        AllBusFragment fragment = new AllBusFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_all_bus, container, false);

        String[] busitems= {"13 No","6 No","7 No","8 No","Achim Paribahan","Agradut","Airport Bangabandhu Avenue","Akik Paribahan",
                "Al Modina Plus One","Al Mokka Transport","Alif Enterprise","Alif Enterprise 2","Alif Enterprise 3","Alike",
                "Anabil","Ashirbad Paribahan","Ashulia Classic","Asmani Paribahan","Ayat","Azmery Glory","BRTC","BRTC 2","BRTC 3","BRTC 4","BRTC 5","BRTC 6",
                "Bahon","Balaka Paribahan","Basumati Transport","Best Transport","Bhuiyan Paribahan","Bihango Paribahan","Bihango Paribahan 2",
                "Bikalpo Auto Service","Bikalpo City Super Service","Bikash Parihaban","Boishakhi Paripahan","Bondhu Paribahan","Bornomala Paribahan",
                "Brothers","Cantonment Mini Service","Champion","D Link","D One Transport","Dewan","Dhaka Paribahan","Dhakar Chaka","Dipon",
                "Dishari Paribahan","Druti Paribahan","ETC Transport","Everest Paribahan","FTCL","First Ten","Galaxy Line","Gazipur Paribahan",
                "Grameen","Grameen Shubheccha","Green Dhaka","Haji Transport","Himachol","Intercity","Itihas Paribahan","Itihas Paribahan 2",
                "J M Super Paribahan","Jabale Nur Paribahan","Jabale Nur Paribahan 2","Janjabil","Kanak","Khajababa Paribahan","Labbaik",
                "Lams Paribahan","MTCL 2","Malancha Transport","Manjil Express","Meghla Transport","Meshkat Transport","Midway","Mirpur Link",
                "Mirpur Link 2","Mirpur Metro Service","Mirpur United Service","Modhumoti Paribahan","Mohona","Moitri","Moumita Transport",
                "Nilachol","Nobokoli Paribahan","Nur E Mokka Paribahan","Omama International","One Transport","Pallabi Super Service",
                "Paristhan Paribahan","Prattay","Pravati Banasree Paribahan","Prochesta","Projapoti Paribahan","Rabrab Paribahan","Raida",
                "Raja City","Rajanigandha","Rajdhani Super Service","Rangdhonu Paribahan","Roich","Ramjan","Runway Express","Rupa Paribahan",
                "Rupkotha Paribahan","Safety Enterprise","Salsabil","Savar Paribahan","Shadhin","Shadhin Express","Shahria Enterprise",
                "Shatabdi Transport","Shikhar Paribahan","Shikor Paribahan","Shubheccha","Shuvojatra","Skyline","Somota Paribahan","Somoy",
                "Somoy Niyantran","Supravat Special Service","Swajan Paribahan","Tanjil Paribahan","Taranga Plus","Tetuliya Paribahan",
                "The New Vision","Thikana","Trans Silva","Trust Transport Service","Trust Transport Service 2","Turag","VIP 27","Victor Classic",
                "Victor Paribahan","Welcome","Winner Transport Co","Zarif"

        };

        final ListView listView= (ListView) view.findViewById(R.id.allBusListView);

        ArrayAdapter<String>listViewAdapter;
        listViewAdapter = new ArrayAdapter<String>(
                getContext(), R.layout.single_bus_row, R.id.busTextView, busitems
        );

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent= new Intent(getActivity(),AfterallBusFragmentActivity.class);
                intent.putExtra("Bus Name", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(listViewAdapter);

        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
