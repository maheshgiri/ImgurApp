package developergroup.app.imgurapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import developergroup.app.imgurapp.adaptors.CommentAdaptor;
import developergroup.app.imgurapp.pojos.CommentsData;
import developergroup.app.imgurapp.pojos.Response;
import developergroup.app.imgurapp.services.ApiHelper;
import developergroup.app.imgurapp.services.ApiService;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private RecyclerView commentslist;
    private ApiService apiService;
    private ImageView img;
    private CommentAdaptor commentAdaptor;
    private String imageid="Qc4eZWO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiHelper.getRetrofitClient().create(ApiService.class);
        img = findViewById(R.id.galleyimg);

        commentslist = findViewById(R.id.commentslist);
        commentslist.setLayoutManager(new LinearLayoutManager(this));
        if (getIntent()!=null){
            imageid=getIntent().getStringExtra("imgid");
        }
        apiService.getImageData(getString(R.string.clientid), imageid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response response) {
                        Log.d("DEBUG", "onNext: ");
                        if (response.getStatus() == 200) {
                            Picasso.get().load(response.getData().getLink()).into(img);
                        } else
                            Toast.makeText(MainActivity.this, "Error while fetching data please check id!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("DEBUG", "onError: ");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        apiService.getImageCommentsData(getString(R.string.clientid), imageid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CommentsData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CommentsData commentsData) {
                        if (commentsData.getStatus() == 200) {
                            commentAdaptor = new CommentAdaptor(commentsData.getCommentList());
                            commentslist.setAdapter(commentAdaptor);
                        } else
                            Toast.makeText(MainActivity.this, "Error while fetching data please check id!", Toast.LENGTH_SHORT).show();

                        Log.d("DEBUG", "onNext: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("DEBUG", "onError: ");
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
