package no.hvl.dat100.lab6.matriser;

public class Matriser
{

    // a)
    public static void skrivUt(int[][] matrise)
    {

        for (int i = 0; i < matrise.length; i++)
        {
			for (int j = 0; j < matrise[i].length; j++)
            {
                System.out.print(matrise[i][j]);

                if (j < matrise.length - 1)
                    System.out.print(",");
            }
			System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise)
    {

        StringBuilder streng = new StringBuilder();
        for (int i = 0; i < matrise.length; i++)
        {
            for (int j = 0; j < matrise[i].length; j++)
            {
                streng.append(matrise[i][j]).append(" ");
            }

            streng.append('\n');
        }

        return streng.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise)
    {

        int length = matrise.length;
        int x = 0;
        int[][]newMatrise = new int[length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++)
        {
            for (int j = 0; j < matrise[i].length; j++)
            {
                newMatrise[i][j] = matrise[i][j] * tall;
            }
        }

        return newMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b)
    {
        if (a.length != b.length)
            return false;

        else
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a[i].length; j++)
                {
                    if (a[i][j] != b[i][j] || a[i].length != b[i].length)
                        return false;
                }
            }
            return true;
        }
    }

    // e)
    public static int[][] speile(int[][] matrise)
    {

        // TODO
        throw new UnsupportedOperationException("speile ikke implementert");

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b)
    {
        int[][] multiplied = new int[a.length][a[0].length];


        if (a.length != b[0].length)
            return null;

        else
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a[0].length; j++)
                {
                    for (int k = 0; k < a[0].length; k++)
                    {
                        multiplied[i][j] += multiplied[i][j] = a[i][k] * b[k][j];
                    }
                }
            }
        }
        return multiplied;
    }
}
