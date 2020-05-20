import java.util.Scanner;

class exercise {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input nama anda: ");
        String inputName = scanner.nextLine();
    
        System.out.print("Input umur anda: ");
        byte inputUmur = scanner.nextByte();

        System.out.print("Input tempat tinggal anda: ");
        scanner.nextLine();
        String inputTempatTinggal = scanner.nextLine();

        System.out.print("Input tahun lahir anda: ");
        int inputTahunLahir = scanner.nextInt();

      
        System.out.println(
            "Nama anda adalah " + inputName + ", berumur " + inputUmur + " tahun" +
            ", tempat tinggal di " + inputTempatTinggal + ", lahir tahun " + inputTahunLahir);

        
      

    }   
}