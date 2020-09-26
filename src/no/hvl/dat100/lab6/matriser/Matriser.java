package no.hvl.dat100.lab6.matriser;

public class Matriser
{

    // a)
    public static void skrivUt(int[][] matrise)
    {

        for (int i = 0; i < matrise.length; i++)
        {
			for (int j = 0; j < matrise.length; j++)
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
            for (int j = 0; j < matrise.length; j++)
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

        // TODO
        throw new UnsupportedOperationException("skaler ikke implementert");

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b)
    {

        // TODO
        throw new UnsupportedOperationException("erLik ikke implementert");
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

        // TODO
        throw new UnsupportedOperationException("multipliser ikke implementert");

    }
}
