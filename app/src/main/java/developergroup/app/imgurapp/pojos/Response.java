package developergroup.app.imgurapp.pojos;

import java.io.Serializable;

public class Response implements Serializable{
   private int status;
   private String success;
   private Data data;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
