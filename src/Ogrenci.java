public class Ogrenci {

    private int no;
    private String ad;
    private String soyad;

    public Ogrenci(int no, String ad, String soyad) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
