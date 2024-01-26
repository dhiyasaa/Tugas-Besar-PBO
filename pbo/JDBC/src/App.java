import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String k = "Lanjut";
        Integer HargaHijab = 0;
        Integer JumlahHijab = 0;
        
        // Update
        Scanner scanner = new Scanner(System.in);
        update.updateEmployeeCredentials(scanner);
        System.out.println("");

        // Create
        Scanner scanNEW = new Scanner(System.in);
        create.insertEmployeeData(scanNEW);
        System.out.println("");

        // Delete
        delete.deleteEmployeeById();
        System.out.println("");

        LoginHijabi KM = new LoginHijabi ();
        while(k.equals("Lanjut")){
            boolean input = false;
            Scanner dhiya1 = new Scanner(System.in);
            Scanner pur = new Scanner(System.in);
            System.out.print("Kasir            : ");
            String Kasir= dhiya1.nextLine();
            System.out.print("Nama   : ");
            String NamaPelanggan = dhiya1.nextLine();
            System.out.print("Alamat           : ");
            String Alamat = dhiya1.next();
            System.out.print("No HP            : ");
            String NoHp= dhiya1.next();
            System.out.print("Jenis Hijab      : ");
            String NamaHijab = dhiya1.next();

                do{
                    try {
                        System.out.print("Harga Hijab     : ");
                        HargaHijab = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    pur.next();}
                }while(!input); 
            input = false;
                do{
                    try {
                        System.out.print("Jumlah Hijab      : ");
                        JumlahHijab = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        pur.next();
                    }
                }
            }
        }
    

        
    

                    
               
            
            
