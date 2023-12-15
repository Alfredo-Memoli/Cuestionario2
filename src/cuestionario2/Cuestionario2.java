/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuestionario2;

 


import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Cuestionario2 {

    public static JButton[] allBtn= new JButton[2];
    public static JTextField[] jtf=new JTextField[2];
    public static  int ale;
    //static String res;
    static String res[]={"HIDRÓGENO","1989","MARCONI","EDISON","1945","ANDROMEDA","3","16","12","MADRID","JÚPITER","1789","PLATA","PACIFICO","1942","OCEANIA"};
    public static void main(String[] args) {
         interfaz2 nf= new  interfaz2();
        nf.setVisible(true);

        allBtn[0]= nf.jButton1;
        allBtn[1]= nf.jButton2;

        jtf[0]=nf.jTextField1;
        jtf[1]=nf.jTextField2;

           }

    public static void BtnRm(String val){
        Random rn=new Random();


        if(val.equals("Inicio")){
            allBtn[1].setBackground(Color.white);
            jtf[1].setBackground(Color.white);
            jtf[1].setText("");
            ale= rn.nextInt(0,16);


        switch (ale) {
            case 0:{jtf[0].setText("¿Cual es al elemento mas abundante del universo?");
                }
                break;
            case 1:{jtf[0].setText("¿En que año cayó el muro de Berlin?");
                }
                break;
            case 2:{jtf[0].setText("¿Quien inventó la radio?");
                }
                break;
            case 3:{jtf[0].setText("¿Quien creo la bombilla?");
                }
                break;
            case 4:{jtf[0].setText("¿En que año terminó la segunda guerra mundial?");
                }
                break;
            case 5:{jtf[0].setText("¿Nombre de la galaxia vecina a la via lactea?");
                }
                break;
            case 6:{jtf[0].setText("¿Cuántos lados tiene un triángulo?");
                }
                break;
            case 7:{jtf[0].setText("¿Cuál es el resultado de sumar 7 + 9?");
                }
                break;
            case 8:{jtf[0].setText("¿Cuántos meses tiene un año?");
                }
                break;

            case 9:{jtf[0].setText("¿Cuál es la capital de España?");
               }
                break;
            case 10:{jtf[0].setText("¿Cuál es el planeta más grande de nuestro sistema solar?");
               }
               break;
            case 11:{jtf[0].setText("¿En qué año comenzó la revolución francesa?");
               }
               break;
            case 12:{jtf[0].setText("¿Como se llama el elemento químico Ag?");
               }
               break;
               case 13:{jtf[0].setText("¿Cuál es el océano más grande?");
               }
               break;
               case 14:{jtf[0].setText("¿En qué año se descubrió América?");
               }
               break;
               case 15:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
               case 16:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
               case 17:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
               case 18:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
               case 19:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
               case 20:{jtf[0].setText("¿En qué continente se encuentra la Gran Barrera de Coral?");
               }
               break;
            default:
                throw new AssertionError();
        }
        } 
        else if(val.equals(res[ale])){jtf[0].setText("¡¡¡Correcto!!!");
            allBtn[1].setBackground(Color.green);
            jtf[1].setBackground(Color.green);}
        
        else if(!val.equals(res[ale])){jtf[0].setText("Lo siento, la respuesta es: "+res[ale]);
            allBtn[1].setBackground(Color.red);
            jtf[1].setBackground(Color.red);}
    }  
    }
    

