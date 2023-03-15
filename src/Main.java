import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {


    /*1.Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir šiuos metus (nebūtinai tikrus).
     Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir pavardės kintamuosius
     atspausdintų tokį sakinį :"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".*/
//
//        String name = "Vaiva";
//        System.out.println(name);
//        String surname;
//        surname = "Simon";
//        int birtYear = 1987;
//        int currentYear = 2023;
//
//        System.out.println("Aš esu " + name + " " + surname + "." + " Man yra " + (currentYear - birtYear) + " metai (ų).");

//     /*2.Naudokite funkcija Math.random(). Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random()
//     jiems priskirkite atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės.
//     Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.*/
//
//        int min = 5;
//        int max = 25;
//        //                        0.99999 * 25 = 24.9975 ~ 25;
//        //                        0.0000 * 25 = 0 ~ 0;
//        int result= (int) Math.round(Math.random() * 25);
//        // 5 +                    0.0000 * 25 = 5;
//        // 5 +                    0.9999 * 25 = 29.9975 ~ 30;
//        result = 5 + (int) Math.round( Math.random() * 25);
//
//        // 5 +                    0.0000 * 20 = 5;
//        // 5 +                    0.9999 + 20 = 5 + 19.998 = 24.998 ~ 25;
//        result = 5 + (int) Math.round( Math.random() * 25 - 5);
//        result = min + (int) Math.round(Math.random() * (max - min));


//
//        int max = 4;
//
//        double number1 = Math.random() *  max;
//        double number2 = Math.random() *  max;
//
//        System.out.println("number1 reikšmė yra " + number1 + ". number2 reikšmė yra " + number2);
//
//        double answer = 0;
//        if (number1 > number2 && number2 != 0) {
//            answer = number1 / number2;
//        }
//        else if(number2 >= number1 && number1 != 0) {
//            answer = number2 / number1;
//        }
//
//        answer =  Math.round(answer * 100.0) / 100.0;
//        System.out.println("answer " + answer);

        /*
        3.Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random()
         jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.*/

         int num31 = (int) Math.round(Math.random() * 25); // 5
         int num32 = (int) Math.round(Math.random() * 25); // 9
         int num33 = (int) Math.round(Math.random() * 25); // 7
        System.out.println("number31= " + num31 + " number32= " + num32 + " number33= " + num33);

         if (num31 > num32 && num31 < num33 || num31 > num33 && num31 < num32){
             System.out.println("middle number- " + num31);
         }
         else if (num32 > num33 && num32 < num31 || num32 > num31 && num32 < num33){
             System.out.println("middle number- " + num32);
         }
         else if (num33 < num32 && num33 > num31 || num33 > num32 && num33 < num31){
             System.out.println("middle number- " + num33);
         }
         else {
             System.out.println("no middle number - " + num31 + num32 + num33);
         }

        /*
        4.Įvedami skaičiai -a, b, c –kraštinių ilgiai,
        trys kintamieji (naudojame int) (naudokite ​Math.random()​ funkcija nuo 1 iki 10).
        Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.
         */


        int num41 = 10;//1 + (int) Math.round(Math.random() * 10); //5
        int num42 = 5;//1 + (int) Math.round(Math.random() * 10);//
        int num43 = 4;//1 + (int) Math.round(Math.random() * 10);

        int min = 1;
        int max = 10;
        int result = min + (int) Math.round(Math.random() * (max - min));

        if (num41 + num42 > num43 || num42 + num43 > num41 || num41 + num43 > num42) {
            System.out.println("trikampis gaunasi");

        } else {
            System.out.println("trikampis nesigauna");
        }
        /*
       5.Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems
       reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų.
         */

        int num51 = GetRandomNumber(0,2);
        int num52 = GetRandomNumber(0,2);
        int num53 = GetRandomNumber(0,2);
        int num54 = GetRandomNumber(0,2);

        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        if (num51 == 0){
            zeroes++;
        }
        if (num51 == 1){
            ones++;
        }
        if (num51 == 2){
            twos++;
        }
        if (num52 == 0){
            zeroes++;
        }
        if (num52 == 1){
            ones++;
        }
        if (num52 == 2){
            twos++;
        }
        if (num53 == 0){
            zeroes++;
        }
        if (num53 == 1){
            ones++;
        }
        if (num53 == 2){
            twos++;
        }
        if (num54 == 0){
            zeroes++;
        }
        if (num54 == 1){
            ones++;
        }
        if (num54 == 2){
            twos++;
        }
        System.out.println("zeroes- " + zeroes + " ones- " + ones  + " twos- " + twos);


        /*
       6.Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
       Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.
         */
//
//        int max1 = 10;
//        int min1 = -10;
//
//        int num61 = min1 + (int) Math.round(Math.random() * (max1 - min1));
//        int num62 = min1 + (int) Math.round(Math.random() * (max1 - min1));
//        int num63 = min1 + (int) Math.round(Math.random() * (max1 - min1));
//
//        if (num61 < 0){
//            System.out.println("["+ num61 + "]");
//        }
//        if (num61 == 0){
//            System.out.println("(" + num61 + ")");
//        }
//        if (num61 > 0){
//            System.out.println("{" + num61 + "}");
//        }
//        if (num62 < 0){
//            System.out.println("[" + num62 + "]");
//        }
//        if (num62 > 0){
//            System.out.println("(" + num62 + ")");
//        }
//        if (num62 == 0){
//            System.out.println("{" + num62 + "}");
//        }
//        if (num63 > 0){
//            System.out.println("[" + num63 + "]");
//        }
//        if (num63 < 0){
//            System.out.println("(" + num63 + ")");
//        }
//        if (num63 == 0){
//            System.out.println("{" + num63 + "}");
//        }
        /*
         7.Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida,
         daugiau kaip 2000 vienetų- 4 % nuolaida. Parašykite programą,
         kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.
         Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000.
         */
//
//        int max1 = 3000;
//        int min1 = 5;
//        int candlePrice = 1;
//        int candleDiscount1 = 3;
//        int candleDiscount2 = 4;
//
//        double num71 = min1 + Math.round(Math.random() * (max1 - min1));
//        System.out.println("Žvakių kiekis - " + num71);
//        double num72 = num71 * candlePrice;
//
//
//        System.out.println("..............................");
//        if (num71 <= 1000) {
//            System.out.println("Bendra suma Eur - " + num72);
//        }
//        if ((num71 > 1000) && (num71 <= 2000)) {
//            System.out.println("Žvakių kaina su 3% nuolaida - " + (num71 * 0.97) * 100 / 100);
//        }
//        if (num71 > 2000) {
//            System.out.println("Žvakių kaina su 4% nuolaida - " + (num71 * 0.96) * 100 / 100);
//        }
        /*
         8.Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
         Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10
         arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus apvalinkite iki sveiko skaičiaus.
         */
//        int num81 = GetRandomNumber(0,100);
//        int num82 = GetRandomNumber(0,100);
//        int num83 = GetRandomNumber(0,100);
//
//        int count = 3;
//        int sum = num81 + num82 + num83;
//        int average1 = sum/count;
//        System.out.println("Pirmasis vidurkis- " + average1);
//
//        int min1 = 10;
//        int max1 = 90;
//        int average2 = 0;
//
//        if (num81 >= min1 && num81 <= max1){
//            sum -= num81;
//            count ++;
//        }
//        if (num82 >= min1 && num82 <= max1){
//            sum -= num81;
//            count ++;
//        }
//
//        if (num83 >= min1 && num83 <= max1){
//            sum -= num81;
//            count ++;
//        }
//        System.out.println("Antras aritmetinis vidurkis " + Math.round(sum/count));

        git config --global user.name "wirga3012"
        git config --global user.email "wirgaile@gmail.com"


    }

    public static int GetRandomNumber(int min, int max){
        return (int)Math.round((Math.random() * (max- min)) + min);
    }
}
