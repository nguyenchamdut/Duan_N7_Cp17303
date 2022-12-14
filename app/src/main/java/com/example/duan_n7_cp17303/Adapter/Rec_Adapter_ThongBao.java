package com.example.duan_n7_cp17303.Adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.duan_n7_cp17303.DAO.Daosanpham;
import com.example.duan_n7_cp17303.DTO.Sanpham;
import com.example.duan_n7_cp17303.DTO.Thongbao;
import com.example.duan_n7_cp17303.Fragment.ThongBaoFragment;
import com.example.duan_n7_cp17303.R;

import java.sql.SQLException;
import java.util.List;

public class Rec_Adapter_ThongBao extends RecyclerView.Adapter<Rec_Adapter_ThongBao.viewHolderr> {

    List<Thongbao> list;
    Context context;
    ThongBaoFragment fragment;

    public Rec_Adapter_ThongBao(List<Thongbao> list, Context context, ThongBaoFragment fragment) {
        this.list = list;
        this.context = context;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public viewHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_thong_bao, parent, false);

        viewHolderr viewHolderr = new viewHolderr(view);

        return viewHolderr;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderr holder, int position) {

        Thongbao thongBao = list.get(position);

        Daosanpham daosanpham = new Daosanpham();

        try {
            Sanpham sanpham = daosanpham.get_SP_theo_ID(thongBao.getId_sp());
            holder.ten_donHang.setText(sanpham.getTensp());
            Glide.with(context).load(Uri.parse(sanpham.getAnh())).into(holder.img_dh);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        holder.title.setText(thongBao.getTieude());

        SharedPreferences sharedPreferences = context.getSharedPreferences("Login", context.MODE_PRIVATE);
        String u = sharedPreferences.getString("name", "");

        if (u.equals("admin")){
            holder.del.setVisibility(View.VISIBLE);
        }
        else {
            holder.del.setVisibility(View.INVISIBLE);
        }

        holder.xemChiTiet.setText(thongBao.getChitiettieude());

        holder.del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment.Del_ThongBao(thongBao.getId_thongbao());
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolderr extends RecyclerView.ViewHolder{

        ImageView img_dh, del;
        TextView ten_donHang, title, xemChiTiet;

        public viewHolderr(@NonNull View itemView) {
            super(itemView);

            img_dh = itemView.findViewById(R.id.img_sp_tb);
            ten_donHang = itemView.findViewById(R.id.don_hang_tb);
            title = itemView.findViewById(R.id.title_tb);
            xemChiTiet = itemView.findViewById(R.id.xem_chi_tiet);
            del = itemView.findViewById(R.id.del_ThongBao);

        }
    }

}
