/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokentester;

import java.util.*;

/**
 *
 * @author irakli
 */
public class TokenTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("PODAJ GRUPE ->");
        String grupa = input.nextLine();

        System.out.print("PODAJ POZJCIE ->");
        String pozjcja = input.nextLine();

        System.out.print("PODAJ ŁANCUCH ->");
        String str = input.nextLine();

        StringTokenizer token = new StringTokenizer(str.toUpperCase());
        try
        {
            for (int i = 0; i < str.length(); i++)
            {
                int gr = Integer.parseInt(grupa);
                int poz = Integer.parseInt(pozjcja);
                System.out.println("GRUPA : ---> " + (i ) + " " + token.nextToken("#"));
                if ((i) == gr)
                {
                    System.out.println("SZUKALICZMY : ----> " + "[" + token.nextToken("#").charAt(poz) + "]" + " W GRUPIE : --->  "  + (i) );

                }

            }
        } catch (NoSuchElementException e)
        {
            System.out.println("DALEJ --- > PUSTO");

        } catch (StringIndexOutOfBoundsException s)
        {
            System.err.println("ERROR");
        }

    }

}
