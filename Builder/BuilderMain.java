

public class BuilderMain {
    public static void main(String[] args) {
        Computador computador = new ComputadorBuilder("ASUS", "Intel i5 7500")
                .setGPU("NVIDIA GeForce GTX 1050 ti")
                .setRAM(8)
                .setStorage(1000)
                .build();
                System.out.println("--------------Peças do computador--------------");
                System.out.println("Placa-mãe: " + computador.getMotherboard());
                System.out.println("CPU: " + computador.getCpu());
                System.out.println("GPU: " + computador.getGpu());
                System.out.println("RAM: " + computador.getRam() + " GB");
                System.out.println("Armazenamento: " + computador.getStorage() + " GB");
    }

}
