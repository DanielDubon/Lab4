package Model;

public class Radio {

    public Radio(String FQ, String Title){
        this.FQ = FQ;
        this.Title = Title;

    }

    private String FQ;
    private String Title;

    public String getFQ() {
        return FQ;
    }

    public void setFQ(String FQ) {
        this.FQ = FQ;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
