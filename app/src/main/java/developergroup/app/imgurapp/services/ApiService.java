package developergroup.app.imgurapp.services;

import developergroup.app.imgurapp.pojos.CommentsData;
import developergroup.app.imgurapp.pojos.Response;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @GET("/3/gallery/image/{imageid}")
    Observable<Response> getImageData(@Header("Authorization") String clientid,   @Path("imageid") String imgid);

    @GET("3/gallery/{galleyhashid}/comments")
    Observable<CommentsData> getImageCommentsData(@Header("Authorization") String clientid, @Path("galleyhashid") String galleyhashid);

}
