package com.example.android.sba_slids_test1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class addressa_fragment extends Fragment {

    ArrayList<ipaddress> chart = new ArrayList<>();

    private ipaddressAdapter madapters;
    ListView listView2;

    public addressa_fragment(){

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list_aa, container, false);
//
//        subCal newsub = new subCal();
//        int bits = newsub.getBitss();
//
//        ipaddress lists = new ipaddress();
//        newsub.possiblenetwork(bits);
//
//
//        final ArrayList<ipaddress> ip = new ArrayList<>();
        //ArrayList<ipaddress> ips = new ArrayList<>();
//        ip.add(new ipaddress("Network Address", "Usable Host Min", "Usable Host Max", "Broadcast Address"));
//        ipaddressAdapter adapter = new ipaddressAdapter(getActivity(), ip, R.color.list_a);
//
//        ListView listView = rootView.findViewById(R.id.list);
//
//        listView.setAdapter(adapter);

        // ipss.add(new ipaddress(lists.getA(), lists.getB(), lists.getC(), lists.getD()));
//        chart.add(new ipaddress("Class",     "1st Octet Decimal Range",   "Default Subnet Mask",""));
//        chart.add(new ipaddress("A",     "1 - 126*",     "255.0.0.0",""));
//        chart.add(new ipaddress("B",      " 128 - 191",   "255.255.0.0",""));
//        chart.add(new ipaddress("C",      " 192 - 223",    "255.255.255.0",""));
//        chart.add(new ipaddress("D",      "   224 - 239",    "     Reserved for Multicasting",""));
//        ipaddressAdapter adapter2 = new ipaddressAdapter(getActivity(), chart, R.color.list_a);
//
//        listView2 = (ListView) rootView.findViewById(R.id.list);
//
////        madapters = new ipaddressAdapter(getActivity());
////        madapters.setDate(getDate());
//        listView2.setAdapter(adapter2);

        return rootView;
    }

//    public View View(LayoutInflater inflater, ViewGroup container,
//                        Bundle savedInstanceState){
//        View convertView = inflater.inflate(R.layout.ip_list,  container, false);
//        chart.add(new ipaddress("N/A","N/A", "N/A", "N/A"));
//
//        ipaddressAdapter adapter2 = new ipaddressAdapter(getActivity(), chart, R.color.list_a);
//
//        ListView listView2 = convertView.findViewById(R.id.list);
//
//        listView2.setAdapter(adapter2);
//        return convertView;




}


/*
        chart.add(new ipaddress("Class",     "1st Octet Decimal Range",   "Default Subnet Mask",""));
        chart.add(new ipaddress("A",     "1 - 126*",     "255.0.0.0",""));
        chart.add(new ipaddress("B",      "128 - 191",   "255.255.0.0",""));
        chart.add(new ipaddress("C",      "192 - 223",    "255.255.255.0",""));
        chart.add(new ipaddress("D",      "224 - 239",    "Reserved for Multicasting",""));

 */