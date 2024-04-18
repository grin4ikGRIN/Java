package aufgaben_sv01.auf_00_20240416_Vererbung_sv01;

public class Hauptklasse {
    public static void main(String[] args) {
        Kuenstler k = new Kuenstler("Künstler1");
        System.out.println();

        Maler m = new Maler("Maler");
        System.out.println();

        Saenger s = new Saenger("Sänger");

        // optional
        System.out.println();
        if (s instanceof Kuenstler) {
            System.out.println("s ist ein Objekt der Klasse 'Kuenstler'");
        }
        System.out.println();
        System.out.println("Die Klasse mit Metadaten: " + s.getClass());

        System.out.println();
        System.out.println("Nur die Klasse: " + s.getClass().getSimpleName());

        System.out.print("Die Methode 'ausgabe' der Klasse 'Kuenstler': ");
        k.ausgabe();

        // casten, um Zugriff auf die Methoden der Subklasse zu bekommen
        Kuenstler k2 = new Saenger("Sänger2");
        System.out.print("Die überschriebene Methode 'ausgabe' der Klasse 'Saenger': ");
        ((Saenger) k2).ausgabe();
    }
}
