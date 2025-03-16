public class Main {
    public static void main(String[]args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110385";
        rekening2.nomorRekening = "202410370110555";

        rekening1.namaPemilik = "Elthaf";
        rekening2.namaPemilik = "Alex";

        rekening1.saldo = 300000.0;
        rekening2.saldo = 500000.0;

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}
