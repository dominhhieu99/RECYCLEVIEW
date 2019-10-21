package dohieu.com.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dohieu.com.recycleview.adapter.Adapter;
import dohieu.com.recycleview.adapter.TestAdapter;
import dohieu.com.recycleview.model.Model;
import dohieu.com.recycleview.model.Test;

public class MainActivity extends AppCompatActivity {
    //khai bao
    RecyclerView recyclerView;
    RecyclerView recyclerViewtest;
    List<Model> modelList;
    List<Test> testList;
    TestAdapter testAdapter;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Khoi tao
        recyclerView = findViewById(R.id.rcHome);


        modelList = new ArrayList<>();

        adapter = new Adapter(modelList,this);

        recyclerView.setAdapter(adapter);
//         kieu du lieu hien thi
        GridLayoutManager luoi = new GridLayoutManager(this, 3);

        LinearLayoutManager doc = new LinearLayoutManager(this);

        LinearLayoutManager ngang = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);


        recyclerView.setLayoutManager(doc);
        fakedata();
    }

    // Ham tao
    private void fakedata() {
        for (int i = 0; i < 20; i++) {
            modelList.add(new Model(i + "", R.drawable.ic_launcher_foreground));
        }
    }
}
