
public class RabZone {

    public static void main(String[] args) {
        int [] massiv = new int[10];
        massiv[5] = 166;
        massiv[3] = 22;
        System.out.println(massiv[3] + massiv[5]);

        int [] massiv2 = new int[21];
        for(int i = 0; i < 21; i++) {
            massiv2[i] = i;
            System.out.println("Массив2 напихан такими числами [" + i + "] = " +(20+ massiv2[i]));
        }

    }

}
