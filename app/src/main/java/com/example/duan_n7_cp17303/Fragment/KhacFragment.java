package com.example.duan_n7_cp17303.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.duan_n7_cp17303.Adapter.SanPhamAdapter;
import com.example.duan_n7_cp17303.DAO.Daosanpham;
import com.example.duan_n7_cp17303.DTO.Sanpham;
import com.example.duan_n7_cp17303.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KhacFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KhacFragment extends Fragment {
    private GridView recyclerView;
    Daosanpham daosanpham = new Daosanpham();
    List<Sanpham> list;
    SanPhamAdapter adapter;
    public KhacFragment() {
        // Required empty public constructor
    }


    public static KhacFragment newInstance() {
        KhacFragment fragment = new KhacFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_khac, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.id_recyclerViewKhac);
        list = daosanpham.getAllKhac();
        adapter = new SanPhamAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
    }
}