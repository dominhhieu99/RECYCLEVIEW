package dohieu.com.recycleview.model;

import android.widget.ImageView;

import java.util.List;

public class Model {
    private String tvId;
    private int imageView;
    private List<Test> testList;

    public Model(String tvId, int imageView, List<Test> testList) {
        this.tvId = tvId;
        this.imageView = imageView;
        this.testList = testList;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }
}
