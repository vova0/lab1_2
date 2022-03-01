import java.util.Scanner;
class info{
    String name,da;
    double hight;
    String mesto;
}
public class gora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите количество гор  => ");
        int kol = sc.nextInt();
        sc.nextLine();
        info[] sotr = new info[kol];
        System.out.println("Введите информацию о каждой горе: ");
        for (int i = 0; i < sotr.length; i++) {
            sc.nextLine();
            sotr[i] = new info();
            System.out.print("Введите название " + (i + 1) + " горы => ");
            sotr[i].name = sc.nextLine();
            System.out.print("Введите его место => ");
            sotr[i].mesto = sc.nextLine();
            System.out.print("Введите его высоту => ");
            sotr[i].hight = sc.nextDouble();
        }
        System.out.println("\n наз \t |  место  \t | высота ");
        for (info s : sotr) {
            System.out.print("" + s.name + "\t |" + s.mesto + "\t | " + s.hight + "\n");
        }
        int nommax = 0;
        double max = sotr[nommax].hight;
        for (int i = 0; i < sotr.length; i++)
            if (sotr[i].hight > max) {
                max = sotr[i].hight;
                nommax = i;
            }
        System.out.println("\nГора с максимальной высотой :");
        System.out.println("" + sotr[nommax].name + "\t" + sotr[nommax].hight + "м");
        String sname = sc.nextLine();
        System.out.println("\nГора с  высотой более 1000 м :");
        for (int a = 0; a < sotr.length; a++)
            if (sotr[a].hight > 1000) {
                System.out.println("" + sotr[a].name + "\t" + sotr[a].hight + "м");
            }
        for (int b = 0; b < sotr.length - 1; b++)
            for (int j = 0; j < sotr.length - 1 - b; j++)
                if (sotr[j].hight > sotr[j + 1].hight) {
                    info rab = sotr[j];
                    sotr[j] = sotr[j + 1];
                    sotr[j + 1] = rab;
                }
        System.out.println("\nОтсортированный список по высоте:");//
        for (int b = 0; b < sotr.length; b++) {
            System.out.println("" + sotr[b].name + "" + sotr[b].hight + "м");
        }
        System.out.println("Введите название искомой горы=> ");
        String name=sc.nextLine();
        int nom = -1;
        for (int y= 0; y < sotr.length; y++)
            if (name.equalsIgnoreCase(sotr[y].name))
                nom = y;
        if (nom != -1) {
            System.out.println("Такая гора есть в списке. Это "
                    + sotr[nom].name + " " + sotr[nom].mesto + " " + sotr[nom].hight + "м");
        }
        else{ System.out.println("Такой горы нет в списке");}
        sc.nextLine();
        System.out.println("Изменить инфо о горе ");
        info[] sotrr = new info[kol];
        System.out.println("Введите информацию о каждой горе: ");
        for (int i = 0; i < sotrr.length; i++) {
            sc.nextLine();
            sotrr[i] = new info();
            System.out.print("Введите название " + (i + 1) + " горы => ");
            sotrr[i].name = sc.nextLine();
            System.out.print("Введите его место => ");
            sotrr[i].mesto = sc.nextLine();
            System.out.print("Введите его высоту => ");
            sotrr[i].hight = sc.nextDouble();
        }
        System.out.println("\n наз \t |  место  \t | высота ");
        for (info s : sotrr) {
            System.out.print("" + s.name + "\t |" + s.mesto + "\t | " + s.hight + "\n");
        }
    }

}
