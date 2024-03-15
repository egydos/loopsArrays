//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //         012345
        String name = "Naglisaaa";
        System.out.println(name.contains("a")); // jeigu randa zodyje a raide tada true ismeta, jei neranda tada false
        System.out.println(name.contains("h"));// jeigu randa zodyje h raide tada true ismeta, jei neranda tada false
        System.out.println(name.toLowerCase());// keicia visas raides i mazasias
        System.out.println(name);// isspausdina String name
        System.out.println(name.toUpperCase());// keicia visas raides i didziasias
        System.out.println(name.charAt(5));// istrauks 6 simboli (nes 0 yra pirmas simbolis), jeigu bandysime istraukti didesni simboli negu yra zodyje simboliu tai gausime error.
        System.out.println(name.length());// paraso is kiek raidziu susideda zodis
        System.out.println(name.repeat(10)); //paraso varda 10 kartu be tarpu
        System.out.println(name.equals("naglis"));// patikrina ar sis zodis atitinka String name (atsakymas true arba false)
        System.out.println(name.isBlank());// patikrina ar nera tuscias stringas ir taip pat tarpus
        System.out.println(name.isEmpty()); // patikrina ar nera tuscias stringas
        System.out.println(name.trim());// istrins tarpus pries zodi ir po zodzio pabaigoje, viduryje sakinio tarpu neistrins
        System.out.println(name.substring(3)); // istrina pirmas 3 raides, atsakymas zodis be pirmu 3 raidziu
        System.out.println("substring 2 " + name.substring(2, 5));// atsakymas (be pirmu 2 raidziu) bus  iki 5 simbolio (5tas simbolis ieina) 6 + simboliai neieina
        System.out.println(name.replace("a", "i"));// pakeicia visas raides is a -> i
        System.out.println(name.replaceFirst("a", "i"));// pakeicia tik pirma a raide zodyje, kitas a raides nekeicia.
        System.out.println(name.replace("a", "O").replace("i", "U"));// pakeicia a -> O ir visas i -> U

        String episode = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";
        System.out.println(episode);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("1 uzdavinys-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //1. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        String aktVardas = "Arnoldas";
        String aktPavarde = "Pakistanietis";

        System.out.println("Aktoriaus Vardas ir Pavarde: " + aktVardas + " " + aktPavarde);

        if (aktVardas.length() > aktPavarde.length()) {
            System.out.println("trumpesnis zodis yra " + aktPavarde);
        } else {
            System.out.println("trumpesnis zodis yra " + aktVardas);
        }
        System.out.println("2 uzdavinys-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //2. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println("Aktoriaus Vardas ir Pavarde: " + aktVardas + " " + aktPavarde);

        System.out.println("Vardas tik didziosiomis raidemis: " + aktVardas.toUpperCase());
        System.out.println("Pavarde tik mazosiomis raidemis: " + aktPavarde.toLowerCase());

        System.out.println("3 uzdavinys-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        // 3.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("Aktoriaus Vardas ir Pavarde: " + aktVardas + " " + aktPavarde);

        String aktTrumpasPavadinimas = aktVardas.charAt(0) + " " + aktPavarde.charAt(0);
        System.out.println("Vardo ir pavardes pirmosios raides: " + aktTrumpasPavadinimas);

        System.out.println("4 uzdavinys-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        // 4. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("Aktoriaus Vardas ir Pavarde: " + aktVardas + " " + aktPavarde);

        String trysPaskutinesV = aktVardas.substring(aktVardas.length() - 3);
        String trysPaskutinesP = aktPavarde.substring(aktPavarde.length() - 3);


        System.out.println("Paskutines 3 raides: " + trysPaskutinesV + " " + trysPaskutinesP);

        System.out.println("5 uzdavinys-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        // 5. Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String filmasParis = "An American in Paris";

        System.out.println("originalus filmo pavadinimas: " + filmasParis);

        System.out.println("pakeistos raides i *:   " + filmasParis.replace("a", "*").replace("A", "*"));

        //6. Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.


        String filmasBreakfast = "Breakfast at Tiffany's";
        String filmasSpace = "2001: A Space Odyssey";
        String filmasWonderfull = "It's a Wonderful Life";








    }
}