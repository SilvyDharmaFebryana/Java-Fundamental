package OOP.src;

public class Menu {

	public static void tambahBuah () {
	
	    while (true) {
	
	        String inputBuah = Console.readInputString("Nama Buah: ");
	        int inputHarga = (int) Console.readInputNumber("Harga Buah: ");
	        int inputStock = (int) Console.readInputNumber("Stock Buah: ");
	
	        Buah buah = new Buah(inputBuah, inputHarga, inputStock);
	
	        App.listBuah.add(buah);
	
	        System.out.println("Repeat? (y/n)");
	        String option = App.scanner.next();
	        if (option.equalsIgnoreCase("N")) {
	            break;
	        }
	    }
	}

	public static void tampilListBuah () {
	    System.out.println("========= BUAH =========");
	    for (int i = 0; i < App.listBuah.size(); i++) {
	        System.out.println((i +1) + ". " + App.listBuah.get(i).getNamaBuah() + " || " + App.listBuah.get(i).getHarga() + " || " + App.listBuah.get(i).getStock()); 
        }
        System.out.println("========================");
	}
    
}