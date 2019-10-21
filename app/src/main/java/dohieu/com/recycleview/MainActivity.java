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
    List<Model> modelList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Khoi tao
        recyclerView = findViewById(R.id.rcHome);


        modelList = new ArrayList<>();

        adapter = new Adapter(modelList, this);

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

        List<Test> tests = new ArrayList<>();
        tests.add(new Test("1"));
        tests.add(new Test("2"));
        tests.add(new Test("3"));
        modelList.add(new Model(1 + "", R.drawable.ic_launcher_foreground, tests));


        List<Test> tests2 = new ArrayList<>();
        tests2.add(new Test("1"));
        tests2.add(new Test("2"));

        modelList.add(new Model(2 + "", R.drawable.ic_launcher_foreground, tests2));

        List<Test> tests3 = new ArrayList<>();
        tests3.add(new Test("1"));
        tests3.add(new Test("2"));
        tests3.add(new Test("3"));
        tests3.add(new Test("1"));
        tests3.add(new Test("2"));
        tests3.add(new Test("3"));
        modelList.add(new Model(3 + "", R.drawable.ic_launcher_foreground, tests3));

        List<Test> tests4 = new ArrayList<>();
        tests4.add(new Test("1"));
        tests4.add(new Test("2"));
        tests4.add(new Test("3"));
        tests4.add(new Test("1"));
        tests4.add(new Test("2"));
        tests4.add(new Test("3"));
        tests4.add(new Test("1"));
        tests4.add(new Test("2"));
        tests4.add(new Test("3"));

        modelList.add(new Model(4 + "", R.drawable.ic_launcher_foreground, tests4));

    }
}
