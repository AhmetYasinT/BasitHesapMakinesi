
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
            Scanner sca = new Scanner(System.in);
            
            System.out.println("----------------------------------");

            String islemler="1. Toplama İşlemi \n" +
                               "2. Çıkarma İşlemi \n" +
                               "3. Çarpma İşlemi \n" +
                               "4. Bölme İşlemi";
            System.out.println(islemler);
            System.out.println("----------------------------------");
            
            System.out.print("İşlem Seçiniz: ");
            String islem = sca.nextLine();
            int a;
            int b;
            switch(islem){
                case "1":
                    System.out.println("Birinci Sayı: ");
                    a = sca.nextInt();
                    System.out.println("İkinci Sayı: ");
                    b = sca.nextInt();
                    System.out.println("Girilen Değerlerin Toplamları: " + (a+b));
                    break;
                    
                case "2":
                    System.out.println("Birinci Sayı: ");
                    a= sca.nextInt();
                    System.out.println("İkinci Sayı: ");
                    b = sca.nextInt();
                    System.out.println("Girilen Değerlerin Farkları: " + (a-b));
                    break; 
                    
                case "3":
                    System.out.println("Birinci Sayı: ");
                    a= sca.nextInt();
                    System.out.println("İkinci Sayı: ");
                    b= sca.nextInt();
                    System.out.println("Girilen Değerlerin Çarpımı: " + (a*b));
                    break; 
                    
                case "4":
                    System.out.println("Birinci Sayı: ");
                    a = sca.nextInt();
                    System.out.println("İkinci Sayı: ");
                    b = sca.nextInt();
                    System.out.println("Girilen Değerlerin Bölme Sonucu: " + ( (double)a/b));
                    break;  
                    
                default:
                    System.out.println("Lütfen Geçerli bir işlem seçiniz..");
            }
        }
    }

