package dohieu.com.recycleview.model;

import android.widget.ImageView;

public class Model {
    private String tvId;
    private int imageView;

    public Model(String tvId, int imageView) {
        this.tvId = tvId;
        this.imageView = imageView;
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
}
