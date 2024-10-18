// 12S24044 - DIANITA LORENSIA BR GINTING
// 12S24051 - GERALDA NATALI GULTOM
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, nilai, a, aB, b, bC, c, d, e, kreditnya;
        String kredit, nilainya;

        kreditnya = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 3.0;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kreditnya = Integer.parseDouble(kredit);
        }
        nilainya = input.nextLine();
        while (!nilainya.equals("---")) {
            if (nilainya.equals("A")) {
                nilai = 4.0;
            } else {
                if (nilainya.equals("AB")) {
                    nilai = 3.5;
                } else {
                    if (nilainya.equals("B")) {
                        nilai = 3.0;
                    } else {
                        if (nilainya.equals("BC")) {
                            nilai = 2.5;
                        } else {
                            if (nilainya.equals("C")) {
                                nilai = 2.0;
                            } else {
                                if (nilainya.equals("D")) {
                                    nilai = 1.0;
                                } else {
                                    if (nilainya.equals("E")) {
                                        nilai = 0.0;
                                    } else {
                                        nilai = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kreditnya * nilai;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kreditnya = Integer.parseDouble(kredit);
            }
            nilainya = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
