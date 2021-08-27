import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Bagage {
    public String airName;
    public String clas;
    public int veightMax;

    public Bagage(String airName, String clas, int veightMax) {
        this.airName = airName;
        this.clas = clas;
        this.veightMax = veightMax;
    }

    public static void main(String[] args) {
        ArrayList<Bagage> spisok = new ArrayList<>();
        spisok.add(new Bagage("Leti", "luks", 40));
        spisok.add(new Bagage("naVzlet", "classika", 30));
        spisok.add(new Bagage("naVzlet", "Superclassika", 35));
        spisok.add(new Bagage("letsGO", "class", 25));
        spisok.add(new Bagage("MBDoletim", "so-so", 27));
        spisok.add(new Bagage("TochnoDoletim", "vsyakoeBivalo", 10));
        //int max;


        int j;
        boolean flag = true;
        Bagage temp;
        Bagage  temps;


        while (flag) {
            flag = false;
            for (j = 0; j < spisok.size()- 1; j++) {
                if (spisok.get(j).veightMax < spisok.get(j + 1).veightMax) {
                    temp = spisok.get(j);
                    spisok.set(j,spisok.get(j+1));
                    spisok.set(j+1,temp);
                    flag = true;
                }
            }

            }

        for (int i = 0; i < spisok.size(); i++) {
            System.out.println(spisok.get(i));

            }
        System.out.println("==============");
        while (flag) {
            flag = false;
            for (j = 0; j < spisok.size() - 1; j++) {
                if (spisok.get(j).clas.length()+spisok.get(j).airName.length() < spisok.get(j+1).clas.length()+spisok.get(j+1).airName.length()) {
                    System.out.println("========"+spisok.get(j));
                    temps = spisok.get(j);
                    spisok.set(j,spisok.get(j+1));
                    spisok.set(j+1,temps);
                    flag = true;
                }
            }

        }
        for (int i = 0; i < spisok.size(); i++) {
            System.out.println(spisok.get(i));

        }

        }

    @Override
    public String toString () {
        return "Bagage{" +
                "airName='" + airName + '\'' +
                ", clas='" + clas + '\'' +
                ", veightMax=" + veightMax +
                '}';
}}
