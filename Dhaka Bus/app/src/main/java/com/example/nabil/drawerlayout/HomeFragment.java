package com.example.nabil.drawerlayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {



    private static final String[] Routes= new String[]{
            "Airport","Azampur","Abdullahpur","Aminbazar","Asad Gate","Ansar Camp","Aarong","Agargaon","Azimpur",
            "Arambag","Adabor","Adamjee College","Ashulia","Ashulia Bazar",
            "Bangla Motor","Banani","Bangla College","Bata Signal","Badda","Bashtola","Bijoy Sarani",
            "Bhulta","Bakshi Bazar","Babu Bazar","Barmi","Banasree","Baipayl","Bosila",
            "Basabo","Bashundhara","Bhashantek","Bashundhara R/A","Birulia","Beribadh",
            "Chairman Bari","College Gate","City College","Chiriakhana","Chandra","Chashara","Chankhar Pul","Chittagang Road",
            "CMH","Darussalam","Dayaganj Road","Dhanmondi 27","Dhanmondi 32","Dhamrai",
            "Dhanmondi 15","Dhakeshwari","Duaripara","Daynik Bangla Mor","Demra","Demra Staff Quarter","Dholaipar","Diabari","Dhour",
            "Dania","ECB Chattar","Elephant Road","Farmgate","Fulbaria","Fakirapul","Fantasy Kingdom","300 Feet",
            "Gulisthan","GPO","Gabtoli","Golap Shah Mazar","Gazipur","Gulshan Bridge","Gulshan 1","Gulshan 2",
            "Gandaria","Golapbag","Garrison","High Court","House Building","Hemayetpur","Hazaribag","Hatir Jheel",
            "Ittefaq","Jasimuddin","Jahangir Gate","Jamuna Future Park","Jatrabari","Jonopath","Jalkuri","Jigatola","Joydevpur",
            "Japan Garden City","Jurain","Jamgora","Kawran Bazar","Kuril Bishwa Road","Khilkhet","Kakoli",
            "Kallayanpur","Khamarbari","Kakrail","Kalshi","Katabon","Konabari","Kazipara","Kalabagan","Kamalapur",
            "Kanchpur","Khilgaon","Khilgaon Flyover","Kamarpara","Kodomtoli","Keraniganj",
            "Kochukhet","Kalampur","Kazla","Konabari","Kamrangirchar","Mazar Road","Motijheel","Motsho Bhobon",
            "Mohakhali","MES","Mirpur 1","Mirpur 2","Mirpur 10", "Mirpur 12","Mirpur 11","Mirpur 14","Moghbazar",
            "Mouchak","Malibagh Mor","Merul","Madhya Badda","Malibagh","Mohammadpur","Madanpur","Manik Nagar","Mirpur DOHS",
            "Mugdapara","Mill Gate","Manik Nagar","Mawa","Mograpara","Meghna Ghat","Matikata Road","Mirpur Cantonment","Mirpur 13","Matuail",
            "Mitford Ghat","Nabisko","Naya Bazar","Natun Bazar","Nadda","Nilkhet","New Market","Nobinagar","Nandan Park","Narayonganj",
            "Nawabganj","Paltan","Press Club","Postogola","Purobi","Pallabi",
            "Panthapath","Proshika Mor","Paturia","Rajlakshmi","Ray Shaheb Bazar","Rampura","Rampura Bridge",
            "Rajarbagh","Ring Road","Rupnagar","Rayerbag","Rayer Bazar","Rupnagar Abashik Mor","Shahbag","Shaheen College","Staff Road",
            "Station Road","Shibbari","Shainik Club","Savar","Shyamoli","Shishu mela","Sony Hall","Satrasta","Shantinagar",
            "Science Lab","Sadarghat","Shahjadpur","Sara 11","Shewrapara","Sayedabad","Shibu Market","Sign Board","Shonir Akhra",
            "Shankar","Star kabab","Sreepur","Shia Masjid","Sreepur","Signal","Saddam Market","Sikdar Medical","Section",
            "Showari Ghat","Shiyal Bari","Tongi","Technical","Tolarbag","Taltola","Tajmalahal Road",
            "Tikatuli","TT para","Uttar Badda Bazar","Wireless Mor","Workshop","Ziya Uddan","Zirabo"
    };




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    //private EditText sourceET;
   // private EditText destinationET;
   // private Button button;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
       //return inflater.inflate(R.layout.fragment_home, container, false);
          View view= inflater.inflate(R.layout.fragment_home, container, false);

          setupParent(view.findViewById(R.id.parent));

          Button button= (Button) view.findViewById(R.id.searchbutton);
          final AutoCompleteTextView sourceACTV =(AutoCompleteTextView) view.findViewById(R.id.sourceedittext);
          final AutoCompleteTextView destinationACTV=(AutoCompleteTextView) view.findViewById(R.id.destinationedittext);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line,Routes);
        sourceACTV.setAdapter(adapter);
        destinationACTV.setAdapter(adapter);


          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String et = sourceACTV.getText().toString() + " " + destinationACTV.getText().toString();
                  String srcet = sourceACTV.getText().toString();
                  String dstet = destinationACTV.getText().toString();


                if((srcet.length() ==2 ) || (dstet.length() == 2))
                  {
                      Toast.makeText(getActivity(), "Please enter correct source and destination", Toast.LENGTH_SHORT).show();
                  }
                  else if((srcet.length() ==1 ) || (dstet.length() == 1))

                  {
                      Toast.makeText(getActivity(), "Please enter correct source and destination", Toast.LENGTH_SHORT).show();
                  }

                  else if (srcet.isEmpty() || dstet.isEmpty())
                  {
                      Toast.makeText(getActivity(), "Please enter your source and destination", Toast.LENGTH_SHORT).show();
                  }
                  else {
                      Intent intent = new Intent(getActivity(), AfterSearchActivity.class);
                      intent.putExtra("InputedET", et);
                      intent.putExtra("sACTV", srcet);
                      intent.putExtra("dACTV", dstet);
                      startActivity(intent);
                  }
              }
          });
          return view;


    }

    protected void setupParent(View view){
        if(!(view instanceof EditText)){
            view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    hidekeyboard(view);
                    return false;
                }
            });
        }
    }



    public void hidekeyboard(View view) {
        InputMethodManager inputMethodManager= (InputMethodManager)getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),0);
    }





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
   // public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
   //     void onFragmentInteraction(Uri uri);



