package dohieu.com.recycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dohieu.com.recycleview.R;
import dohieu.com.recycleview.model.Model;
import dohieu.com.recycleview.model.Test;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    //    Khai bao
    private List<Model> modelList;
    RecyclerView recyclerViewtest;
    private List<Test> testList;
    TestAdapter testAdapter;
    private Context context;

    // Khoi tao constructor

    public Adapter(List<Model> modelList, Context context) {
        this.context = context;
        this.modelList = modelList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycle, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.tvID.setText(model.getTvId());
        holder.IMG.setImageResource(model.getImageView());

        testList = new ArrayList<>();
        testAdapter = new TestAdapter(testList);
        recyclerViewtest.setAdapter(testAdapter);
        LinearLayoutManager ngang = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);

        LinearLayoutManager doc = new LinearLayoutManager(context);
        recyclerViewtest.setLayoutManager(ngang);
        fakedata();
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvID;
        final ImageView IMG;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvID = itemView.findViewById(R.id.tvId);
            IMG = itemView.findViewById(R.id.IMG);
            recyclerViewtest = itemView.findViewById(R.id.rcTest);
        }
    }

    // Ham tao
    private void fakedata() {
        for (int i = 0; i < 10; i++) {
            testList.add(new Test("HieuDm" + i));
        }
    }
}
