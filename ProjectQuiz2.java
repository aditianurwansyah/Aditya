/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project1; 

/**
 *
 * @author Aditia Nurwansyah
 */
import java.util.Arrays; 
import java.util.Scanner; 
import java.util.Queue; 
import java.util.Stack; 
import java.util.LinkedList; 
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.PriorityQueue; 
import java.util.Collections;
import java.util.ArrayList;
import java.util.List; 
import java.util.Comparator; 
public class ProjectQuiz2 {

    private static String name;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       record Mahasiswa(int nim, String nama, String kelas, String programstudi){ }   
    
        while(true){
        System.out.println("Tanggal :"+new SimpleDateFormat("yyyy-MM dd HH:mm:ss").format(new Date( )));  
        Scanner input= new Scanner(System.in);
        //RECORD// 
      System.out.println("======================= Data Siswa =====================================");
        Mahasiswa mhs1= new Mahasiswa(223551, "Brodany", "1PPA", "Teknik elektro"); 
        Mahasiswa mhs2= new Mahasiswa(200323, "Manny", "12BC", "Teknik elektro");
        Mahasiswa mhs3= new Mahasiswa(210021, "Betty", "11CA","Teknik pemograman"); 
        Mahasiswa mhs4= new Mahasiswa(100323, "Mellya", "11AE","Teknik pemograman");    
      System.out.println("========================================================================"); 
         
        System.out.println("======================================================================="); 
        System.out.println("NIM :"+mhs1.nim()+"|"+"NAMA :"+mhs1.nama()+"|"+"KELAS :"+mhs1.kelas()+"|"+"PROGRAM STUDI :"+mhs1.programstudi()+"|"); 
        System.out.println("NIM :"+mhs2.nim()+"|"+"NAMA :"+mhs2.nama()+"|"+"KELAS :"+mhs2.kelas()+"|"+"PROGRAM STUDI :"+mhs2.programstudi()+"|");
        System.out.println("NIM :"+mhs3.nim()+"|"+"NAMA :"+mhs3.nama()+"|"+"KELAS :"+mhs3.kelas()+"|"+"PROGRAM STUDI :"+mhs3.programstudi()+"|"); 
        System.out.println("NIM :"+mhs4.nim()+"|"+"NAMA :"+mhs4.nama()+"|"+"KELAS :"+mhs4.kelas()+"|"+"PROGRAM STUDI :"+mhs4.programstudi()+"|");
        System.out.println("========================================================================="); 
            System.out.println("Note : yang ditampilkan diatas merupakan nama yang sudah mengerjakan quiz game dari kami dengan kinerja luar biasa tapi kalau mau dipakai ya boleeh");
            System.out.print("Jumlah peserta yang mau dimasukan : ");  
            int mw= input.nextInt( ); 
            input.nextLine( );
            //ARRAY//
            Mahasiswa[ ] people= new Mahasiswa[mw];
          for(int p=0; p<mw; p++){ 
              System.out.print("Masukan nim anda :"); 
              int nim= input.nextInt();
        System.out.print("masukan nama anda  :");  
        String nama= input.next();
              System.out.print("Masukan kelas anda :");
              String kelas=input.next( );
              System.out.print("Masukan program studi :"); 
              String programstudi= input.next( );
        input.nextLine(); 
         people[p]= new Mahasiswa(nim,nama,kelas,programstudi); 
          }
            System.out.println("Tampilkan identitas peserta "); 
          for(Mahasiswa siswa : people){
              System.out.println("nim  :"+siswa.nim( )+" "+"nama :"+siswa.nama( )+" "+"kelas :"+siswa.kelas( )+" "+"programstudi :"+siswa.programstudi( ) ); 
          }  
            System.out.println("=======Kategori Soal=============");
            System.out.println("1. Soal ez (Mudah)");
            System.out.println("2. Soal b-aja(Medium) "); 
            System.out.println("============================");   
            System.out.println("Note :"+"untuk soal Predator(Hard) itu tidak dicantum di pilihan akan tetapi akan muncul ketika tidak mengganti kategori soal tetapi hanya satu kali:) ");
            //STACK// 
        Stack<String>Kategori_Soal= new Stack<>();  
         Kategori_Soal.add("Soal ez");
         Kategori_Soal.add("Soal b-aja");
         Kategori_Soal.add("Soal predator"); 
         
            System.out.println("Apakah ingin mengganti soal yang pilih ?");
            String pilih= input.next( ); 
            
            if(pilih.equalsIgnoreCase("iya")){  
                System.out.print("Silahkan memilih kategori soal dengan angka :"); 
                int m=input.nextInt( ); 
                 switch(m) { 
                case 1 : 
                    int nilai= 100;
                  System.out.println("======Soal mudah=======================================");
                    String Pertanyaan1= "8+2 =";
                    String Pertanyaan2= "8+3 =";
                    String Pertanyaan3= "Apakah kamu punya balon 5 ?";
                    String Pertanyaan4= "IPA singkatan dari ?";
                    System.out.print(Pertanyaan1);
                     String j1= input.next( );
                     if(j1.equalsIgnoreCase("10")){
                         System.out.println("Mantap kereen euyyyy"); 
                     }else{
                         System.out.println("pfft salah cuy, jawaban benar nya adalah 10");
                         nilai= nilai-25; 
                         System.out.println("nilai nya : "+nilai);
                     } 
                     System.out.print(Pertanyaan2);
                     String j2= input.next( );
                     if(j2.equalsIgnoreCase("11")){
                         System.out.println(" Mantap kereeen euyyyy");
                     }else{
                         System.out.println("pfft salah cuy,  jawaban benar nya adalah 11");
                         nilai= nilai-25;
                         System.out.println("nilai nya : "+nilai); 
                     }  
                     System.out.print(Pertanyaan3);
                     String j3= input.next( );
                     if(j3.equalsIgnoreCase("punya_rupa-rupa_warnanya")){
                         System.out.println("Mantap kereeen euyyyy");
                     }else{
                         System.out.println("pfft salah cuy, jawaban benar nya adalah punya_rupa-rupa_warnanya"); 
                         nilai= nilai-25;
                          System.out.println("nilai nya : "+nilai);
                     }
                      System.out.print(Pertanyaan4);
                      String j4=input.next( );
                      if(j4.equalsIgnoreCase("ilmu_pengetahuan_alam")){
                          System.out.println("Mantap kereeen euyyyy"); 
                      }else{
                          System.out.println("pfft salah cuy, jawaban benarnya adalah ilmu_pengetahuan_alam");
                          nilai= nilai-25;
                           System.out.println("nilai nya : "+nilai);
                      }
                    System.out.println("===================================================");
                  break;
                  case 2:
                      int nilaii=100;
                  System.out.println("======Soal waduh======================================="); 
                  String Pertanyaan11="20/4+6 =";
                  String Pertanyaan12="81/2+6x4 =";
                  String Pertanyaan13="Apakah processor dalam komputer/laptop itu penting?";
                  String Pertanyaan14="Apakah angka ke kiri akan menghasilkan bilangan negatif?";
                      System.out.print(Pertanyaan11);
                      String j5=input.next( ); 
                      if(j5.equalsIgnoreCase("11")){
                          System.out.println("Mantap kereen euyyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benarnya adalah 11");
                          nilaii= nilaii-25;
                          System.out.println("nilai nya : "+nilaii);  
                      }
                      System.out.print(Pertanyaan12);
                      String j6=input.next( );
                      if(j6.equalsIgnoreCase("64,5")){
                          System.out.println("Mantap kereeen euyyyy");
                      }else{
                       System.out.println("pfft salah cuy, jawaban yang benarnya adalah 64,5 dikarenakan ada pembagian dan perkalian lalu ditambahkan kedua nya");
                       nilaii= nilaii-25;   
                       System.out.println("nilai nya : "+nilaii); 
                      }
                      System.out.print(Pertanyaan13);
                      String j7=input.next( );
                      if(j7.equalsIgnoreCase("iya karena itu bagian dari intinya")){
                          System.out.println("Mantap kereen euyyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benarnya adalah iya karena itu bagian dari intinya ");
                          nilaii= nilaii-25;
                          System.out.println("nilai nya : "+nilaii); 
                      }
                      System.out.print(Pertanyaan14);
                      String j8= input.next( );
                      if(j8.equalsIgnoreCase("iyaa")){
                          System.out.println("mantapp kereeen euyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benar adalah iyaaa"); 
                          nilaii= nilaii-25;
                          System.out.println("nilai nya : "+nilaii); 
                      }
                  break;
                  
                  default :
                  System.out.println("Pilihan kategori soal tidak ada lagi"); 
            } 
                 
            }else{
          System.out.println("Kategori_Soal ");
          System.out.println("->"+ Kategori_Soal); 
          
         String SoalAtTop = Kategori_Soal.pop();   
         System.out.println(" -> " + SoalAtTop + "\n");
            }   
            System.out.println("Apakah ingin memasukan peserta ?");
            String pilih2= input.next();
            if(pilih2.equalsIgnoreCase("iya")){
                System.out.println("Masukan nama :");
                String maqqa= input.next( );
                System.out.println("=======Kategori Soal=============");
            System.out.println("1. Soal ez (Mudah)");
            System.out.println("2. Soal biasa(Medium) ");
            System.out.println("============================"); 
            System.out.println("Note :"+"untuk soal Predator(Nightmare) itu tidak dicantum di pilihan akan tetapi akan muncul ketika tidak mengganti kategori soal :) ");
            Stack<String>Kategori_Soall= new Stack<>();  
         Kategori_Soall.add("Soal ez");
         Kategori_Soall.add("Soal biasa");
         Kategori_Soall.add("Soal predator");   
         System.out.println("Apakah ingin mengganti soal yang pilih ?");
            String pilihh= input.next( );  
            
            if(pilihh.equalsIgnoreCase("iya")){   
                System.out.print("Silahkan memilih kategori soal dengan angka :"); 
                int m=input.nextInt( ); 
                 switch(m) { 
                case 1 :
                    int nilais=100;
                  System.out.println("======Soal mudah=======================================");
                    String Pertanyaan1= "8+2 =";
                    String Pertanyaan2= "8+3 =";
                    String Pertanyaan3= "Apakah kamu punya balon 5 ?";
                    String Pertanyaan4= "IPA singkatan dari ?";
                    System.out.print(Pertanyaan1);
                     String j1= input.next( );
                     if(j1.equalsIgnoreCase("10")){
                         System.out.println("Mantap kereen euyyyy"); 
                     }else{
                         System.out.println("pfft salah cuy, jawaban benar nya adalah 10");
                         nilais= nilais-25; 
                     }
                      System.out.println("nilai nya : "+nilais);
                     System.out.print(Pertanyaan2);
                     String j2= input.next( );
                     if(j2.equalsIgnoreCase("11")){
                         System.out.println(" Mantap kereeen euyyyy");
                     }else{
                         System.out.println("pfft salah cuy,  jawaban benar nya adalah 11");
                         nilais= nilais-25;
                         System.out.println("nilai nya : "+nilais);  
                     }
                     System.out.print(Pertanyaan3);
                     String j3= input.next( );
                     if(j3.equalsIgnoreCase("punya_rupa-rupa_warnanya")){
                         System.out.println("Mantap kereeen euyyyy");
                     }else{
                         System.out.println("pfft salah cuy, jawaban benar nya adalah punya_rupa-rupa_warnanya"); 
                         nilais= nilais-25;
                         System.out.println("nilai nya : "+nilais); 
                     }
                      System.out.print(Pertanyaan4);
                      String j4=input.next( );
                      if(j4.equalsIgnoreCase("ilmu_pengetahuan_alam")){
                          System.out.println("Mantap kereeen euyyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban benarnya adalah ilmu_pengetahuan_alam");
                          nilais= nilais-25;
                          System.out.println("nilai nya : "+nilais);  
                      } 
                    System.out.println("===================================================");
                  break;
                  case 2:
                      int nilai3=100;
                  System.out.println("======Soal waduh======================================="); 
                  String Pertanyaan11="20/4+6 =";
                  String Pertanyaan12="81/2+6x4 =";
                  String Pertanyaan13="Apakah processor dalam komputer/laptop itu penting?";
                  String Pertanyaan14="Apakah angka ke kiri akan menghasilkan bilangan negatif?";
                      System.out.print(Pertanyaan11);
                      String j5=input.next( ); 
                      if(j5.equalsIgnoreCase("11")){
                          System.out.println("Mantap kereen euyyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benarnya adalah 11");
                          nilai3= nilai3-25;
                          System.out.println("nilai nya : "+nilai3);   
                      }
                      System.out.print(Pertanyaan12);
                      String j6=input.next( );
                      if(j6.equalsIgnoreCase("64,5")){
                          System.out.println("Mantap kereeen euyyyy");
                      }else{
                         System.out.println("pfft salah cuy, jawaban yang benarnya adalah 64,5 dikarenakan ada pembagian dan perkalian lalu ditambahkan kedua nya");
                         nilai3= nilai3-25;
                         System.out.println("nilai nya : "+nilai3);  
                      }
                      System.out.print(Pertanyaan13);
                      String j7=input.next( );
                      if(j7.equalsIgnoreCase("iya karena itu bagian dari intinya")){
                          System.out.println("Mantap kereen euyyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benarnya adalah iya karena itu bagian dari intinya ");
                          nilai3= nilai3-25;
                          System.out.println("nilai nya : "+nilai3);  
                      }
                      System.out.print(Pertanyaan14);
                      String j8= input.next( );
                      if(j8.equalsIgnoreCase("iyaa")){
                          System.out.println("mantapp kereeen euyyy");
                      }else{
                          System.out.println("pfft salah cuy, jawaban yang benar adalah iyaaa"); 
                          nilai3= nilai3-25;
                          System.out.println("nilai nya : "+nilai3);  
                      }  
                  break;
                  
                  default :
                  System.out.println("Pilihan kategori soal tidak ada lagi"); 
            } 
                  }else{
          System.out.println("Kategori_Soal ");
          System.out.println("->"+ Kategori_Soal); 
          
         String SoalAtTop = Kategori_Soal.pop();   
         System.out.println(" -> " + SoalAtTop + "\n");
            }   
 
            }else{
                System.out.println(" "); 
            } 
            System.out.print("Apakah sudah selesai ?");
            String p1= input.next( );
            if(p1.equalsIgnoreCase("sudah")){
                System.out.println("Masukan jumlah peserta :");
                int number= input.nextInt( );
                for(int u=0; u<number; u++){
                     System.out.print("Masukan nama   :");
                String an= input.next( );
                }
//                System.out.print("Masukan jawaban yang bisa dijawab : ");  
//                int ss= input.nextInt( ); 
//                for(int ap=0; ap<ss; ap++){ 
//                    System.out.println(" Jawaban soal "+(ap+1)+" :"); 
//                    String pn= input.next( );  
//                    System.out.println("===========================");
//                    System.out.println("      Jawaban peserta                                     ");
//                    System.out.println(pn); 
//                    System.out.println("==========================="); 
//                } 
                System.out.println("Tampilkan peserta"); 
                for(Mahasiswa siswa : people){
                    System.out.println("Nama :"+siswa.nama);     
                }
//                if(S > 90){
//             System.out.println("Selamat ya kamu hebat banget deh <3");
//          }else if(S < 80){
//              System.out.println("lumayan nanti mh serang lagi dengan tepat ya :) ");
//          }else if(S > 70){ 
//              System.out.println("Yahhh coba lagi ya! |:) "); 
//          } else if(S < 60){ 
//              System.out.println("Lu ga  ngapalin ya hmm  /:| "); 
//          }else{
//              System.out.println("Ngapain aja dari tadi ngerjain ngasal mulu aku kecewa tau :( "); 
//          }  
            }else{
//                System.out.println(" "); 
//            System.out.println("mau melihat peringkat ?");
//                String ra= input.next( );
//                if(ra.equalsIgnoreCase("iya")){
//                    System.out.println("===================================================");
//                    System.out.println("Peringkat Quiz");
////                    Queue<String>P=new PriorityQueue<>( );
//                    
//                    
//                    System.out.println("1)"+nama);
//                    System.out.println("2)"+nama);
//                    System.out.println("3)"+nama); 
//                }else{
//                    System.out.println(" ");
//                }       
          Scanner n= new Scanner(System.in); 
//        System.out.println("apakah ingin soal predator untuk peserta lain? ");
//        String ngy=  n.next( );
//        if(ngy.equalsIgnoreCase("iya")){ 
//            System.out.println("================= SOAL PREDATOR ======================================="); 
//            String[ ]Pertanyaan={"/2x^2dx =", "/1dx =", "apakah kamu manusia?", "hal yang kamu ingat saat tidur? "};
//            String[ ]Jawaban={"2/3^3x+c","1x+c","iya","bermimpi"};
//            int score=0;
//            for(int i=0; i<Pertanyaan.length; i++){
//                System.out.println(Pertanyaan[i]);
//                String PenggunaJawab= n.nextLine();
//                if(PenggunaJawab.equalsIgnoreCase(Jawaban[i])){
//                    System.out.println("Mantap keren euy");
//                    score++;
//                }else{
//                    System.out.println("Sayang sekali bung/neng");
//                    System.out.println("Jawaban yang benar adalah :"+" "+Jawaban[i]);
//                } 
//                System.out.println("Score anda :"+score + "/"+ Pertanyaan.length); 
//            }
//            record Soaln(String PenggunaJawab){}   
//            System.out.print("masukan jumlah soal :");
//            int Jawab= n.nextInt( );
//            //LINKEDLIST//
//            LinkedList<Soaln>newb= new LinkedList<>( );
//            for(int aa=0; aa<Jawab; aa++){
//                System.out.print("Jawaban soal  "+(aa+1)+":");
//                String PenggunaJawab= n.next( );
//                Soaln nzw= new Soaln(PenggunaJawab);
//                newb.add(nzw);
//            } 
//            System.out.println("=================");
//            System.out.println(" Jawaban Peserta   ");
//            System.out.println("=================");
//            for(Soaln nzw : newb){
//                System.out.println("Jawaban :"+nzw.PenggunaJawab( )); 
//            }
//        }else{
//            System.out.println("Hati-hati ada jebakan  :"); 
//            String mmn= input.next( );  
//        } 
          System.out.println("=======SOAL PREDATOR=================== - "); 
       
        String[ ]Pertanyaan= {"/7xdx = ", "8dx+2dx? ", "berapa angka yang belum diketahui? ","Random access memory singkatan nya?"};  
        String[ ]Jawaban= {"7", "10", "0","Ram"} ;     
        int score= 0;
        int nilai= 100;
        for(int i=0; i<Pertanyaan.length; i++){
            System.out.println(Pertanyaan[i]);
            String PenggunaJawab= n.nextLine(); 
            if(PenggunaJawab.equalsIgnoreCase(Jawaban[i])){
                System.out.println("Mantap Kereeen euy");
                score++; 
            }else{
                System.out.println("Sayang sekali bung/neng"); 
                System.out.println(" jawaban yang benar adalah :"+" "+Jawaban[i]); 
                nilai= nilai-25; 
            } 
            
           System.out.println("Score anda: "+ score + "/" + Pertanyaan.length);   
            System.out.println("nilai nya : "+nilai);  
        }
         
         
//       record Soaln(String PenggunaJawab){}   
      Scanner in= new Scanner(System.in);
//        System.out.print("masukan jumlah soal :");  
//        int Jawab= in.nextInt(); 
//        //LINKEDLIST// 
//        LinkedList<Soaln> bnew= new LinkedList<>();
//        System.out.print("Masukan jumlah peserta :"); 
//        int namaa= in.nextInt(); 
//        for(int cb=0; cb<namaa; cb++){
//            System.out.print("Masukan nama "+(cb+1)+":");  
//        String name= in.next();  
//        }
//      
//        for(int i=0; i<Jawab; i++){  
//            System.out.print("Jawaban soal"+(i+1)+":");   
//            String PenggunaJawab= in.next(); 
//        Soaln nz= new Soaln(PenggunaJawab);   
//         bnew.add(nz);  
//        } 
//         System.out.println("===============");
//         System.out.println("Jawaban Peserta ");  
//         System.out.println("=============="); 
//         for(Soaln nz: bnew){
//            System.out.println("Jawaban :"+nz.PenggunaJawab());   
//          } 
//         System.out.println("==================="); 
//         
//         System.out.println("Apakah ada peserta lagi ?");
//        String nm23= in.next( );
//        if(nm23.equalsIgnoreCase("ada")){
//            LinkedList<Soaln> bnewa= new LinkedList<>( ); 
//            System.out.println("Masukan jumlah soal :");
//        int Jawaba= in.nextInt( );
//        for(int o=0; o<Jawaba; o++){
//            System.out.println("Jawaban soal"+(o+1)+":");
//            String PenggunaJawab= in.next( );
//            Soaln nzw= new Soaln(PenggunaJawab);
//            bnewa.add(nzw); 
//        } 
//        System.out.println("===============");
//         System.out.println("Jawaban Peserta Lain ");   
//         System.out.println("=============="); 
//          for(Soaln nzw: bnewa){ 
//            System.out.println("Jawaban :"+nzw.PenggunaJawab());   
//          }
//            System.out.println("===========================");
//        }else{
//            System.out.println("-----------^______^--------------------------------"); 
//        }  
        System.out.println("==============================="); 
         record Siswa(String namee, int peringkat){ } 
         //QUEUE// <-> 
           Queue<Siswa> Mo= new LinkedList<>();
           Mo.addAll(Mo);
           System.out.print("Masukan jumlah peserta :");
           int num1= in.nextInt( );
           Siswa[ ]miswa= new Siswa[num1];
           for(int ii=0; ii<num1; ii++){
              System.out.println("Masukan nama :"); 
           String namee = in.next( );  
               int peringkat= ii+1;  
               Siswa siswas= new Siswa(namee,peringkat);  
               miswa[ii]= new Siswa(namee,peringkat); 
           }
           System.out.println("Tampilkan peserta"); 
           System.out.println("=============================="); 
            for(Siswa siswa : miswa){
            System.out.println("Name :"+siswa.namee( ));      
            }      
           System.out.println("==============================");  
//           if(nilai > 90){  
//             System.out.println("Selamat ya kamu hebat banget deh <3");
//          }else if(nilai < 80){ 
//              System.out.println("lumayan nanti mh serang lagi dengan tepat ya :) ");
//          }else if(nilai < 70){ 
//              System.out.println("Yahhh coba lagi ya! |:) "); 
//          } else if(nilai < 60){   
//              System.out.println("Lu ga  ngapalin ya hmm  /:| "); 
//          }else{
//              System.out.println("Ngapain aja dari tadi ngerjain ngasal mulu aku kecewa tau :( ");  
//          }  
                
                System.out.println("mau melihat peringkat ?");
                String r= n.next( );
                if(r.equalsIgnoreCase("iya")){
                    System.out.println("===================================================");
                     System.out.println("Masukan jumlah peserta :");
                     int num3= in.nextInt( );
                     Siswa[ ]miswas= new Siswa[num3];
                   for(int c=0; c<num3; c++){ 
                       System.out.print("Masukan nama :");
                       String namee= in.next( ); 
                       int peringkat= c+1;
                       miswas[c]= new Siswa(namee,peringkat); 
                   }  
                   System.out.println("===================================================");
                       System.out.println("Peringkat Quiz");
                   System.out.println("==================================================="); 
                       for(Siswa siswa : miswas){
                       System.out.println("Peringkat ke-"+siswa.peringkat( )+" "+"Nama : "+siswa.namee( ));    
                       }
                    System.out.println("==================================================="); 
                }else{
                    System.out.println(" --Not  ^__^ Found--"); 
                }
                
//              System.out.println("->"+nilai+bnil);      
//        System.out.println("->"+Omi); 
//        for(Soal so : ss){
//            System.out.println("Kode :"+so.kode+" "+ "nama : "+so.nama+" "+ "nomor_soal :"+so.nomor_soal);   
//        }
//        System.out.println("");
//        
//        Stack<Soal> raksoal= new Stack<>();
//        for(int i=0; i<ss.length; i++){
//            raksoal.push(ss[i]); 
//        }
//        
//        PriorityQueue<Mahasiswa> antriansoal= new PriorityQueue<>(Comparator.comparingInt(Mahasiswa::nim)); 
//        for(int i=0; i<listMahasiswa.length; i++){
//            antriansoal.add(listMahasiswa[i]); 
//        }
//        
//        LinkedList<Soal> Kategori_soal= new LinkedList<>();  
//           while(!antriansoal.isEmpty()){
//               
//           }
            } 
            System.out.println("Apakah ingin melihat peringkat di soal mudah kamu?");
            String nmao= input.next( ); 
            if(nmao.equalsIgnoreCase("iya")){
             System.out.print("Shapplah ");
                }else{
                System.out.println("-------------^ _________ ^----------------");  
            } 
                //SORTING COLLECTION//  
                record Mahasiswas(String nameq){ }
            System.out.println("mau atau tidak melihat peringkat mudah?");
                String r= input.next( );
                 List<Integer> pnil=  new ArrayList<>(); 
                   pnil.add(0);
                   pnil.add(25); 
                   pnil.add(50);
                   pnil.add(75);
                   pnil.add(100); 
                   Collections.sort(pnil, Collections.reverseOrder());  
                   for(int c=0; c<pnil.size(); c++){
                       int Peringkat= c+1;
                   } 
                   System.out.print("Masukan jumlah peserta :");
                   int nbw1= input.nextInt( );
                   Mahasiswas[ ]siswaw=new Mahasiswas[nbw1];
                   for(int mna=0; mna<nbw1; mna++){
                       System.out.print("masukan nama :");
                       String nameq= input.next( );
                       siswaw[mna]= new Mahasiswas(nameq); 
                   }
                if(r.equalsIgnoreCase("iya")){
                    System.out.println("==============Mudah================================");
                    System.out.println("Peringkat Quiz");
                    for(Mahasiswas siswae : siswaw){
                       for(int c=0; c<pnil.size(); c++){ 
                       int Peringkat= c+1; 
                    System.out.println("Peringkat ke-"+Peringkat+"Nama :"+siswae.nameq( )+" "+"Nilai :"+pnil.get(c));    
                       }
                }  
                   
                }else{
                    System.out.println(" ");
                }
                System.out.print("Apakah ingin melihat peringkat waduh kamu?");
                String nm12= input.next( );
                if(nm12.equalsIgnoreCase("iya")){
                    System.out.print("Ok gass");
                }else{
                    System.out.println(" "); 
                }
                
                 System.out.print("mau atau tidak melihat peringkat waduh?");  
                String ra= input.next( );
                 List<Integer> pnila=  new ArrayList<>();
                   pnila.add(0); 
                   pnila.add(25); 
                   pnila.add(50);
                   pnila.add(75);
                   pnila.add(100); 
                   Collections.sort(pnila, Collections.reverseOrder());   
                   for(int c=0; c<pnil.size(); c++){
                       int Peringkat= c+1;  
                   }
                if(ra.equalsIgnoreCase("iya")){ 
                    System.out.println("==============waduh================================");
                    System.out.println("Peringkat Quiz"); 
                   for(Mahasiswas siswae : siswaw){ 
                       for(int c=0; c<pnila.size(); c++){  
                       int Peringkat= c+1;
                    System.out.println("Peringkat ke-"+Peringkat+"Nama :"+siswae.nameq( )+" "+"Nilai :"+pnila.get(c));  
                       } 
                }
                }else{
                    System.out.println("----------^___: 3_____^------------------------- ");  
                } 
     System.out.println("Apakah ingin quiz lagi? ");  
    String mn= input.next();  
     
    if(!mn.equalsIgnoreCase("iya")){
        System.out.println(" ");  
        break;             
    }       
    }  
    } 
    }   
    
 