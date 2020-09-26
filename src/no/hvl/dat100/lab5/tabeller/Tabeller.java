package no.hvl.dat100.lab5.tabeller;

public class Tabeller
{

    // a)
    public static void skrivUt(int[] tabell)
    {

        for (int i = 0; i < tabell.length; i++)
        {
            System.out.print(tabell[i]);
        }
        System.out.println();
    }

    // b)
    public static String tilStreng(int[] tabell)
    {

        String tabString = "[";

        for (int i = 0; i < tabell.length; i++)
        {
            if (i != tabell.length - 1)
                tabString += tabell[i] + ",";
            else
                tabString += tabell[i];
        }

        tabString += "]";

        return tabString;
    }

    // c)
    public static int summer(int[] tabell)
    {

        int sum = 0;
        for (int i = 0; i < tabell.length; i++)
        {
            sum += tabell[i];
        }

        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall)
    {

        int i = 0;
        boolean finnes = false;
        while (!finnes && i < tabell.length)
        {
            if (tabell[i] == tall)
                finnes = true;
            else
                i++;
        }

        return finnes;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall)
    {

        int i = 0;
        int x = -1;
        boolean pos = false;
        while (!pos && i < tabell.length)
        {
            if (tabell[i] == tall)
            {
                pos = true;
                x = i;
            } else
                i++;
        }
        return x;
    }

    // f)
    public static int[] reverser(int[] tabell)
    {

        int length = tabell.length;
        int j = tabell.length - 1;
        int[] rev = new int[length];
        for (int i = 0; i < tabell.length; i++)
        {
            rev[i] = tabell[j];
            j--;
        }
        return rev;
    }

    // g)
    public static boolean erSortert(int[] tabell)
    {

        boolean sorted = true;
        for (int i = 0; i < tabell.length -1; i++)
        {
            if (tabell[i] > tabell[i + 1])
            {
                sorted = false;
                break;
            }
        }

        return sorted;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2)
    {

        int length = tabell1.length + tabell2.length;
        int[] newTabell = new int[length];
        int Index = 0;
        for (int k : tabell1)
        {
            newTabell[Index] = k;
            Index++;
        }
        for (int i : tabell2)
        {
            newTabell[Index] = i;
            Index++;
        }

        return newTabell;
    }
}
