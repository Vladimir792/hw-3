public class Main {
    public static void main(String[] args) {
     System.out.println(" задание 1 ");
     int a = 40000;
     System.out.println(" значение переменной int с целочисленным типом равно " + a);
     byte b = 22;
     System.out.println(" значение переменной byte с целочисленным типом равно " + b);
     short c = 30000;
     System.out.println(" значение переменной short с целочисленным типом равно " + c);
     long d = 505505505L;
     System.out.println(" значение переменной long с целочисленным типом равно " + d);
     float e = 3.17f;
     System.out.println(" значение переменной float с плавающей точкой равно " + e);
     double f = 12.12345;
     System.out.println(" значение переменной double с плавающей точкой равно " + f);

     System.out.println(" задание 2 ");
     float g = 27.12f;
     System.out.println(g);
     long h = 987678965549L;
     System.out.println(h);
     float i =2.786f;
     System.out.println(i);
     short j = 569;
     System.out.println(j);
     short k = -159;
     System.out.println(k);
     short l = 27897;
     System.out.println(l);
     byte m = 67;
     System.out.println(m);

     System.out.println(" задание 3 ");
     byte lyudmilaPavlovna = 23;
     byte annaSergeevna = 27;
     byte ekaterinaAndreevna = 30;
     int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
     int sheetsPaper = 480;
     int everyStudent = sheetsPaper / totalStudents;
     System.out.println(" На каждого ученика расчитано " + everyStudent + " листов бумаги ");

     System.out.println(" задание 4 ");
     int bottlesPerMinute = 16 / 2;
     int bottlesIn20Minutes = bottlesPerMinute * 20;
     int bottlesInOneDay = bottlesPerMinute * 60 * 24;
     int bottlesInThreeDays = bottlesInOneDay * 3;
     int bottlesInOneMonth = bottlesInOneDay * 30;
     System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
     System.out.println("В сутки машина произвела " + bottlesInOneDay + " штук бутылок.");
     System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок.");
     System.out.println("За 1 месяц машина произвела " + bottlesInOneMonth + " штук бутылок.");

     System.out.println(" задание 5 ");
     int totalPaintBanks = 120;
     int whitePaintPerClass = 2;
     int brownPaintPerClass = 4;
     int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;
     int numberOfClasses = totalPaintBanks / totalPaintPerClass;
     int whitePaintBanks = numberOfClasses * whitePaintPerClass;
     int brownPaintBanks = numberOfClasses * brownPaintPerClass;
     System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintBanks + " банок белой краски и " + brownPaintBanks + " банок коричневой краски.");

     System.out.println(" задание 6 ");
     int bananasWeight = 5 * 80;
     int milkWeight = 200 / 100 * 105;
     int iceCreamWeight = 2 * 100;
     int eggsWeight = 4 * 70;
     int totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
     double totalWeightKilograms = totalWeightGrams / 1000.0;
     System.out.println("Вес спортзавтрака в граммах: " + totalWeightGrams);
     System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKilograms);

     System.out.println(" задание 7 ");
     int targetWeightLossInGrams = 7000;
     int minDailyLoss = 250;
     int maxDailyLoss = 500;
     int daysAtMinRate = targetWeightLossInGrams / minDailyLoss;
     int daysAtMaxRate = targetWeightLossInGrams / maxDailyLoss;
     double averageDays = (daysAtMinRate + daysAtMaxRate) / 2.0;
     System.out.println("Минимальное количество дней: " + daysAtMinRate);
     System.out.println("Максимальное количество дней: " + daysAtMaxRate);
     System.out.println("Среднее количество дней: " + averageDays);

     System.out.println(" задание 8 ");
     double mashaSalary = 67760;
     double denisSalary = 83690;
     double kristinaSalary = 76230;
     double newMashaSalary = mashaSalary * 1.1;
     double newDenisSalary = denisSalary * 1.1;
     double newKristinaSalary = kristinaSalary * 1.1;
     double mashaYearlyDifference = (newMashaSalary - mashaSalary) * 12;
     double denisYearlyDifference = (newDenisSalary - denisSalary) * 12;
     double kristinaYearlyDifference = (newKristinaSalary - kristinaSalary) * 12;
     System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaYearlyDifference + " рублей.");
     System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisYearlyDifference + " рублей.");
     System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + kristinaYearlyDifference + " рублей.");
    }
}