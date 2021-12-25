import java.util.ArrayList;
import java.util.List;

public class Calistir {
    public static void main(String[] args) {

        //Generics <>
        //ArrayList<Ogrenci> ogrenciListe = new ArrayList();

        // Polymorphism --> Subclass'ın objesini, süperclass değişkenine atamak

        List<Ogrenci> ogrenciListe = new ArrayList();


        Ogrenci ogr1 = new Ogrenci(1, "İbrahim", "Tatlıses");
        Ogrenci ogr2 = new Ogrenci(2, "Ferdi", "Tayfur");
        Ogrenci ogr3 = new Ogrenci(3, "Müslüm", "Gürses");
        Ogrenci ogr4 = new Ogrenci(4, "Orhan", "Gencebay");

        ogrenciListe.add(ogr1);
        ogrenciListe.add(ogr2);
        ogrenciListe.add(ogr3);
        ogrenciListe.add(ogr4);

        System.out.println(ogrenciListe.size());

        Ogrenci deneme = ogrenciListe.get(1);
        System.out.println(deneme.getAd());

        for (int i = 0; i < ogrenciListe.size(); i++) {
            Ogrenci yeniOgr = ogrenciListe.get(i);
            System.out.println(yeniOgr.getNo()+" "+yeniOgr.getAd()+" "+yeniOgr.getSoyad());
        }

        System.out.println("----------------");
        //foreach döngüsü
        for (Ogrenci student: ogrenciListe) {
            System.out.println(student.getNo()+" "+student.getAd()+" "+student.getSoyad());
        }
    }
}
