/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notasgrupales2023;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class NotasGrupales2023 {

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        int integrantes[] = {1,2,3,4,5};
        int notasTrimestre1[] = new int[5];
        int notasTrimestre2[] = new int[5];
        int notasTrimestre3[] = new int[5];
        float mediaT1 = 0, mediaT2 = 0, mediaT3 = 0;
        for(int i=1;i<=3;++i) {
            System.out.println("Introduce las notas del grupo en el " + i + "º trimestre");
            for(int j=0;j<integrantes.length;++j) {
                switch(i) {
                case 1:
                    notasTrimestre1[j] = res.nextInt();
                    mediaT1 = mediaT1 + notasTrimestre1[j];
                    break;
                case 2:
                    notasTrimestre2[j] = res.nextInt();
                    mediaT2 = mediaT2 + notasTrimestre2[j];
                    break;
                case 3:
                    notasTrimestre3[j] = res.nextInt();
                    mediaT3 = mediaT3 + notasTrimestre3[j];
                    break;
                }
            }
        }
        System.out.println("De que integrante quieres ver la media [1-5]");
        int alumno = res.nextInt();
        float mediaAlumno = ((float)(notasTrimestre1[alumno-1]+notasTrimestre2[alumno-1]+notasTrimestre3[alumno-1]))/3;
        mediaT1 = (float)mediaT1/5;
        mediaT2 = (float)mediaT2/5;
        mediaT3 = (float)mediaT3/5;
        System.out.println("La media del grupo en el 1º trimestre es: " + mediaT1);
        System.out.println("La media del grupo en el 2º trimestre es: " + mediaT2);
        System.out.println("La media del grupo en el 3º trimestre es: " + mediaT3);
        System.out.println("La media del alumno seleccionado es: " + mediaAlumno);
        System.out.println("Fin");
    }

}
